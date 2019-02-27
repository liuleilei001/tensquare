package com.tensquare.base.service;



import com.tensquare.base.dao.LabelDao;
import com.tensquare.base.pojo.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import util.IdWorker;

import java.util.List;

/**
 * @Description TODO
 * @Author llei
 * @Date 2019/2/26 16:51
 * @Version v1.0.0
 **/
@Service

public class LabelService {

    @Autowired
    private LabelDao labelDao;

    @Autowired
    private IdWorker idWorker;

    public List<Label> findAll() {
        return labelDao.findAll();
    }

    public Label findById(String labelId) {
        return labelDao.findById(labelId).get();
    }


    public void save(Label label) {
        label.setId(idWorker.nextId()+"");
        label.setFans(0L);
        labelDao.save(label);
    }

    public void update(Label label) {
        labelDao.save(label);
    }

    public void delete(String labelId) {
        labelDao.deleteById(labelId);
    }
}
