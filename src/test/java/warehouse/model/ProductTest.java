package warehouse.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Product Builder Test")
class ProductTest {

    private Product product;

    @BeforeEach
    void setUp() {
        product = new Product.Builder()
                .id("1")
                .name("Product 1")
                .category("Category 1")
                .price(BigDecimal.valueOf(10.00))
                .quantity(10)
                .registrationDate(LocalDate.now())
                .build();
    }

    @AfterEach
    void tearDown() {
        product = null;
    }

    @Test
    @DisplayName("Get Id")
    void getId() {
        assertNotNull(product.getId());
        assertEquals("1", product.getId());
    }

    @Test
    @DisplayName("Get Name")
    void getName() {
        assertNotNull(product.getName());
        assertEquals("Product 1", product.getName());
    }

    @Test
    @DisplayName("Get Category")
    void getCategory() {
        assertNotNull(product.getCategory());
        assertEquals("Category 1", product.getCategory());
    }

    @Test
    @DisplayName("Get Price")
    void getPrice() {
        BigDecimal priceToCheckWith = BigDecimal.valueOf(10.00);

        assertNotNull(product.getPrice());
        assertEquals(priceToCheckWith, product.getPrice());
    }

    @Test
    @DisplayName("Get Quantity")
    void getQuantity() {
        assertEquals(10, product.getQuantity());
    }

    @Test
    @DisplayName("Get Registration Date")
    void getRegistrationDate() {
        assertNotNull(product.getRegistrationDate());
        assertEquals(LocalDate.now(), product.getRegistrationDate());
    }
}