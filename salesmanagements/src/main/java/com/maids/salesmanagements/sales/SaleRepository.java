package com.maids.salesmanagements.sales;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {
//    @Query("SELECT COUNT(s) FROM Sale s WHERE s.creationDate >= :startDate AND s.creationDate <= :endDate")
//    int countSalesByDateRange(@Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate);
//
//    @Query("SELECT SUM(s.total) FROM Sale s WHERE s.creationDate >= :startDate AND s.creationDate <= :endDate")
//    double calculateTotalRevenueByDateRange(@Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate);
//
//    @Query("SELECT t.product.name FROM Sale s JOIN s.transactions t WHERE s.creationDate >= :startDate AND s.creationDate <= :endDate GROUP BY t.product.name ORDER BY SUM(t.quantity) DESC")
//    List<String> findTopSellingProducts(@Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate);
//
//    @Query("SELECT s.seller.name FROM Sale s WHERE s.creationDate >= :startDate AND s.creationDate <= :endDate GROUP BY s.seller.name ORDER BY COUNT(s) DESC")
//    List<String> findTopPerformingSellers(@Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate);

}

