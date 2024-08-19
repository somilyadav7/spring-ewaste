package com.DefaultResourceGroup_EUS.spring_ewaste.Controller;

import com.DefaultResourceGroup_EUS.spring_ewaste.Entity.Order;
import com.DefaultResourceGroup_EUS.spring_ewaste.Payload.OrderDto;
import com.DefaultResourceGroup_EUS.spring_ewaste.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/{username}")
    public Order createOrder(@PathVariable String username, @RequestBody OrderDto orderDto) {
        return orderService.createOrder(username, orderDto);
    }

    @GetMapping("/{username}")
    public List<Order> getOrdersByUsername(@PathVariable String username) {
        return orderService.getOrdersByUsername(username);
    }

    @GetMapping("/order/{id}")
    public Order getOrderById(@PathVariable String id) {
        return orderService.getOrderById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable String id) {
        orderService.deleteOrder(id);
    }

    @PutMapping("/{id}")
    public Order updateOrder(@PathVariable String id, @RequestBody OrderDto orderDto) {
        return orderService.updateOrder(id, orderDto);
    }

    @GetMapping("/all")
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }
}
