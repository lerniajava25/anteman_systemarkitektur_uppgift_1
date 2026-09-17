package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    Product laptop = new Product.Builder()
            .id("1")
            .name("Laptop")
            .category(Category.COMPUTERS)
            .price(BigDecimal.valueOf(1000))
            .quantity(12)
            .registrationDate(LocalDate.now())
            .build();

    @Test
    @DisplayName("should return id of product")
    void getId() {
        assertEquals("1", laptop.getId());
    }

    @Test
    @DisplayName("should return name of product")
    void getName() {
        assertEquals("Laptop", laptop.getName());
    }

    @Test
    @DisplayName("should return category enum of product")
    void getCategory() {
        assertEquals(Category.COMPUTERS, laptop.getCategory());
    }

    @Test
    @DisplayName("should return price of product")
    void getPrice() {
        assertEquals(BigDecimal.valueOf(1000).setScale(2), laptop.getPrice());
    }

    @Test
    @DisplayName("should return quantity of product")
    void getQuantity() {
        assertEquals(12, laptop.getQuantity());
    }

    @Test
    @DisplayName("should return registration date of product")
    void getRegistrationDate() {
        assertEquals(LocalDate.now(), laptop.getRegistrationDate());
    }
}