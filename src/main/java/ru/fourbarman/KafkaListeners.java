package ru.fourbarman;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "4barman",
            groupId = "groupId"
    )
    void listener(Message data) {
        System.out.println("Listener received: " + data + " ");
    }
}
