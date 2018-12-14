package sk.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sk.springboot.entity.Dept;
import sk.springboot.service.DeptService;
import java.util.HashMap;
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

    /**
     * 接收前端的JSON参数
     * */
    @ResponseBody
    @RequestMapping("/getJSON")
    public String getJSON(String vars){
        System.out.println("前端传值的参数为:");
        System.out.println(vars);
        return "result";
    }

    /**
     * 返回JSON格式字符串
     * */
    @ResponseBody
    @RequestMapping("/showJSON")
    public Object showJSON(){
        Map<String,Object> map=new HashMap<>();
        map.put("cfInstId","分配的商户号");
        map.put("sign","报文主体签名信息");
        map.put("encryptedMsg","报文密文");
        map.put("encryptedSk","会话密钥密文");
        return map;
    }

    /**
     * Test MybatisPlus insert
     * */
    @ResponseBody
    @RequestMapping(path = "/insert",method = RequestMethod.GET)
    public boolean insertDept(){
        Dept dept=new Dept();
        dept.setDname("Test MybatisPlus insert");
        boolean insert = deptService.insert(dept);
        return insert;
    }

}
