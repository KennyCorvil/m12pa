// Name: Kenny Corvil
// Course: COP3330C
// Assignment: Module 12 Programming Assignment 4
// Date: 11/22/2026

package cart;

import product.Product;
import java.util.List;

public class RegularPricingStrategy implements PricingStrategy {
    @Override
    public double calculateTotal(List<Product> products) {
        return products.stream().mapToDouble(Product::getPrice).sum();
    }
}
