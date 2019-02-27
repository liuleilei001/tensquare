package com.tensquare.base.dao;

import com.tensquare.base.pojo.Label;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * @Description TODO
 * @Author llei
 * @Date 2019/2/26 16:50
 * @Version v1.0.0
 **/
public interface LabelDao extends JpaRepository<Label,String>, JpaSpecificationExecutor<Label> {

}
