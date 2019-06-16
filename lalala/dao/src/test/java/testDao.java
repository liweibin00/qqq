

import com.itheima.dao.maven_items_dao;
import com.itheima.domain.Items;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

public class testDao {

    @Test
    public void findByID(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_dao.xml");
        maven_items_dao bean = ac.getBean(maven_items_dao.class);

        Items byid = bean.findByid(1);


        System.out.println(byid.getName());
    }

}
