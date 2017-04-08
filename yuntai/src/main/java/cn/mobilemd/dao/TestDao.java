package cn.mobilemd.dao;


import cn.mobilemd.domain.TestPOJO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TestDao {

    //根据age查找info
    List<TestPOJO> get(int age);

}
