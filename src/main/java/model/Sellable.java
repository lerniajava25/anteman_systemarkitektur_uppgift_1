package model;

import java.math.BigDecimal;

public interface Sellable {
    String getId();
    BigDecimal getPrice();
    String getName();
    Category getCategory();
    int getQuantity();
}
