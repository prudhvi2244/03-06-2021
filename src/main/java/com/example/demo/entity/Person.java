package com.example.demo.entity;

import java.io.Serializable;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDBTable(tableName = "person")
public class Person implements Serializable {
    @DynamoDBHashKey  (attributeName = "personId")
    @DynamoDBAutoGeneratedKey
    private String personId;
    @DynamoDBAttribute
    private String name;
    @DynamoDBAttribute
    private int age;
    @DynamoDBAttribute
    private String email;
    @DynamoDBAttribute
    private Address address;
}
