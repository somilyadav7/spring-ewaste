package com.DefaultResourceGroup_EUS.spring_ewaste.Repository;

import com.DefaultResourceGroup_EUS.spring_ewaste.Entity.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface OrderRepository extends MongoRepository<Order, String> { // Change ObjectId to String
    List<Order> findByUsername(String username); // Find orders by username
    void deleteByUsername(String username); // Delete orders by username
}
