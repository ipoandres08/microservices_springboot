package com.microservices.productservice.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "product")
@Getter
@Setter
@NoArgsConstructor
public class ProductEntity {
    @Id
    private String id;
    private String name;
    private String description;
        private Double perUnitPrice;
}
