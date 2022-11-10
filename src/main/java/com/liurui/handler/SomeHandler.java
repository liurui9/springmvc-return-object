package com.liurui.handler;

import com.liurui.beans.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller()
@RequestMapping("/some")
public class SomeHandler {
@RequestMapping(value="/first",produces = {"text/html;charset=utf-8;","application/json;"})
@ResponseBody//表示当前参数体通过响应体响应
    public String  doFirst(String name,int age) throws Exception {

    System.out.println(name +":"+ age);
    return name;
    }
    @RequestMapping("/second")
    @ResponseBody//表示当前参数体通过响应体响应
    public Double  doSecond(String name,int age) throws Exception {

        System.out.println(name +":"+ age);
        return 945.765;
    }
    @RequestMapping("/third")
    @ResponseBody//表示当前参数体通过响应体响应
    public Student doThird(Student student) throws Exception {

        System.out.println(student);
        Student student1 = new Student("王五",4);
        return student1;
    }
}
