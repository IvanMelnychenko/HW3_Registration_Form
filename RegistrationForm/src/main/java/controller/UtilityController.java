package controller;

import java.util.Scanner;
import view.TextValue;
import view.View;

public class UtilityController {

  private Scanner scanner;
  private View view;

  public UtilityController(Scanner scanner, View view) {
    this.scanner = scanner;
    this.view = view;
  }

  public String inputStringValueWithScanner(String message, String regex) {
    String res;
    view.printStringInput(message);
    while (!(scanner.hasNext() && (res = scanner.next()).matches(regex))) {
      view.printWrongStringInput(TextValue.WRONG_INPUT, message);
    }
    return res;
  }
}
