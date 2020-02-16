package model;

public class Model {

  private Person person;
  private InputNoteBook inputNoteBook = new InputNoteBook();

  public Person createPerson() {
    person = new Person();
    inputNoteBook.getListPerson().add(person);
    return person;
  }

  public Person getPerson() {
    return person;
  }
}
