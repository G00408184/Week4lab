package ie.atu.week4lab;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
@Service
@FeignClient(name = "confirmation-service", url = "http://localhost:8081")
public interface RegistrarionServiceClient {
    @PostMapping("/confirm")
    String someDetails(@RequestBody UserDetails userdetails);
}
