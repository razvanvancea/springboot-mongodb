package com.rv.springbootmongodb.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@Builder
public class Person {
    @Id
    @ApiModelProperty(value = "the person ID")
    private String id;
    @ApiModelProperty(value = "the first name")
    private String firstName;
    @ApiModelProperty(value = "the last name")
    private String lastName;
}
