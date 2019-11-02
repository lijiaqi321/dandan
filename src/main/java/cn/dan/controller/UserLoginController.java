package cn.dan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserLoginController {

    //显示登录页面
    @RequestMapping(value = "/login.html")
    public String Login(){

        return "login";
    }

    //用户登录
    @RequestMapping(value = "/dologin.html",method = RequestMethod.POST)
    public String Login(String userCode, String userPassword, HttpSession session) {

        return "index";

    }
    @RequestMapping(value = "/footer.html")
    public String footer(){

        return "footer";
    }
    @RequestMapping(value = "/header.html")
    public String header(){

        return "header";
    }
    @RequestMapping(value = "/product.html")
    public String product(){

        return "product";
    }
    @RequestMapping(value = "/register.html")
    public String register(){

        return "register";
    }
    @RequestMapping(value = "/shopping.html")
    public String shopping(){

        return "shopping";
    }

    @RequestMapping(value = "/open.html")
    public String open(){

        return "open";
    }
}
