package bco.romannumerals;

public class RomanI extends RomanNumber {

  public static final String I = "I";

  @Override
  public String letter() {
    return I;
  }

  @Override
  public int value() {
    return 1;
  }

  @Override
  public RomanNumber previousRomanNumber() {
    return null;
  }

  @Override
  public RomanNumber previousUnitRomanNumber() {
    return null;
  }

  @Override
  public String of(final int normalNumber) {
    if (this.isEqualsOrGreaterThan(normalNumber)) {
      return String.format("%s%s", letter(), this.of(normalNumber - this.value()));
    }
    return "";
  }
}
