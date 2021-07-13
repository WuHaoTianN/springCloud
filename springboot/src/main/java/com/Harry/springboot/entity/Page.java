package com.Harry.springboot.entity;

import com.Harry.springboot.config.common.base.baseEntity.BaseEntity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName Page
 * @Description 分类页
 * @Author 吴昊天
 * @Date 2021/7/7 21:29
 * @Version 1.0
 **/
public class Page<T> extends BaseEntity {

    private Integer page;

    private Integer pageSize = 10;

    private Integer total; // 调整前第几页/调整后总条数

    private List<T> rows;

    private Integer pageStatus; // 解析接口状态

    private String message;//解析提示文本

    private List<T> data; //解析数据列表

    private Integer pageIndex = 1;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public int getPageStatus() {
        return pageStatus;
    }

    public void setPageStatus(int pageStatus) {
        this.pageStatus = pageStatus;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    /**
     * @Title: getPageRec
     * @Description: 获取分页信息
     * @param @param paginationMap
     * @param @return
     * @return Map<String,Object>
     * @throws
     */
    public Map<String, Object> getPageRec(Map<String, Object> paginationMap){
        Map<String, Object>  map = new HashMap<String, Object>();
        this.setPageSize(Integer.parseInt(paginationMap.get("pageSize")+""));
        this.setPageIndex(Integer.parseInt(paginationMap.get("pageIndex")+""));
        map.put("firstRow", this.getFirstRow());
        map.put("endRow", this.getLastRow());
        return map;
    }

    public int getFirstRow() {
        return (pageIndex - 1) * pageSize;
    }
    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
    public int getPageSize() {
        return pageSize;
    }
    public int getLastRow() {
        return pageIndex * pageSize;
    }

}
