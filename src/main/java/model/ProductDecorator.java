package model;


import java.math.BigDecimal;

public abstract class ProductDecorator implements Sellable {
    private final Sellable decoratedProduct;

    protected ProductDecorator(Sellable decoratedProduct) {
        this.decoratedProduct = decoratedProduct;
    }

    @Override
    public String getId() {
        return decoratedProduct.getId();
    }

    @Override
    public BigDecimal getPrice() {
        return decoratedProduct.getPrice();
    }

    @Override
    public String getName() {
        return decoratedProduct.getName();
    }

    @Override
    public Category getCategory() {
        return decoratedProduct.getCategory();
    }

    @Override
    public int getQuantity() {
        return decoratedProduct.getQuantity();
    }
}
