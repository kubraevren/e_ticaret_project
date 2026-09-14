package com.kubraevren.e_ticaret_project.controller;

import com.kubraevren.e_ticaret_project.dto.ProductDto;
import com.kubraevren.e_ticaret_project.dto.ProductDtoUI;
import com.kubraevren.e_ticaret_project.entities.ProductEntity;
import com.kubraevren.e_ticaret_project.mapper.ProductMapper;
import com.kubraevren.e_ticaret_project.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;
    private final ProductMapper productMapper;

    @PostMapping
    public ProductDto saveProduct(@RequestBody ProductDtoUI productDtoUI){
        return productService.saveProduct(productDtoUI);
    }

    @GetMapping(path = "list/{id}")
    public ProductDto getProductById(@PathVariable("id") String id){
        return productService.getProductById(id);
    }

    @PutMapping(path = "list/put/{id}")
    public ProductDto updateProduct(@PathVariable("id") String id, @RequestBody ProductDtoUI productDtoUI){
     return  productService.updateProduct(productDtoUI,id);
    }

    @DeleteMapping(path = "list/{id}")
    public void deleteProduct(@PathVariable("id") String id){
        productService.deleteProductById(id);
    }
}
