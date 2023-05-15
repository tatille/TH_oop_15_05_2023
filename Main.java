/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh3_15_05_23;

/**
 *
 * @author ADMIN
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin đơn hàng
        System.out.print("Mã HD: ");
        int orderID = scanner.nextInt();
        scanner.nextLine(); // Đọc dòng mới sau khi nhập số nguyên

        System.out.print("Ngày Lập Hóa Đơn (dd-mm-yyyy): ");
        String orderDateString = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate orderDate = LocalDate.parse(orderDateString, formatter);

        // Tạo đơn hàng
        Order order = new Order(orderID, orderDate);

        // Nhập số lượng sản phẩm từ người dùng
        System.out.print("Số Lượng Sản Phẩm Muốn Xuất HD: ");
        int numOfProducts = scanner.nextInt();
        scanner.nextLine(); // Đọc dòng mới sau khi nhập số nguyên

        // Nhập thông tin sản phẩm và số lượng từ người dùng
        for (int i = 0; i < numOfProducts; i++) {
            System.out.println("Sản Phẩm " + (i + 1));
            System.out.print("Mã Sản Phẩm: ");
            String productID = scanner.nextLine();

            System.out.print("Mô Tả: ");
            String description = scanner.nextLine();

            System.out.print("Đơn Giá: ");
            double price = scanner.nextDouble();

            System.out.print("Số Lượng: ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // Đọc dòng mới sau khi nhập số nguyên

            // Tạo sản phẩm và thêm vào đơn hàng
            Product product = new Product(productID, description, price);
            order.addLineItem(product, quantity);
        }

        // Tính tổng tiền hóa đơn
        double totalCharge = order.calcTotalCharge();

        // In thông tin hóa đơn và chi tiết đơn hàng ra màn hình
        System.out.println("HÓA ĐƠN");
        System.out.println("Mã HD: " + order.getOrderID());
        System.out.println("Ngày lập hóa đơn: " + order.getOrderDate());
        System.out.println("Tổng tiền thanh toán: " + totalCharge + " VND");
        System.out.println("Tổng tiền thanh toán: " + totalCharge + " VND");
        System.out.println("STT  |  Mã SP | Mô tả                | Đơn giá  |Số lượng  |Thành tiền");

        ArrayList<OrderDetail> lineItems = order.getLineItems();
        for (int i = 0; i < lineItems.size(); i++) {
            OrderDetail lineItem = lineItems.get(i);
            Product product = lineItem.getProduct();
            int quantity = lineItem.getQuantity();
            double totalPrice = lineItem.calcTotalPrice();
            System.out.printf("%-4s | %-6s | %-20s | %-7s | %-8s | %-10s\n",
                    (i + 1), product.getProductID(), product.getDescription(),
                    product.getPrice(), quantity, totalPrice);
        }

        // Đóng Scanner
        scanner.close();
    }
}
