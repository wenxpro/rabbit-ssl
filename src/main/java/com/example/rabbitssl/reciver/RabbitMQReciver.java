package com.example.rabbitssl.reciver;

import com.example.rabbitssl.config.RabbitFanoutExchangeConfig;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQReciver {

    @RabbitListener(queues = RabbitFanoutExchangeConfig.FANOUT_QUEUE1)
    public void reciveLogAll(String msg) throws Exception {
        System.out.println("received msg:" + msg);
    }
}
