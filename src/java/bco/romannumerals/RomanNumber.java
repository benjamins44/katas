package bco.romannumerals;

public abstract class RomanNumber {

  public abstract String letter();

  public abstract int value();

  public abstract RomanNumber previousRomanNumber();

  public abstract RomanNumber previousUnitRomanNumber();

  protected boolean isEqualsOrGreaterThan(final int valueToCompare) {
    return valueToCompare >= value();
  }

  public String of(final int normalNumber) {
    if (this.isEqualsOrGreaterThan(normalNumber)) {
      return String.format("%s%s", this.letter(), this.of(normalNumber - this.value()));
    }
    if (normalNumber >= this.value() - previousUnitRomanNumber().value()) {
      return String.format("%s%s%s", previousUnitRomanNumber().letter(), this.letter(),
          previousRomanNumber().of(
              normalNumber - this.value() + previousUnitRomanNumber().value()));
    }
    return String.format("%s", previousRomanNumber().of(normalNumber));
  }
}
