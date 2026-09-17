package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class DiscountDecoratorTest {
    Product laptop = new Product.Builder()
            .id("1")
            .name("Laptop")
            .category(Category.COMPUTERS)
            .price(BigDecimal.valueOf(1000))
            .quantity(12)
            .registrationDate(LocalDate.now())
            .build();

    DiscountDecorator discountedLaptop = new DiscountDecorator(laptop, 20);

    @Test
    @DisplayName("Normal price should be returned from the base product")
    void getNormalPrice() {
        assertEquals(BigDecimal.valueOf(1000).setScale(2), laptop.getPrice());
    }

    @Test
    @DisplayName("Discounted price should be returned from discountDecorated product")
    void getDiscountedPrice() {
        assertEquals(BigDecimal.valueOf(800).setScale(2), discountedLaptop.getPrice());
    }
}