package com.mockcompany.webapp.service;

import com.mockcompany.webapp.data.ProductItemRepository;
import com.mockcompany.webapp.model.ProductItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;  // Keep only the necessary import

@Service
public class SearchService {

    // Since we're returning an empty list, the repository is no longer needed.
    // You can safely remove this field.
    private final ProductItemRepository productItemRepository;

    @Autowired
    public SearchService(ProductItemRepository productItemRepository) {
        this.productItemRepository = productItemRepository;
    }

    /**
     * This method now returns an empty list to simulate a failure in tests.
     */
    public Collection<ProductItem> search(String query) {
        // Always return an empty list to break the tests.
        return Collections.emptyList();
    }
}
