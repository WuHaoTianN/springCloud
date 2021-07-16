package com.Harry.springboot.config.common.utils.tree;

import com.Harry.springboot.config.dto.version.ProductDTO;
import com.google.common.collect.Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/**
 * @ClassName TreeUtils
 * @Description TODO
 * @Author 吴昊天
 * @Date 2021/7/15 15:11
 * @Version 1.0
 **/
public class TreeUtils {

    public static List<ProductDTO> getProductTree(List<ProductDTO> listNodes){
        List<ProductDTO> parents = new ArrayList<>();
        HashMap<Object, ProductDTO> tempParents = Maps.newHashMapWithExpectedSize(listNodes.size());

        listNodes.forEach( node ->{
            if (Objects.equals(node.getPid(),0)){
                ProductDTO pnode = tempParents.get(node.getId());
                if (Objects.isNull(pnode)) {
                    parents.add(node);
                    tempParents.put(node.getId(),node);
                } else {
                    parents.add(pnode);
                    pnode.setProductName(node.getProductName());
                    pnode.setPid(node.getPid());
                }
            } else {
                ProductDTO pnode = tempParents.get(node.getPid());
                if (Objects.isNull(pnode)){
                    pnode = new ProductDTO();
                    pnode.setId(node.getPid());
                    pnode.getChildren().add(node);
                    tempParents.put(node.getId(),node);
                    tempParents.put(pnode.getId(),pnode);
                } else {
                    ProductDTO tnode = tempParents.get(node.getId());
                    if (Objects.isNull(tnode)){
                        pnode.getChildren().add(node);
                        tempParents.put(node.getId(),node);
                    }else {
                        pnode.getChildren().add(node);
                    }
                }
            }
        });
        return parents;
    }
}
