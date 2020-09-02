package cn.ywb.springcloudalibaba.storage.dao.repository;

import cn.ywb.springcloudalibaba.storage.dao.entity.Storage;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface StorageRepo extends ReactiveCrudRepository<Storage, Long> {
}
