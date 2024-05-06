package com.boot.controller;

import com.boot.payload.ApiResponse;
import com.boot.payload.OrderDto;
import com.boot.service.OrderService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/user/{userId}")
    public ResponseEntity<OrderDto> createOrder(@Valid @RequestBody OrderDto orderDto, @PathVariable Integer userId) {
        OrderDto createdOrder = this.orderService.createOrder(orderDto, userId);
        return new ResponseEntity<>(createdOrder, HttpStatus.CREATED);
    }

    @GetMapping("/{orderId}")
    public ResponseEntity<OrderDto> getOrderById(@PathVariable Integer orderId) {
        OrderDto orderDto = this.orderService.getOrderById(orderId);
        return new ResponseEntity<>(orderDto, HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<List<OrderDto>> getAllOrders() {
        return new ResponseEntity<>(this.orderService.getAllOrders(), HttpStatus.OK);
    }

    @PutMapping("/{orderId}")
    public ResponseEntity<OrderDto> updateOrder(@Valid @RequestBody OrderDto orderDto, @PathVariable Integer orderId) {
        return new ResponseEntity<>(this.orderService.updateOrder(orderDto, orderId), HttpStatus.OK);
    }

    @DeleteMapping("/{orderId}")
    public ResponseEntity<ApiResponse> deleteOrder(@PathVariable Integer orderId) {
        return new ResponseEntity<>(new ApiResponse("Order deleted successfully", true), HttpStatus.OK);
    }
}
