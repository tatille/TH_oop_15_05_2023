/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh3_15_05_23;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ADMIN
 */

import java.time.LocalDate;

public class Order {
    private int orderID;
    private LocalDate orderDate;
    private ArrayList<OrderDetail> lineItems;
    public Order(int orderID, LocalDate orderDate) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.lineItems = new ArrayList<OrderDetail>();
    }

    public void addLineItem(Product product, int quantity) {
        OrderDetail lineItem = new OrderDetail(product, quantity);
        this.lineItems.add(lineItem);
    }

    public double calcTotalCharge() {
        double totalCharge = 0;
        for (OrderDetail lineItem : this.lineItems) {
            totalCharge += lineItem.calcTotalPrice();
        }
        return totalCharge;
    }

    @Override
    public String toString() {
        return "Order [orderID=" + orderID + ", orderDate=" + orderDate + ", lineItems=" + lineItems + "]";
    }

    public int getOrderID() {
        return orderID;
    }

    /**
     * @return
     */
    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public ArrayList<OrderDetail> getLineItems() {
        return lineItems;
    }
}