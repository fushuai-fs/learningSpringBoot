/*
  Author: Administration-PC
  Date: 2018/11/12 11:46
  Copyright ： all rights reserved
*/

package com.baitour.mssqlmongo.dao.supplier;

import com.baitour.mssqlmongo.entity.supplier.InterfaceLogEntity;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository("InterfaceLogRepositoryTwo")
public interface InterfaceLogRepository extends JpaRepository<InterfaceLogEntity,Long> {

    @Query(value = "select  logs.*  from Interface_log logs where logs.addTime>?1 ",nativeQuery = true)
    List<InterfaceLogEntity> findByAddTimeAfter(Date addTime);

    @Query(value = "select logs.* from Interface_log logs where logs.orderID=?1 ",nativeQuery = true)
    List<InterfaceLogEntity>  findByOrderID(long orderID);
}
