package bco.romannumerals;

public class RomanD extends RomanNumber {

  @Override
  public String letter() {
    return "D";
  }

  @Override
  public int value() {
    return 500;
  }

  @Override
  public RomanNumber previousRomanNumber() {
    return new RomanC();
  }

  @Override
  public RomanNumber previousUnitRomanNumber() {
    return new RomanC();
  }
}
