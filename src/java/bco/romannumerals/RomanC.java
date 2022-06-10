package bco.romannumerals;

public class RomanC extends RomanNumber {

  @Override
  public String letter() {
    return "C";
  }

  @Override
  public int value() {
    return 100;
  }

  @Override
  public RomanNumber previousRomanNumber() {
    return new RomanL();
  }

  @Override
  public RomanNumber previousUnitRomanNumber() {
    return new RomanX();
  }
}
