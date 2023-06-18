package com.example.swdemo2.repository;

import com.example.swdemo2.entity.Detail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailRepository extends JpaRepository<Detail,Integer> {
}
