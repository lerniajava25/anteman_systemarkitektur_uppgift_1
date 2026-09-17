import model.Category;
import model.DiscountDecorator;
import model.Product;
import model.Sellable;

/**
 * Method main just to test and showcase
 * that Design Patterns Builder and
 * Decorator work, run it to see...
 * ------------------------------------------
 * Modifiers public and static are needed for
 * the main method to be accessible from the
 * command line. Otherwise, it can be removed
 */
public static void main() {
    Product laptop = new Product.Builder()
            .id("1")
            .name("Laptop")
            .price(BigDecimal.valueOf(1000))
            .category(Category.COMPUTERS)
            .quantity(10)
            .build();

    Sellable discountLaptop = new DiscountDecorator(laptop, 20);

    IO.println(laptop.getName() + " ordinary price: " + laptop.getPrice());
    IO.println(discountLaptop.getName() + " discounted price: " + discountLaptop.getPrice());


}
