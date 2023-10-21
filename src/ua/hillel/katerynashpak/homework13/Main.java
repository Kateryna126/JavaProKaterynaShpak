package ua.hillel.katerynashpak.homework13;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import static ua.hillel.katerynashpak.homework13.Product.*;

public class Main {
    public static void main(String[] args) {

        Product p1 = new Product(1, "Book", 300, true, LocalDateTime.now());
        Product p2 = new Product(2, "Book", 200, true, LocalDateTime.now().minusDays(1));
        Product p3 = new Product(3, "Toy", 100, false, LocalDateTime.now().minusDays(2));
        Product p4 = new Product(4, "Book", 50, true, LocalDateTime.now().minusDays(3));
        Product p5 = new Product(5, "Book", 400, false, LocalDateTime.now().minusDays(4));

        List<Product> products = Arrays.asList(p1, p2, p3, p4, p5);

        System.out.println("Books with a price over 250: " + getBooksOver250(products));
        System.out.println("Books with a discount: " + getDiscountedBooks(products));
        System.out.println("Cheapest book: " + getCheapestBook(products));
        System.out.println("Last three products added: " + getLastThreeProducts(products));
        System.out.println("Total value of products: " + calculateTotalValue(products));
        System.out.println("Grouping products by type: " + groupByType(products));

    }
}
