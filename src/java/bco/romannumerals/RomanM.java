package bco.romannumerals;

public class RomanM extends RomanNumber {

  @Override
  public String letter() {
    return "M";
  }

  @Override
  public int value() {
    return 1000;
  }

  @Override
  public RomanNumber previousRomanNumber() {
    return new RomanD();
  }

  @Override
  public RomanNumber previousUnitRomanNumber() {
    return new RomanC();
  }
}
