package cn.ywb.springcloudalibaba.service.account.config.binding;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface AccountSource {

    @Output("output1")
    MessageChannel output1();

}
