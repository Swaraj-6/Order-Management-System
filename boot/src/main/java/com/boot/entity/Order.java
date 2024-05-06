package com.boot.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "orderTable")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer order_id;

    private String status;
    private String type;
    private Date time;
    @Column(length = 1000)
    private String code;
    @Column(length = 1000)
    private String quantity;
    private Integer totalOrder;

    @ManyToOne
    @JoinColumn(name = "id")
    @JsonBackReference
    private User user;

}
