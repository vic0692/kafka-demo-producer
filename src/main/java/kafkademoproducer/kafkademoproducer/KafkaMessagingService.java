package kafkademoproducer.kafkademoproducer;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaMessagingService {

    @Value("${topic.send-msg}")
    private String sendTopic;

    //private final KafkaTemplate<Integer, Object> kafkaTemplate;
    private final KafkaTemplate<Integer, CLS> kafkaTemplate;

    public void sendMessage(CLS cls) {
        kafkaTemplate.send(sendTopic, cls.getId(), cls);
    }
}
