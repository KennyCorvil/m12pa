// Name: Kenny Corvil
// Course: COP3330C
// Assignment: Module 12 Programming Assignment 4
// Date: 11/22/2026

package cart;

import product.Product;
import java.util.List;

public class BulkDiscountPricingStrategy implements PricingStrategy {
    private final int minItems;
    private final double discountRate;

    public BulkDiscountPricingStrategy(int minItems, double discountRate) {
        this.minItems = minItems;
        this.discountRate = discountRate;
    }

    @Override
    public double calculateTotal(List<Product> products) {
        double total = products.stream().mapToDouble(Product::getPrice).sum();
        if (products.size() >= minItems) {
            total -= total * discountRate;
        }
        return total;
    }
}
