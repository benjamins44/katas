package bco.romannumerals;

public class RomanX extends RomanNumber {

  @Override
  public String letter() {
    return "X";
  }

  @Override
  public int value() {
    return 10;
  }

  @Override
  public RomanNumber previousRomanNumber() {
    return new RomanV();
  }

  @Override
  public RomanNumber previousUnitRomanNumber() {
    return new RomanI();
  }
}
