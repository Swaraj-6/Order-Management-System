package com.boot.payload;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {

    private Integer order_id;
    @NotEmpty
    private String status;
    @NotEmpty
    private String type;
    private Date time;
    @NotEmpty
    private String code;
    @NotEmpty
    private String quantity;
    @NotNull
    private Integer totalOrder;
}
