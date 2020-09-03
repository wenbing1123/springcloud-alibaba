package cn.ywb.springcloudalibaba.service.storage.impl.dao.repository;

import cn.ywb.springcloudalibaba.service.storage.impl.dao.entity.Storage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StorageRepo extends JpaRepository<Storage, Long> {
}
