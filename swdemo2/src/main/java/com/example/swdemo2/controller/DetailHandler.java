package com.example.swdemo2.controller;

import com.example.swdemo2.entity.Detail;
import com.example.swdemo2.repository.DetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/detail")
public class DetailHandler {
    @Autowired
    private DetailRepository detailRepository;
    @GetMapping("/findAll")
    public List<Detail> findAll(){
        return detailRepository.findAll();
    }
}
