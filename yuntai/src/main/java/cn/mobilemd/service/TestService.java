package cn.mobilemd.service;

import cn.mobilemd.dao.TestDao;
import cn.mobilemd.domain.TestPOJO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TestService {

    @Autowired
    private TestDao testDao;

    public String show(){
        return "hello world!";
    }

    public List<TestPOJO> showDao(int age){
        return testDao.get(age);
    }
}
