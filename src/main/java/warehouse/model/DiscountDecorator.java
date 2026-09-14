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
        BigDecimal price = discountedProduct.getPrice();
        BigDecimal discountDecimal = BigDecimal.valueOf(1 - discount/100);
        return price.multiply(discountDecimal);
    }
}
