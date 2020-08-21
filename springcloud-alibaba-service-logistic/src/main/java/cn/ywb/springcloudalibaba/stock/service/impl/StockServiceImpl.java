package cn.ywb.springcloudalibaba.stock.service.impl;

import cn.ywb.springcloudalibaba.stock.service.StockService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;

@Service
@Slf4j
public class StockServiceImpl implements StockService {

    @Override
    public void cutStock() {
        log.info("cut stock start...");
    }

}
