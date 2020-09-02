package cn.ywb.springcloudalibaba.service.storage.impl.service;

import cn.ywb.springcloudalibaba.service.storage.api.service.StorageService;
import cn.ywb.springcloudalibaba.service.storage.impl.dao.repository.StorageRepo;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
@Transactional
public class StorageServiceImpl implements StorageService {

    private StorageRepo storageRepo;

    public StorageServiceImpl(StorageRepo storageRepo) {
        this.storageRepo = storageRepo;
    }

}
