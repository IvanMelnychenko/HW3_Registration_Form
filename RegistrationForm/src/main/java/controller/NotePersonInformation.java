package controller;

import static controller.RegexForm.CITY_ENG;
import static controller.RegexForm.CITY_UKR;
import static controller.RegexForm.EMAIL;
import static controller.RegexForm.FLAT;
import static controller.RegexForm.HOME_PHONE_NUMBER;
import static controller.RegexForm.HOUSE_NUMBER;
import static controller.RegexForm.INDEX;
import static controller.RegexForm.NAME_ENG;
import static controller.RegexForm.NAME_UKR;
import static controller.RegexForm.NICKNAME;
import static controller.RegexForm.PHONE_NUMBER;
import static controller.RegexForm.STREET_ENG;
import static controller.RegexForm.STREET_UKR;
import static controller.RegexForm.SURNAME_ENG;
import static controller.RegexForm.SURNAME_UKR;

import java.util.Scanner;
import model.Model;
import model.Person;
import view.TextValue;
import view.View;

public class NotePersonInformation {

  private View view;
  private Scanner sc;

  public NotePersonInformation(View view, Scanner sc) {
    this.view = view;
    this.sc = sc;
  }

  public void inputNote(Model model) {
    UtilityController utilityController = new UtilityController(sc, view);
    Person person = model.createPerson();
    view.checkCoutry();
    String name = (View.bundle.getLocale().toString()).equals("ua_UA") ? NAME_UKR : NAME_ENG;
    String surname = (View.bundle.getLocale().toString()).equals("ua_UA") ? SURNAME_UKR : SURNAME_ENG;
    String city = (View.bundle.getLocale().toString()).equals("ua_UA") ? CITY_UKR : CITY_ENG;
    String street = (View.bundle.getLocale().toString()).equals("ua_UA") ? STREET_UKR : STREET_ENG;
    person.setName(utilityController.inputStringValueWithScanner(TextValue.INPUT_NAME, name));
    person.setSurname(utilityController.inputStringValueWithScanner(TextValue.INPUT_SURNAME, surname));
    person.setNickname(utilityController.inputStringValueWithScanner(TextValue.INPUT_NICKNAME, NICKNAME));
    person.setPhone_Nmb(utilityController.inputStringValueWithScanner(TextValue.INPUT_PHONE_NUMBER, PHONE_NUMBER));
    person.setPhone_Nmb_House(
        utilityController.inputStringValueWithScanner(TextValue.INPUT_PHONE_NUMBER_HOME, HOME_PHONE_NUMBER));
    person.setIndex(utilityController.inputStringValueWithScanner(TextValue.INPUT_INDEX, INDEX));
    person.setEmail(utilityController.inputStringValueWithScanner(TextValue.INPUT_EMAIL, EMAIL));
    person.setCity(utilityController.inputStringValueWithScanner(TextValue.INPUT_CITY, city));
    person.setStreet(utilityController.inputStringValueWithScanner(TextValue.INPUT_STREET, street));
    person.setHouse_Number(utilityController.inputStringValueWithScanner(TextValue.INPUT_HOUSE_NUMBER, HOUSE_NUMBER));
    person.setNumber_Of_Flat(utilityController.inputStringValueWithScanner(TextValue.INPUT_FLAT, FLAT));
    person.setAddress(
        view.concatenationString(person.getIndex(), person.getCity(), person.getStreet(), person.getHouse_Number(),
            person.getNumber_Of_Flat()));
  }
}
