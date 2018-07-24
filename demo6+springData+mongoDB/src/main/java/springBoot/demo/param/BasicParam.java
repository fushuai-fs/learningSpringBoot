package springBoot.demo.param;

public class BasicParam {
    private int pageNumber = 1;
    private Long pageTotal = 1L;
    private Integer pageSize = 5;

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

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
}
