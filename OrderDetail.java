/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh3_15_05_23;

/**
 *
 * @author ADMIN
 */
public class OrderDetail {
    private int quantity;
    private Product product;

    public OrderDetail(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double calcTotalPrice() {
        return this.quantity * this.product.getPrice();
    }

    @Override
    public String toString() {
        return "OrderDetail [quantity=" + quantity + ", product=" + product + "]";
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}


  

