package com.modafa.oppotunitie.service;

import com.example.demo.entity.Worker;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface WorkerService {
    Worker saveWorker(Worker worker, MultipartFile cvFile, MultipartFile portfolioFile);
    Worker updateWorker(Integer workerId, Worker workerDetails, MultipartFile cvFile, MultipartFile portfolioFile);
    List<Worker> getAllWorkers();
    Worker getWorkerById(Integer workerId);
    void deleteWorker(Integer workerId);
}