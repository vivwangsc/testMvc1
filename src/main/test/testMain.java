
/**
 * Created by wangshunchu on 15/12/18.
 */

import com.alibaba.fastjson.JSON;
import com.bluewise.model.SysUser;
import com.bluewise.services.SysUserService;
//import com.sun.javafx.tools.packager.Log;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by xiang.li on 2015/2/1.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/ApplicationContext.xml")
public class testMain {

    private static String UUID = "1";
    @Autowired
    private SysUserService userService;
    @Resource
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private SqlSessionFactory sqlSessionFactory;
    //private static Logger logger = LoggerFactory.getLogger(testMain.class);

    @Test
    public void testPage()
    {

    }

    @Test
    public void test() {
        SysUser user = userService.getSysUserById(UUID);
        String s = JSON.toJSONString(user);
        System.out.println(s);
    }

    @Test
    public void  testList(){
        List<SysUser> ls = userService.getAllUser();
        String s = JSON.toJSONString(ls);
        System.out.println(s);

    }


    @Test
    public void testJdbc()
    {
        System.out.println("let's begin");
        jdbcTemplate.query("select * from sys_user", new RowCallbackHandler() {
            public void processRow(ResultSet resultSet) throws SQLException {
                System.out.println(resultSet.getString("name"));
            }
        });
        System.out.println("test end");
    }

//    /**
//     * 测试联合查询
//     */
//    @Test
//    public void test2() {
//        List<SysUser> users = userService.s .queryUserList();
//        logger.info(JSON.toJSONString(users));
//    }
}