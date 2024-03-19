package com.modafa.oppotunitie.serviceImpl;

import com.example.demo.entity.Worker;
import com.modafa.oppotunitie.repository.WorkerRepository;
import com.modafa.oppotunitie.service.WorkerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@Service
public class WorkerServiceImpl implements WorkerService {

    @Autowired
    private WorkerRepository workerRepository;

    private final String UPLOAD_DIR = "./uploads/";

    @Override
    public Worker saveWorker(Worker worker, MultipartFile cvFile, MultipartFile portfolioFile) {
        String cvPath = saveFile(cvFile);
        String portfolioPath = saveFile(portfolioFile);
        worker.setCv(cvPath);
        worker.setPortfolio(portfolioPath);
        return workerRepository.save(worker);
    }

    @Override
    public Worker updateWorker(Integer workerId, Worker workerDetails, MultipartFile cvFile, MultipartFile portfolioFile) {
        Worker worker = workerRepository.findById(workerId).orElseThrow(() -> new RuntimeException("Worker not found"));
        String cvPath = saveFile(cvFile);
        String portfolioPath = saveFile(portfolioFile);
        worker.setCv(cvPath);
        worker.setPortfolio(portfolioPath);
        // Update other fields as needed
        return workerRepository.save(worker);
    }

    @Override
    public List<Worker> getAllWorkers() {
        return workerRepository.findAll();
    }

    @Override
    public Worker getWorkerById(Integer workerId) {
        return workerRepository.findById(workerId).orElseThrow(() -> new RuntimeException("Worker not found"));
    }

    @Override
    public void deleteWorker(Integer workerId) {
        workerRepository.deleteById(workerId);
    }

    private String saveFile(MultipartFile file) {
        if (file.isEmpty()) {
            return null;
        }
        try {
            byte[] bytes = file.getBytes();
            Path path = Paths.get(UPLOAD_DIR + file.getOriginalFilename());
            Files.write(path, bytes);
            return path.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}