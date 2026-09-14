package warehouse.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DiscountDecorator extends ProductDecorator {
    private final Sellable discountedProduct;
    private final double discount;

    public DiscountDecorator(Sellable discountedProduct, double discount) {
        super(discountedProduct);
        this.discountedProduct = discountedProduct;
        this.discount = discount;
    }

    @Override
    public BigDecimal getPrice() {
        BigDecimal price = discountedProduct.getPrice();
        BigDecimal discountDecimal = BigDecimal.ONE.subtract(
                BigDecimal.valueOf(discount).movePointLeft(2)
        );
        return price.multiply(discountDecimal).setScale(2, RoundingMode.HALF_UP);
    }
}
