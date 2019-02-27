package com.tensquare.base.controller;

import com.tensquare.base.pojo.Label;
import com.tensquare.base.service.LabelService;
import entity.Result;
import entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sun.font.TrueTypeFont;

import javax.xml.ws.RequestWrapper;
import java.util.List;

/**
 * @Description TODO
 * @Author llei
 * @Date 2019/2/26 16:50
 * @Version v1.0.0
 **/
@CrossOrigin //支持跨域请求
@RestController
@RequestMapping(value = "/label")
public class LabelController {

    @Autowired
    private LabelService labelService;
    /**
     * 查询所用的标签
     * */
    @RequestMapping(method = RequestMethod.GET)
    public Result findAll(){
        List<Label> list = labelService.findAll();
        return new Result(true, StatusCode.OK,"查询成功",list);
    }

    /**
     * 根据id查询
     * */
    @RequestMapping(value = "/{labelId}", method = RequestMethod.GET)
    public Result findById(@PathVariable(value = "labelId") String labelId){
        Label label = labelService.findById(labelId);
        return new Result(true,StatusCode.OK,"查询成功",label);
    }

    /**
     * 增加
     * */
    @RequestMapping(method = RequestMethod.POST)
    public Result add(@RequestBody Label label){
        labelService.save(label);
        return new Result(true,StatusCode.OK,"查询成功");
    }

   /**
    * 更新
    *
   * */
   @RequestMapping(value = "/{labelId}",method = RequestMethod.PUT)
   public Result update(@PathVariable(value = "labelId") String labelId,@RequestBody Label label){
       label.setId(labelId);
       labelService.update(label);
       return new Result(true,StatusCode.OK,"更新成功");
   }

   /**
    * 删除
    * */
   @RequestMapping(value = "/{labelId}",method = RequestMethod.DELETE)
    public Result delete(@PathVariable(value = "labelId") String labelId){
       labelService.delete(labelId);
       return new Result(true,StatusCode.OK,"删除成功");
   }



}
