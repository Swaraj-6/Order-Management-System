package com.boot.service;

import com.boot.payload.OrderDto;

import java.util.List;

public interface OrderService {

    OrderDto createOrder(OrderDto orderDto, Integer userId);

    OrderDto updateOrder(OrderDto orderDto, Integer order_id);

    OrderDto getOrderById(Integer order_id);

    List<OrderDto> getAllOrders();

    void deleteOrder(Integer order_id);
}
