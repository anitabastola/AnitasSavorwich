package com.pluralsight;

import java.time.LocalDateTime;

public class Customer {
    private String customerName;
    private String orderNumber;
    private LocalDateTime orderDateTime;

    public Customer(String customerName, String orderNumber) {
        this.customerName = customerName;
        this.orderNumber = orderNumber;
        this.orderDateTime = LocalDateTime.now();
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public String getOrderDateTime() {
        return orderDateTime.toLocalDate().toString();
    }
}
