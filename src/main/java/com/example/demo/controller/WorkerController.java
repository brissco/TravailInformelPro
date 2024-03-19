package com.example.demo.controller;


import com.example.demo.entity.Worker;
import com.modafa.oppotunitie.service.WorkerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/api/workers")
public class WorkerController {

    @Autowired
    private WorkerService workerService;

    @PostMapping
    public ResponseEntity<Worker> createWorker(@ModelAttribute Worker worker, 
                                               @RequestParam("cvFile") MultipartFile cvFile, 
                                               @RequestParam("portfolioFile") MultipartFile portfolioFile) {
        return ResponseEntity.ok(workerService.saveWorker(worker, cvFile, portfolioFile));
    }

    @GetMapping
    public List<Worker> getAllWorkers() {
        return workerService.getAllWorkers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Worker> getWorkerById(@PathVariable Integer id) {
        return ResponseEntity.ok(workerService.getWorkerById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteWorker(@PathVariable Integer id) {
        workerService.deleteWorker(id);
        return ResponseEntity.ok().build();
    }

    // Add other endpoints as needed
}