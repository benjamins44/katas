package bco.romannumerals;

public class RomanL extends RomanNumber {

  @Override
  public String letter() {
    return "L";
  }

  @Override
  public int value() {
    return 50;
  }

  @Override
  public RomanNumber previousRomanNumber() {
    return new RomanX();
  }

  @Override
  public RomanNumber previousUnitRomanNumber() {
    return new RomanX();
  }
}
