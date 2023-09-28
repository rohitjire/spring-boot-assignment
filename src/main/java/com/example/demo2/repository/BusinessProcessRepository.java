package com.example.demo2.repository;

import com.example.demo2.models.BusinesProcess;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BusinessProcessRepository extends JpaRepository<BusinesProcess,UUID> {

}
