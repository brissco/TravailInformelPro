package com.modafa.oppotunitie.oppotunitie;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRepositorys {

	@GetMapping("/test")
    public String testEndpoint() {
        return "L'API fonctionne !";
    }
}
