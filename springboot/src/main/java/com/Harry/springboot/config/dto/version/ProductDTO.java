package com.Harry.springboot.config.dto.version;

import lombok.Data;

import java.util.List;

/**
 * @ClassName DetpDTO
 * @Description TODO
 * @Author 吴昊天
 * @Date 2021/7/15 15:17
 * @Version 1.0
 **/
@Data
public class ProductDTO {

    private Integer id;

    private Integer pid;

    private String productName;

    private String note;

    private List<ProductDTO> children;

}
