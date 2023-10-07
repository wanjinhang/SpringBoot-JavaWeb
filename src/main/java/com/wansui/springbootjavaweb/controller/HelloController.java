package com.wansui.springbootjavaweb.controller;

import com.wansui.springbootjavaweb.pojo.User;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wansui
 * @version 1.0
 * @since 2023/10/7 21:53
 */
@RestController
public class HelloController {
    @RequestMapping(value = "/hello")
    public String Hello(){
        return "Hello World";
    }
//简单参数 方式一：
    @RequestMapping(value ="sayHello")
    public String simpleParameter(HttpServletRequest request){
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        System.out.println("name="+name +" age=" + age);
        return "hello";
    }
//    简单参数方式二
    @RequestMapping(value ="simpleParameter")
    public String simpleParam2(@RequestParam(name="name") String username, Integer age){

        System.out.println("username="+username+" age="+age);
        return "ok";
    }
    //实体参数
    @RequestMapping(value ="simplePojo")
    public String simplePojoParameter(User user){
        System.out.println("username="+user.getName()+" age="+user.getAge());
        return "ok";
    }
}
