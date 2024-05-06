package com.boot.controller;

import com.boot.payload.ApiResponse;
import com.boot.payload.ItemDto;
import com.boot.service.ItemService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @PostMapping("/category/{categoryId}")
    public ResponseEntity<ItemDto> createItem(@Valid @RequestBody ItemDto itemDto, @PathVariable Integer categoryId) {
        ItemDto itemDtoCreated = this.itemService.createItem(itemDto, categoryId);
        return new ResponseEntity<>(itemDtoCreated, HttpStatus.CREATED);
    }

    @GetMapping("/category/{categoryId}")
    public ResponseEntity<List<ItemDto>> getItemByCategory(@PathVariable Integer categoryId) {
        List<ItemDto> itemDtoList = this.itemService.getItemByCategory(categoryId);
        return new ResponseEntity<>(itemDtoList, HttpStatus.OK);
    }

    @GetMapping("/search/{keyword}")
    public ResponseEntity<List<ItemDto>> search(@PathVariable String keyword) {
        List<ItemDto> itemDtoList = this.itemService.search(keyword);
        return new ResponseEntity<>(itemDtoList, HttpStatus.OK);
    }

    @GetMapping("/{itemId}")
    public ResponseEntity<ItemDto> getItemById(Integer itemId) {
        ItemDto itemDto = this.itemService.getItemById(itemId);
        return new ResponseEntity<>(itemDto, HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<List<ItemDto>> getAllItems() {
        List<ItemDto> itemDtoList = this.itemService.getAllItems();
        return new ResponseEntity<>(itemDtoList, HttpStatus.OK);
    }

    @PutMapping("/{itemId}")
    public ResponseEntity<ItemDto> updateItem(@Valid @RequestBody ItemDto itemDto, @PathVariable Integer itemId) {
        ItemDto itemDtoUpdated = this.itemService.updateItem(itemDto, itemId);
        return new ResponseEntity<>(itemDtoUpdated, HttpStatus.OK);
    }

    @DeleteMapping("/{itemId}")
    public ResponseEntity<ApiResponse> deleteItem(@PathVariable Integer itemId) {
        this.itemService.deleteItem(itemId);
        return new ResponseEntity<>(new ApiResponse("Deleted Successfully", true), HttpStatus.OK);
    }
}
