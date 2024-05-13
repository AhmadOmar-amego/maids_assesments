package com.maids.salesmanagements.Reporting;

import com.maids.salesmanagements.sales.SaleRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class SalesReportService {
    private final SaleRepository saleRepository;

    public SalesReportService(SaleRepository saleRepository) {
        this.saleRepository = saleRepository;
    }

//    public SalesReport generateSalesReport(LocalDate startDate, LocalDate endDate) {
//        SalesReport report = new SalesReport();
//        report.setTotalSales(saleRepository.countSalesByDateRange(startDate, endDate));
//        report.setTotalRevenue(saleRepository.calculateTotalRevenueByDateRange(startDate, endDate));
//        report.setTopSellingProducts(saleRepository.findTopSellingProducts(startDate, endDate));
//        report.setTopPerformingSellers(saleRepository.findTopPerformingSellers(startDate, endDate));
//        return report;
//    }
}