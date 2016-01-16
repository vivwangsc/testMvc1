package com.bluewise.control;

import com.bluewise.util.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by wangshunchu on 15/12/18.
 */
@Controller
@RequestMapping(value="/test")
public class testControl extends BaseController{
    @RequestMapping(value ="/list")
    public ModelAndView listUser()
    {
        //this.getPage()
        ModelAndView mv =  this.getModelAndView();
        mv.addObject("title","来自模型的东西");
        String s="hello from control!";
        System.out.println("打印" + s);
        mv.setViewName("test/list");
        return mv;
        //return "test/list";
    }

    @RequestMapping(value = "/add")
    public ModelAndView addUser()
    {
        ModelAndView mv = new ModelAndView();
        mv.getModel().put("para1","王顺初");
        mv.setViewName("test/add");
        return  mv;

    }

}
