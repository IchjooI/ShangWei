package com.example.swdemo2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Region {
    @Id
    private Integer id;
    private String name;
    private String imgurl;
    private String saying;
}
