package view;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class View {

  static String MESSAGES_BUNDLE_NAME = "messages";
  public static ResourceBundle bundle;

  public void printMessage(String message) {
    System.out.println(message);
  }

  public void checkCoutry() {
    Scanner sc = new Scanner(System.in);
    System.out.println(TextValue.INPUT_ORDER_COUNTRY);
    String text = sc.nextLine();
    switch (text) {
      case "ua":
        bundle = ResourceBundle.getBundle(
            MESSAGES_BUNDLE_NAME,
            new Locale("ua", "UA"));
        break;
      case "en":
        bundle = ResourceBundle.getBundle(
            MESSAGES_BUNDLE_NAME,
            new Locale("en", "US"));
        break;
      default:
        bundle = ResourceBundle.getBundle(
            MESSAGES_BUNDLE_NAME,
            new Locale("en", "US"));
        break;
    }
  }

  public String concatenationString(String... message) {
    StringBuilder concatString = new StringBuilder();
    for (String v : message) {
      concatString = concatString.append(v);
    }
    return new String(concatString);
  }

  public void printStringInput(String message) {
    System.out.println(bundle.getString(message));
  }

  public void printWrongStringInput(String message_Err, String message_In) {
    bundle.getString(message_Err);
    bundle.getString(message_In);
  }
}
