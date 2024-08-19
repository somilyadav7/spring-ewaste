package com.DefaultResourceGroup_EUS.spring_ewaste.Entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "roles")
public class Role {

    @Id
    private String _id; // Change to String and use _id

    private String name;
}
