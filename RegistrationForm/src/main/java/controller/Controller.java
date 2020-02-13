package controller;

import java.util.Scanner;
import view.TextValue;
import view.View;

public class Controller {

  private View view = new View();

  public Controller(View view) {
    this.view = view;
  }

  public Scanner getResult() {
    Scanner sc = new Scanner(System.in);
    return sc;
  }

  public void getUser() {
    view.checkCoutry(getResult());
    Scanner sc = getResult();
    view.printStringInput(TextValue.INPUT_NAME);
    String textname = sc.nextLine();
        view.printStringInput(TextValue.INPUT_SURNAME);
    String textsurname = sc.nextLine();
    System.out.println(textname);
    System.out.println(textsurname);
  }

}
