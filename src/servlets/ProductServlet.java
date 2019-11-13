package servlets;

import models.Product;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Product> products = new ArrayList<>();

        products.add(new Product("iPhone", 300000f, "https://salt.tikicdn.com/cache/w1200/ts/product/65/af/4a/7e9fbfeb44a9cb39e96a180ba4f1caca.jpg"));
        products.add(new Product("iPhone 2", 300000f, "https://salt.tikicdn.com/cache/w1200/ts/product/65/af/4a/7e9fbfeb44a9cb39e96a180ba4f1caca.jpg"));
        products.add(new Product("iPhone 3", 300000f, "https://salt.tikicdn.com/cache/w1200/ts/product/65/af/4a/7e9fbfeb44a9cb39e96a180ba4f1caca.jpg"));

        req.setAttribute("products", products);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("products.jsp");
        requestDispatcher.forward(req, resp);
    }
}
