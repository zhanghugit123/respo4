package co.it.test;

import cn.it.dao.ItemsDao;
import cn.it.domain.items;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class itemsDaoTest {

    @Test
    public void testfindById(){
      //创建容器
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        ItemsDao bean = context.getBean(ItemsDao.class);
        items items = bean.findById(1);
        System.out.println(items);
    }
}
