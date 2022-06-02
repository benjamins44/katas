package bco.guildedrose;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ProductTest {

  final String name = "name";
  final int sellIn = 20;
  final int quality = 20;

  @Test
  void updateQuality_discrease_quality_with_one_quantity() {
    final Product product = new Product(name, sellIn, quality);

    product.updateQuality();

    assertThat(product.quality).isEqualTo(quality - 1);
  }

  @Test
  void updateSellIn_discrease_sellIn_with_one_quantity() {
    final Product product = new Product(name, sellIn, quality);

    product.updateSellIn();

    assertThat(product.sellIn).isEqualTo(sellIn - 1);
  }

  @Test
  void updateQuality_can_not_discrease_quality_less_than_0() {
    final Product product = new Product(name, sellIn, 0);

    product.updateQuality();

    assertThat(product.quality).isZero();
  }

  @Test
  void updateQuality_can_not_have_negative_quality() {
    final Product product = new Product(name, sellIn, 0);

    product.updateQuality();

    assertThat(product.quality).isZero();
  }

  @Test
  void nextDay_update_quantity_after_sellIn() {
    final Product product = new Product(name, sellIn, quality);

    product.nextDay();

    assertThat(product.quality).isEqualTo(quality - 1);
  }

  @Test
  void nextDay_update_sellIn_before_quantity() {
    final Product product = new Product(name, sellIn, quality);

    product.nextDay();

    assertThat(product.sellIn).isEqualTo(sellIn - 1);
  }
}
