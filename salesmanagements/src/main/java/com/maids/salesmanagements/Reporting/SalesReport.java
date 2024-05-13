package com.maids.salesmanagements.Reporting;

import java.util.List;

public class SalesReport {
    private int totalSales;
    private double totalRevenue;
    private List<String> topSellingProducts;
    private List<String> topPerformingSellers;

    // Constructors, getters, and setters


    public SalesReport() {
    }

    public SalesReport(int totalSales, double totalRevenue, List<String> topSellingProducts, List<String> topPerformingSellers) {
        this.totalSales = totalSales;
        this.totalRevenue = totalRevenue;
        this.topSellingProducts = topSellingProducts;
        this.topPerformingSellers = topPerformingSellers;
    }

    public int getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(int totalSales) {
        this.totalSales = totalSales;
    }

    public double getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(double totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    public List<String> getTopSellingProducts() {
        return topSellingProducts;
    }

    public void setTopSellingProducts(List<String> topSellingProducts) {
        this.topSellingProducts = topSellingProducts;
    }

    public List<String> getTopPerformingSellers() {
        return topPerformingSellers;
    }

    public void setTopPerformingSellers(List<String> topPerformingSellers) {
        this.topPerformingSellers = topPerformingSellers;
    }

    @Override
    public String toString() {
        return "SalesReport{" +
                "totalSales=" + totalSales +
                ", totalRevenue=" + totalRevenue +
                ", topSellingProducts=" + topSellingProducts +
                ", topPerformingSellers=" + topPerformingSellers +
                '}';
    }
}