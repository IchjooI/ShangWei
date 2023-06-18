package com.example.swdemo2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Detail {
    @Id
    private Integer id;
    private String name;
    private String imgurl;
    private String palce;
    private String phone;
    private String content;
    private Integer regionid;
    private Integer options;
}
