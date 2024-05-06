package com.boot.payload;

import com.boot.entity.Item;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Setter
@Getter
public class CategoryDto {

    private Integer category_id;
    @NotEmpty
    @NotNull
    private String category_name;

    private List<Item> items = new ArrayList<>();
}
