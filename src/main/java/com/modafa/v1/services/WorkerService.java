package com.modafa.v1.services;

import com.modafa.v1.entity.Worker;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;

public interface WorkerService {
    // Modifie cette méthode pour accepter une liste de fichiers portfolio.
    Worker saveWorker(Worker worker, MultipartFile cvFile, List<MultipartFile> portfolioFiles);

    // Mise à jour pour accepter une liste de fichiers portfolio et permettre l'actualisation sans nécessiter de nouveaux fichiers CV ou Portfolio
    Worker updateWorker(Integer workerId, Worker workerDetails, MultipartFile cvFile, List<MultipartFile> portfolioFiles);

    List<Worker> getAllWorkers();
    
    Worker getWorkerById(Integer workerId);
    
    boolean deleteWorker(Integer workerId);
}
