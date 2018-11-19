/*
  Author: Administration-PC
  Date: 2018/11/12 11:48
          Copyright ： all rights reserved
          */

          package com.baitour.mssqlmongo.dao.supplier;

          import com.baitour.mssqlmongo.entity.supplier.AvailabilityResponseEntity;
          import org.springframework.data.mongodb.repository.MongoRepository;
          import org.springframework.stereotype.Repository;

@Repository("interfaceLogMongoRepositoryTwo")
public interface InterfaceLogMongoRepository extends MongoRepository<AvailabilityResponseEntity, Long> {
}
