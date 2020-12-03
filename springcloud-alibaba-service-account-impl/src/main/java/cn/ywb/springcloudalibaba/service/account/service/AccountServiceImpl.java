package cn.ywb.springcloudalibaba.service.account.service;

import cn.ywb.springcloudalibaba.service.account.api.service.AccountService;
import cn.ywb.springcloudalibaba.service.account.config.binding.AccountSource;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;

@Service
@Slf4j
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountSource source;

    @Override
    public void debit(String userId, int money) {
        Message message = MessageBuilder.withPayload("msg").build();
        source.output1().send(message);
    }

}
