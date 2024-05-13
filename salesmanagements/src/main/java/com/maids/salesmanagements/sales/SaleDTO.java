package com.maids.salesmanagements.sales;

import java.util.List;

public class SaleDTO {
    private String client;
    private String seller;
    private double total;
    private List<Transaction> transactions;

    // Getters and setters for the properties

    public static class Transaction {
        private String product;
        private int quantity;
        private double price;

        // Getters and setters for the properties

        public Transaction() {
        }

        public Transaction(String product, int quantity, double price) {
            this.product = product;
            this.quantity = quantity;
            this.price = price;
        }
    }
}