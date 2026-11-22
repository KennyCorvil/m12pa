// Name: Kenny Corvil
// Course: COP3330C
// Assignment: Module 12 Programming Assignment 4
// Date: 11/22/2026

package cart;

import product.Product;
import java.util.List;

public class DiscountPricingStrategy implements PricingStrategy {
    private final double discountRate;

    public DiscountPricingStrategy(double discountRate) {
        this.discountRate = discountRate;
    }

    @Override
    public double calculateTotal(List<Product> products) {
        double total = products.stream().mapToDouble(Product::getPrice).sum();
        return total - (total * discountRate);
    }
}
