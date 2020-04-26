package com.rv.springbootmongodb.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@Builder
public class Person {
    @Id
    private String id;
    private String firstName;
    private String lastName;
}
