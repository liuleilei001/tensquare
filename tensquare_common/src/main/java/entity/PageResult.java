package entity;

import java.io.Serializable;
import java.util.List;

/**
 * @Description 分页封装的实体类
 * @Author llei
 * @Date 2019/2/26 16:02
 * @Version v1.0.0
 **/
public class PageResult<T> implements Serializable {

    private Long total;
    private List<T> rows;

    public PageResult(Long total, List<T> rows) {
        super();
        this.total = total;
        this.rows = rows;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
