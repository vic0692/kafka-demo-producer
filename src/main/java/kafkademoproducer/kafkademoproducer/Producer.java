package kafkademoproducer.kafkademoproducer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class Producer {
    private final KafkaMessagingService kafkaMessagingService;
    private final ModelMapper modelMapper;

    public CLS sendMsg(CLS cls) {
        //kafkaMessagingService.sendMessage(modelMapper.map(cls, CLS.class));
        kafkaMessagingService.sendMessage(cls);
        log.info("send cls from producer {}", cls);
        return cls;
    }
}
