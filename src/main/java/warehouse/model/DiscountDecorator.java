package warehouse.model;

import java.math.BigDecimal;

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
        double price = discountedProduct.getPrice().doubleValue();
        double discountDecimal = 1 - discount/100;
        return BigDecimal.valueOf(price * discountDecimal);
    }
}
