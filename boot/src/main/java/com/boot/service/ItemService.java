package com.boot.service;

import com.boot.payload.ItemDto;

import java.util.List;

public interface ItemService {

    ItemDto createItem(ItemDto itemDto, Integer category_id);

    ItemDto updateItem(ItemDto itemDto, Integer item_id);

    void deleteItem(Integer item_id);

    List<ItemDto> getAllItems();

    ItemDto getItemById(Integer item_id);

    List<ItemDto> getItemByCategory(Integer category_id);

    List<ItemDto> search(String keyword);
}
