package warehouse.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public final class Product implements Sellable{

    private final String id;
    private final String name;
    private final Category category;
    private final BigDecimal price;
    private final int quantity;
    private final LocalDate registrationDate;

    Product(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.category = builder.category;
        this.price = builder.price;
        this.quantity = builder.quantity;
        this.registrationDate = builder.registrationDate;
    }

    private Product(String id,
                   String name,
                   Category category,
                   BigDecimal price,
                   int quantity,
                   LocalDate registrationDate) {

        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
        this.registrationDate = registrationDate;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Category getCategory() {
        return category;
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }


    public static class Builder {

        private String id;
        private String name;
        private Category category;
        private BigDecimal price;
        private int quantity;
        private LocalDate registrationDate;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder category(Category category) {
            this.category = category;
            return this;
        }

        public Builder price(BigDecimal price) {
            this.price = price;
            return this;
        }

        public Builder quantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder registrationDate(LocalDate registrationDate) {
            this.registrationDate = registrationDate;
            return this;
        }
        public Product build() {
            return new Product(this);
        }
    }
}