package cn.ywb.springcloudalibaba.service.storage.impl.dao.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@SuperBuilder
@Entity
@Table(catalog = "t_storage")
public class Storage {

    @Id
    private String id;


}
