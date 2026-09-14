package warehouse.model;

import java.math.BigDecimal;

public interface Sellable {
    String getId();
    BigDecimal getPrice();
    String getName();
    String getCategory();
    int getQuantity();
}
