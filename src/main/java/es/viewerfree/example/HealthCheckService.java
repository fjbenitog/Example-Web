package es.viewerfree.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckService {

	@RequestMapping("/health")
    public HealthCheck greeting() {
		HealthCheck healthCheck = new HealthCheck();
		healthCheck.setStatus("OK");
		healthCheck.setVersion("1.0");
        return healthCheck;
    }
}
