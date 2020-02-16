package model;

import java.util.ArrayList;
import java.util.List;

public class InputNoteBook {

  private List<Person> listPerson = new ArrayList<>();

  public List<Person> getListPerson() {
    return listPerson;
  }

  public void setListPerson(List<Person> listPerson) {
    this.listPerson = listPerson;
  }
}
