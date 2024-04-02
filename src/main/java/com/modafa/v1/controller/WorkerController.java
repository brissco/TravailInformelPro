package com.modafa.v1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.modafa.v1.entity.Worker;
import com.modafa.v1.services.WorkerService;

import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/api/workers")
public class WorkerController {

    @Autowired
    private WorkerService workerService;

    @PostMapping
    public ResponseEntity<?> createWorker(@Valid @RequestPart("worker") Worker worker, 
                                          @RequestPart("cvFile") MultipartFile cvFile, 
                                          @RequestPart("portfolioFile") List<MultipartFile> portfolioFiles) {
        try {
            // S'assure que le service sait comment traiter les fichiers et les associer au worker
            Worker savedWorker = workerService.saveWorker(worker, cvFile, portfolioFiles);
            return ResponseEntity.ok(savedWorker);
        } catch (Exception e) {
            // Gestion des exceptions, par exemple, si le fichier n'est pas valide, si le worker ne peut pas être enregistré, etc.
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Impossible de créer le worker : " + e.getMessage());
        }
    }
    @GetMapping
    public List<Worker> getAllWorkers() {
        return workerService.getAllWorkers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Worker> getWorkerById(@PathVariable Integer id) {
        Worker worker = workerService.getWorkerById(id);
        if (worker != null) {
            return ResponseEntity.ok(worker);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteWorker(@PathVariable Integer id) {
        if (workerService.deleteWorker(id)) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Add other endpoints as needed
}
