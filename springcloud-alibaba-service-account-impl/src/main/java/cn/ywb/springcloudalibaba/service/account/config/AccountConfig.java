package cn.ywb.springcloudalibaba.service.account.config;

import cn.ywb.springcloudalibaba.service.account.config.binding.AccountSource;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBinding({AccountSource.class})
public class AccountConfig {
}
