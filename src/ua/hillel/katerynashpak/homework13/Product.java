package ua.hillel.katerynashpak.homework13;

import java.time.LocalDateTime;
import java.time.Year;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Product {
    private int id;
    private String type;
    private double price;
    private boolean discountApplicable;
    private LocalDateTime addDate;

    public Product(int id, String type, double price, boolean discountApplicable, LocalDateTime addDate) {
        this.id = id;
        this.type = type;
        this.price = price;
        this.discountApplicable = discountApplicable;
        this.addDate = addDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isDiscountApplicable() {
        return discountApplicable;
    }

    public void setDiscountApplicable(boolean discountApplicable) {
        this.discountApplicable = discountApplicable;
    }

    public LocalDateTime getAddDate() {
        return addDate;
    }

    public void setAddDate(LocalDateTime addDate) {
        this.addDate = addDate;
    }

    public static List<Product> getBooksOver250(List<Product> products) {
        return products.stream()
                .filter(p -> p.getType().equals("Book") && p.getPrice() > 250)
                .collect(Collectors.toList());
    }

    public static List<Product> getDiscountedBooks(List<Product> products) {
        return products.stream()
                .filter(p -> p.getType().equals("Book") && p.isDiscountApplicable())
                .peek(p -> p.setPrice(p.getPrice() * 0.9))
                .collect(Collectors.toList());
    }

    public static Product getCheapestBook(List<Product> products) {
        return products.stream()
                .filter(p -> p.getType().equals("Book"))
                .min(Comparator.comparing(Product::getPrice))
                .orElseThrow(() -> new RuntimeException("Product [category: Book] was not found"));
    }

    public static List<Product> getLastThreeProducts(List<Product> products) {
        return products.stream()
                .sorted(Comparator.comparing(Product::getAddDate).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }

    public static double calculateTotalValue(List<Product> products) {
        return products.stream()
                .filter(p -> p.getType().equals("Book") && p.getPrice() <= 75 && p.getAddDate().getYear() == Year.now().getValue())
                .mapToDouble(Product::getPrice)
                .sum();
    }

    public static Map<String, List<Product>> groupByType(List<Product> products) {
        return products.stream()
                .collect(Collectors.groupingBy(Product::getType));
    }


}

