package com.Harry.springboot.config.common.base.baseService;

import java.util.List;

public interface BaseService<T> {

    /**
     * 根据ID查询其所有数据
     *
     * @author Harry
     * @date 2020/4/22 14:43
     * @param id
     * @return T
     */
    T getById(int id);

    /**
     * 创建数据
     *
     * @author Harry
     * @date 2020/4/22 14:44
     * @param t
     * @return
     */
    void save(T t);

    /**
     * 根据id删除信息
     *
     * @author Harry
     * @date 2020/4/22 14:44
     * @param id
     * @return
     */
    void deleteById(int id);

    /**
     * 更新信息
     *
     * @author Harry
     * @date 2020/4/22 14:45
     * @param t
     * @return
     */
    void update(T t);

    /**
     * 查询所有
     *
     * @author Harry
     * @date 2020/4/22 14:46
     * @param
     * @return List<T>
     */
    List<T> getAll();
}
