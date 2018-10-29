/*
  Author: Administration-PC
  Date: 2018/10/26 16:17 
  Copyright ： all rights reserved  
*/

package dao;

import entity.HQInterfaceLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HQInterfaceLogRepository extends JpaRepository<HQInterfaceLog, Long> {


    List<HQInterfaceLog> findByOrderID(long OrderID);
}
