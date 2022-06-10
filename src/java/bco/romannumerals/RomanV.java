package bco.romannumerals;

public class RomanV extends RomanNumber {

  @Override
  public String letter() {
    return "V";
  }

  @Override
  public int value() {
    return 5;
  }

  @Override
  public RomanNumber previousRomanNumber() {
    return new RomanI();
  }

  @Override
  public RomanNumber previousUnitRomanNumber() {
    return new RomanI();
  }
}
