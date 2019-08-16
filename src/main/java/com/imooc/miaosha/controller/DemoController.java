package com.imooc.miaosha.controller;

import com.imooc.miaosha.dao.UsersMapper;
import com.imooc.miaosha.domain.Users;
import com.imooc.miaosha.result.CodeMsg;
import com.imooc.miaosha.result.Result;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lwx on 2019/8/15.
 */
@Controller
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private UsersMapper usersMapper;

    @GetMapping("/success")
    @ResponseBody
    public Result<CodeMsg> testSuccess(){
        return Result.success(CodeMsg.SUCCESS);
    }

    @RequestMapping("/thymeleaf")
    public String thymeleaf(Model model){
        model.addAttribute("name", "lwx");
        return "index";
    }

    @RequestMapping("/testDb")
    @ResponseBody
    public Users getUser(Integer id){
        //判断非空

        return usersMapper.getUser(id);
    }
}