package com.example.swdemo2.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class RegionRepositoryTest {
    @Autowired
    private RegionRepository regionRepository;
    @Test
    void findAll(){
        System.out.println(regionRepository.findAll());
    }
}