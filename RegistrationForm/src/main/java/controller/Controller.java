package controller;

import java.util.Scanner;
import model.Model;
import view.View;

public class Controller {

  private View view = new View();
  private Model model = new Model();

  public Controller(View view, Model model) {
    this.view = view;
    this.model = model;
  }

  public void getUser() {
    Scanner sc = new Scanner(System.in);
    NotePersonInformation notePersonInformation = new NotePersonInformation(view, sc);
    notePersonInformation.inputNote(model);
  }
}
