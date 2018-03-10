package andy.birenzi.develop.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private Producer producer;
    private Client client;

    @RequestMapping("/send")
    public String sendMsg(){
        client= new Client("Your Name", "HEllo",45,"Your address");
        producer.sendMessage(client);
        return "Done";
    }
}
