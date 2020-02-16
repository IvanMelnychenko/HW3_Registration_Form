package controller;

public interface RegexForm {

  String NAME_ENG = "[A-Z][a-z]{2,20}";
  String NAME_UKR = "[А-ЯІЩЄҐЇ][а-ящєґ'ії]{2,20}";
  String SURNAME_ENG = "[A-Z][a-z]{2,20}";
  String SURNAME_UKR = "[А-ЯІЩЄҐЇ][а-ящєґ'ії]{2,20}";
  String NICKNAME = "[A-Za-z_0-9.]{2,20}";
  String PHONE_NUMBER = "(\\+380)[0-9]{9}";
  String HOME_PHONE_NUMBER = "(4)[0-9]{4}";
  String EMAIL = "[A-Za-z0-9._]{6,20}@[a-z]{2,10}\\.[a-z]{2,6}";
  String INDEX = "[0-9]{5}";
  String CITY_ENG = "[A-Z][a-z]{2,20}";
  String CITY_UKR = "[А-ЯІЩЄҐЇ][а-ящєґ'ії]+";
  String STREET_ENG = "[A-Z][a-z]{2,20}";
  String STREET_UKR = "[А-ЯІЩЄҐЇ][а-ящєґ'ії]{2,20}";
  String FLAT = "[0-9]{1,4}";
  String HOUSE_NUMBER = "[0-9]{1,3}";
}
