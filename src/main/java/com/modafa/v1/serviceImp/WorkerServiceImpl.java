package com.modafa.v1.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.modafa.v1.entity.CV;
import com.modafa.v1.entity.PortFolio;
import com.modafa.v1.entity.Worker;
import com.modafa.v1.repository.WorkerRepository;
import com.modafa.v1.services.WorkerService;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Service
public class WorkerServiceImpl implements WorkerService {

	@Autowired
	private WorkerRepository workerRepository;

	private final String UPLOAD_DIR = "./uploads/";

	@Override
	public Worker saveWorker(Worker worker, MultipartFile cvFile, List<MultipartFile> portfolioFiles) {
	    // Assurez-vous que les listes sont initialisées
	    if (worker.getCvs() == null) {
	        worker.setCvs(new ArrayList<>());
	    }

	    if (worker.getPortfolios() == null) {
	        worker.setPortfolios(new ArrayList<>());
	    }

	    // Traitement du fichier CV
	    if (cvFile != null && !cvFile.isEmpty()) {
	        String cvPath = saveFile(cvFile);
	        CV newCV = new CV();
	        newCV.setCvUrl(cvPath);
	        newCV.setWorker(worker);
	        worker.getCvs().add(newCV); // Ajoutez le nouveau CV à la liste des CVs de worker
	    }

	    // Traitement des fichiers de portfolio
	    for (MultipartFile portfolioFile : portfolioFiles) {
	        if (portfolioFile != null && !portfolioFile.isEmpty()) {
	            String portfolioPath = saveFile(portfolioFile);
	            PortFolio newPortfolio = new PortFolio();
	            newPortfolio.setImageUrl(portfolioPath);
	            newPortfolio.setWorker(worker);
	            worker.getPortfolios().add(newPortfolio); // Ajoutez le nouveau Portfolio à la liste des portfolios de worker
	        }
	    }

	    return workerRepository.save(worker);
	}

	@Override
	public Worker updateWorker(Integer workerId, Worker workerDetails, MultipartFile cvFile, List<MultipartFile> portfolioFiles) {
	    Worker worker = workerRepository.findById(workerId)
	            .orElseThrow(() -> new IllegalArgumentException("Worker not found"));

	    // Traitement du fichier CV
	    if (cvFile != null && !cvFile.isEmpty()) {
	        String cvPath = saveFile(cvFile);
	        CV newCV = new CV();
	        newCV.setCvUrl(cvPath);
	        newCV.setWorker(worker);
	        // Vous pouvez choisir d'ajouter un nouveau CV ou de remplacer l'ancien
	        worker.getCvs().clear(); // Si vous souhaitez remplacer l'ancien CV
	        worker.getCvs().add(newCV);
	    }

	    // Gestion des fichiers de portfolio
	    if (portfolioFiles != null && !portfolioFiles.isEmpty()) {
	        // Vous pouvez choisir de conserver les anciens portfolios et d'ajouter les nouveaux
	        worker.getPortfolios().clear(); // Optionnel: nettoyez les anciens portfolios si vous voulez les remplacer
	        for (MultipartFile portfolioFile : portfolioFiles) {
	            if (portfolioFile != null && !portfolioFile.isEmpty()) {
	                String portfolioPath = saveFile(portfolioFile);
	                PortFolio newPortfolio = new PortFolio();
	                newPortfolio.setImageUrl(portfolioPath);
	                newPortfolio.setWorker(worker);
	                worker.getPortfolios().add(newPortfolio);
	            }
	        }
	    }

	    // Mettez à jour d'autres détails du worker selon les informations de workerDetails
	    // Par exemple, mise à jour du nom, de l'email, etc. Assurez-vous de copier les propriétés pertinentes de workerDetails à worker
	    
	    return workerRepository.save(worker);
	}


    @Override
    public List<Worker> getAllWorkers() {
        return workerRepository.findAll();
    }

    @Override
    public Worker getWorkerById(Integer workerId) {
        return workerRepository.findById(workerId).orElseThrow(() -> new IllegalArgumentException("Worker not found"));
    }

    @Override
    public boolean deleteWorker(Integer workerId) {
        boolean exists = workerRepository.existsById(workerId);
        if (exists) {
            workerRepository.deleteById(workerId);
            return true;
        }
        return false;
    }

    private String saveFile(MultipartFile file) {
        if (file == null || file.isEmpty()) {
            return null;
        }
        try {
            byte[] bytes = file.getBytes();
            Path path = Paths.get(UPLOAD_DIR + System.currentTimeMillis() + "_" + file.getOriginalFilename());
            Files.write(path, bytes);
            return path.toString();
        } catch (IOException e) {
            throw new IllegalStateException("Failed to save file.", e);
        }
    }
}
