package com.example.demo2.requests;

import lombok.Data;

import java.util.List;
@Data
public class BusinessProcessRequest {


    private String status;
    private String wbs;
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

}
