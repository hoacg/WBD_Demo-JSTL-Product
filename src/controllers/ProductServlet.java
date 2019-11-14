package controllers;

import models.Product;
import services.ProductService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ProductServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Product> products = ProductService.getProducts();

        req.setAttribute("danh_sach_san_pham", products);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("products.jsp");
        requestDispatcher.forward(req, resp);
    }
}
