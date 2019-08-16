package com.practice.mongoProject.domain;

import lombok.Builder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@lombok.Data
@Builder
@Document
public class Data {
    @Id
    private String id;
    private String name;
    private int age;

    public Data(){}

    public Data(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
