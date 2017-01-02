/**
 * Created by wonjun-pc on 2016-07-01.
 */
import java.util.List;
import com.funda.mybatis.dao.MemberDAO;
import com.funda.mybatis.model.applicationExample;
import com.funda.mybatis.service.ApplicationDAOService;
import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
        "file:src/main/webapp/WEB-INF/spring/root-context.xml"
})
class TestController {
    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private ApplicationDAOService homeService;

    // test
    @Test
    public void test() {
        applicationExample test = new applicationExample();
        System.out.println("JUnit Test");
        homeService.selectByExample(test);
    }
}