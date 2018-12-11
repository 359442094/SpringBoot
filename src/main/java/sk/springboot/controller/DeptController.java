package sk.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import sk.springboot.entity.Dept;
import sk.springboot.service.DeptService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@SessionAttributes("maps")
public class DeptController {
    @Autowired
    private DeptService deptService;
    /**
     * 测试thymeleaf模版引擎
     * */
    @RequestMapping("/index")
    public String boot(Model model){
        Map<String,Object> maps=new HashMap<>();
        maps.put("depts", deptService.selectDepts());
        model.addAttribute("maps",maps);
        return "index";
    }

}
