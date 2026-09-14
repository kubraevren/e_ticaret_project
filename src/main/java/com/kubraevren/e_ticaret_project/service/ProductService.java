package com.kubraevren.e_ticaret_project.service;

import com.kubraevren.e_ticaret_project.dto.ProductDto;
import com.kubraevren.e_ticaret_project.dto.ProductDtoUI;
import com.kubraevren.e_ticaret_project.entities.ProductEntity;
import com.kubraevren.e_ticaret_project.exception.BaseException;
import com.kubraevren.e_ticaret_project.exception.ErrorMessage;
import com.kubraevren.e_ticaret_project.exception.MessageType;
import com.kubraevren.e_ticaret_project.mapper.ProductMapper;
import com.kubraevren.e_ticaret_project.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public ProductDto saveProduct(ProductDtoUI  productDtoUI) {
        ProductEntity product = productMapper.toEntity(productDtoUI);

        ProductEntity product1 = productRepository.save(product);
        return productMapper.toDto(product1);
    }

    public ProductDto getProductById(String id) {

        Optional<ProductEntity> product= productRepository.findById(id);

        if(product.isEmpty()){
            throw new BaseException(new ErrorMessage(MessageType.NO_RECORD_EXIST,id.toString()));
        }
        return  productMapper.toDto(product.orElse(null));
    }


    }

