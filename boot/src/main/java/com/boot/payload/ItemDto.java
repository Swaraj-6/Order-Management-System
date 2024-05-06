package com.boot.payload;

import com.boot.entity.Category;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ItemDto {
    private Integer item_id;
    @NotNull
    @NotEmpty
    private String item;
    @NotNull
    @NotEmpty
    private String code;
    @NotNull
    private Integer price;
}
