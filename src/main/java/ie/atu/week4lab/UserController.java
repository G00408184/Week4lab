package ie.atu.week4lab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {
    private  RegistrarionServiceClient registrarionServiceClient;

    @Autowired
    public UserController(RegistrarionServiceClient registrarionServiceClient){
        this.registrarionServiceClient = registrarionServiceClient;
    }
    @PostMapping("/confirm-and-register")
    public  Map<String, String> confirmAndRegister(@RequestBody UserDetails userDetails)
    {
    String confirm = registrarionServiceClient.someDetails(userDetails);
    Map<String, String> responseMessage = new HashMap<>();
    responseMessage.put("message",confirm);
    return responseMessage;
    }

}
