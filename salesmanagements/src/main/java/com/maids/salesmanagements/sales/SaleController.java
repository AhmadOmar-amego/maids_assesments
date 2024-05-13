package com.maids.salesmanagements.sales;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/sales")
public class SaleController {
    private final SaleService saleService;

    @Autowired
    public SaleController(SaleService saleService) {
        this.saleService = saleService;
    }

    @GetMapping
    public List<Sale> getAllSales() {
        return saleService.getAllSales();
    }

    @PostMapping
    public void createSale(@RequestBody SaleDTO saleDTO) {
        saleService.createSale(saleDTO);
    }

    @PutMapping(path = "{saleId}")
    public void updateSale(@PathVariable("saleId") Long saleId,
                           @RequestBody SaleDTO saleDTO) {
        saleService.updateSale(saleId, saleDTO);
    }
}