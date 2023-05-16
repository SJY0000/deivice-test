package deivice.test.infra;

import deivice.test.config.kafka.KafkaProcessor;
import deivice.test.domain.*;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class DeviceViewViewHandler {

    @Autowired
    private DeviceViewRepository deviceViewRepository;
}
