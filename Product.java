/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh3_15_05_23;

import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class Product {
    private String productID;
    private String description;
    private double price;

    public Product(String productID, String description, double price) {
        this.productID = productID;
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [productID=" + productID + ", description=" + description + ", price=" + price + "]";
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
