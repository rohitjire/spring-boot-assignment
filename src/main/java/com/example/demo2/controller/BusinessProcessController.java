package com.example.demo2.controller;

import com.example.demo2.models.BusinesProcess;
import com.example.demo2.requests.BusinessProcessRequest;
import com.example.demo2.service.BusinessProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController()
@RequestMapping("/api")
public class BusinessProcessController {

    @Autowired
    private BusinessProcessService service;

    @PostMapping("/bpls")
    public ResponseEntity<BusinesProcess> addBusinessProcess(@RequestBody BusinessProcessRequest request) {
        return service.addBusinessProcess(request);
    }

    @GetMapping("/bpls")
    public ResponseEntity<List<BusinesProcess>> getAll(){
        return service.getAll();
    }

    @GetMapping("/bpls/{id}")
    public ResponseEntity<BusinesProcess> getById(@PathVariable UUID id) throws Exception {
        return service.getById(id);
    }
}
