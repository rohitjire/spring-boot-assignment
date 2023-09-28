package com.example.demo2.models;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Data
public class BusinesProcess {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String wbs;
    private String status;
    private String version;
    private String titel;
    private String description;
    private String area;
    private String ownerId;
    private String owner;
    private String auth;
    private String text1;
    private String text2;
    private List<String> files;

    @CreationTimestamp
    private LocalDate created;


}
