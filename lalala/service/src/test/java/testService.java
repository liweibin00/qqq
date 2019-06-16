import com.itheima.domain.Items;
import com.itheima.service.impl.maven_items_serviceimpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testService {

    @Test
    public void testService(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_service.xml");
        maven_items_serviceimpl bean = ac.getBean(maven_items_serviceimpl.class);
        Items id = bean.findById(1);
        System.out.println(id.getName());
    }

}
