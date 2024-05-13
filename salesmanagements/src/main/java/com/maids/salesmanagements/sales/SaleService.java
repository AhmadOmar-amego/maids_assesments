package com.maids.salesmanagements.sales;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {
    private final SaleRepository saleRepository;

    @Autowired
    public SaleService(SaleRepository saleRepository) {
        this.saleRepository = saleRepository;
    }

    public List<Sale> getAllSales() {
        return saleRepository.findAll();
    }

    public void createSale(SaleDTO saleDTO) {
        Sale sale = new Sale();
        // Set the properties of the sale object based on the saleDTO
        // For example, sale.setClient(saleDTO.getClient());
        // ...
        saleRepository.save(sale);
    }

    @Transactional
    public void updateSale(Long saleId, SaleDTO saleDTO) {
        Sale sale = saleRepository.findById(saleId).orElseThrow(
                () -> new IllegalStateException("Sale with id " + saleId + " does not exist")
        );

        // Update the properties of the sale object based on the saleDTO
        // For example, sale.setClient(saleDTO.getClient());
        // ...

        saleRepository.save(sale);
    }
}