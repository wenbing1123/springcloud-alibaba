package cn.ywb.springcloudalibaba.service.storage.impl.dao.repository;

import cn.ywb.springcloudalibaba.service.storage.impl.dao.entity.Storage;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface StorageRepo extends ReactiveCrudRepository<Storage, Long> {
}
