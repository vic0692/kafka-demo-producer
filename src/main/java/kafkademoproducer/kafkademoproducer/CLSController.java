package kafkademoproducer.kafkademoproducer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/sendMsg")
public class CLSController {
    private final Producer producer;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public CLS sendCls(@RequestBody CLS cls) {
        log.info("Send cls to kafka");
        producer.sendMsg(cls);
        return cls;
    }
}
