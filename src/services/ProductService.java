package services;

import models.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

    public static List<Product> getProducts() {
        List<Product> products = new ArrayList<>();

        products.add(new Product("iPhone", 300000f, "https://salt.tikicdn.com/cache/w1200/ts/product/65/af/4a/7e9fbfeb44a9cb39e96a180ba4f1caca.jpg"));
        products.add(new Product("iPhone 2", 300000f, "https://salt.tikicdn.com/cache/w1200/ts/product/65/af/4a/7e9fbfeb44a9cb39e96a180ba4f1caca.jpg"));
        products.add(new Product("iPhone 3", 300000f, "https://salt.tikicdn.com/cache/w1200/ts/product/65/af/4a/7e9fbfeb44a9cb39e96a180ba4f1caca.jpg"));

        return products;
    }
}
