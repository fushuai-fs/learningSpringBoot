/*
  Author: Administration-PC
  Date: 2018/11/09 17:11 
  Copyright ： all rights reserved  
*/
package com.baitour.mssqlmongo.dao.supplier1;

import com.baitour.mssqlmongo.entity.supplier1.InterfaceLogEntity;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository("InterfaceLogRepositoryOne")
public interface InterfaceLogRepository extends JpaRepository<InterfaceLogEntity,Long> {


     @Query(value = "select  logs.*  from HInterface_log logs where logs.addTime>?1 ",nativeQuery = true)
    List<InterfaceLogEntity>  findByAddTimeAfter(Date addTime);

    @Query(value = "select logs.* from HInterface_log logs where logs.orderID=?1 ",nativeQuery = true)
    List<InterfaceLogEntity>  findByOrderID(long orderID);

}
