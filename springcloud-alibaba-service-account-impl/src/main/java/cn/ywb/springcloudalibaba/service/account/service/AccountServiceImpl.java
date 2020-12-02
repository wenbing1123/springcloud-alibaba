package cn.ywb.springcloudalibaba.service.account.service;

import cn.ywb.springcloudalibaba.service.account.api.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;

@Service
@Slf4j
public class AccountServiceImpl implements AccountService {

    @Override
    public void debit(String userId, int money) {

    }

}
