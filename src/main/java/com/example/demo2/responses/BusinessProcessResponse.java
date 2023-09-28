package com.example.demo2.responses;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;
@Data
public class BusinessProcessResponse {


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
    private LocalDate created;
}
