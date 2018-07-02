/*
  Author: Administration-PC
  Date: 2018/07/02 09:50 
  Copyright ： all rights reserved  
*/
package springBoot.demo.param;

import java.io.Serializable;

public class BasicParam implements Serializable {
    private static final long serialVersionUID = 1L;
    private int pageNumber = 1;
    private Long pageTotal = 1L;
    private Integer pageSize = 5;

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Long getPageTotal() {
        return pageTotal;
    }

    public void setPageTotal(Long pageTotal) {
        this.pageTotal = pageTotal;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
