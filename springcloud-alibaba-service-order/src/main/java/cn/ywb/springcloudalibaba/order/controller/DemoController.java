package cn.ywb.springcloudalibaba.order.controller;

import cn.ywb.springcloudalibaba.order.config.UserConfig;
import com.alibaba.cloud.nacos.NacosConfigManager;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@Api(tags = "演示")
public class DemoController {

    private NacosConfigManager nacosConfigManager;
    private UserConfig userConfig;

    public DemoController(NacosConfigManager nacosConfigManager, UserConfig userConfig) {
        this.nacosConfigManager = nacosConfigManager;
        this.userConfig = userConfig;
    }

    @Value("${user.name}")
    String userName;

    @Value("${user.age:25}")
    Integer age;

    @RequestMapping("/user")
    public String simple() {
        return "Hello Nacos Config!" + "Hello " + userName + " " + age + " [UserConfig]: "
                + userConfig + "!" + nacosConfigManager.getConfigService();
    }

    @RequestMapping("/bool")
    public boolean bool() {
        return (Boolean) (userConfig.getMap().get("2"));
    }

}

