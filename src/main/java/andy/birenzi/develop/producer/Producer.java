package andy.birenzi.develop.producer;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Producer {
 @Autowired
 RabbitTemplate rabbitTemplate;
    public void sendMessage(Client client){
//        ApplicationContext ctx = new AnnotationConfigApplicationContext(config.class);
//        RabbitTemplate rabbitTemplate = ctx.getBean(RabbitTemplate.class);
        rabbitTemplate.convertAndSend(client);

    }

}
