package services;

import models.Product;

import java.sql.ResultSet;
import java.sql.SQLException;
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

    public static List<Product> getProductsFromDB() throws SQLException {
        DBConnection db = new DBConnection();

        ResultSet result = db.executeSQL("SELECT name, price, image FROM products");

        List<Product> products = new ArrayList<>();

        while (result.next()) {
            Product product = new Product();
            product.setName( result.getString("name") );
            product.setPrice( result.getFloat("price") );
            product.setImage( result.getString("image") );

            products.add(product);
        }

        return products;
    }
}
