package service;

import dao.ProductDAO;
import model.Category;
import model.Product;

import java.sql.SQLException;
import java.util.ArrayList;

public class productService {
    private static final ProductDAO productDAO = new ProductDAO();

    public static ArrayList<Product> getProducts() {
        return productDAO.getAllProduct();
    }

    public static Product getProduct(int id) {
        return productDAO.getProduct(id);
    }

    public static boolean createProduct(Product product, int id_category) {
        return productDAO.createProduct(product, id_category);
    }

    public static boolean deleteProduct(int id) throws SQLException {
        return productDAO.deleteProduct(id);
    }

    public static boolean editProduct(Product product, int id_category) throws SQLException {
        return productDAO.updateProduct(product, id_category);
    }

    public static ArrayList<Category> getCategories() {
        return productDAO.getAllCategory();
    }
}
