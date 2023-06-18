package com.example.swdemo2.controller;

import com.example.swdemo2.entity.Region;
import com.example.swdemo2.repository.RegionRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/region")
public class RegionHandler {
    @Autowired
    private RegionRepository regionRepository;
    @GetMapping("/findAll")
    public List<Region> findAll(){
        return regionRepository.findAll();
    }
}
