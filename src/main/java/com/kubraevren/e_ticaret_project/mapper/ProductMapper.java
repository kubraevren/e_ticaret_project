package com.kubraevren.e_ticaret_project.mapper;
import com.kubraevren.e_ticaret_project.dto.ProductDto;
import com.kubraevren.e_ticaret_project.dto.ProductDtoUI;
import com.kubraevren.e_ticaret_project.entities.ProductEntity;
import org.mapstruct.Mapper;
@Mapper(componentModel="spring")
public interface ProductMapper {
    ProductDto toDto(ProductEntity productEntity);

    ProductEntity toEntity(ProductDto productDto);

    ProductEntity toEntity(ProductDtoUI productDtoUI);
}
