package cn.mobilemd.web;

import cn.mobilemd.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestService testServices;

    @RequestMapping(value = "/show")
    public String show(){
        return testServices.show();
    }

    @RequestMapping(value = "/showDao")
    public Object showDao(int age){
        return testServices.showDao(age);
    }

}
