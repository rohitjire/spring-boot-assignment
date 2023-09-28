package com.example.demo2.service;

import com.example.demo2.models.BusinesProcess;
import com.example.demo2.repository.BusinessProcessRepository;
import com.example.demo2.requests.BusinessProcessRequest;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
@RequiredArgsConstructor
public class BusinessProcessService {

    @Autowired
    private BusinessProcessRepository businessProcessRepository;

    public ResponseEntity<BusinesProcess> addBusinessProcess(BusinessProcessRequest request) {
        BusinesProcess model = new BusinesProcess();
        model.setArea(request.getArea());
        model.setAuth(request.getAuth());
        model.setFiles(request.getFiles());
        model.setText1(request.getText1());
        model.setText2(request.getText2());
        model.setDescription(request.getDescription());
        model.setOwnerId(request.getOwnerId());
        model.setOwner(request.getOwner());
        model.setWbs(request.getWbs());
        model.setStatus(request.getStatus());
        model.setTitel(request.getTitel());
        model.setVersion(request.getVersion());
        return new ResponseEntity<>(businessProcessRepository.save(model), HttpStatus.OK);
    }

    public ResponseEntity<List<BusinesProcess>> getAll() {
        return new ResponseEntity<>(businessProcessRepository.findAll(), HttpStatus.OK);
    }

    public ResponseEntity<BusinesProcess> getById(UUID id) {
        assert id != null;
        var bps = businessProcessRepository.existsById(id);
        if (!bps) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(businessProcessRepository.findById(id).get(), HttpStatus.OK);
    }
}
