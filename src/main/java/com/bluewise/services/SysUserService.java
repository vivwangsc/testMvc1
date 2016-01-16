package com.bluewise.services;

import com.bluewise.model.SysUser;
import com.bluewise.util.MybatisSqlHelper;
import org.apache.ibatis.session.ResultContext;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by wangshunchu on 15/12/20.
 */
@Service
public class SysUserService {
   // @Resource
    //private SysUserMapper dao;
   @Autowired
   private SqlSessionTemplate sqlSessionTemplate;

    @Transactional
    public SysUser getSysUserById(String id) {
      //  SysUser u = dao.selectByPrimaryKey(id);

        Object o =  sqlSessionTemplate.selectOne("SysUserMapper.selectByPrimaryKey",id);
        //sqlSessionTemplate.s
//        sqlSessionTemplate.select("SysUserMapper.selectByPrimaryKey", new ResultHandler() {
//            public void handleResult(ResultContext resultContext) {
//                resultContext.getResultObject();
//            }
//        });
        //String s = MybatisSqlHelper.getNamespaceSql(sqlSessionTemplate,"SysUserMapper.selectByPrimaryKey");
        String s = MybatisSqlHelper.getNamespaceSql(sqlSessionTemplate,"SysUserMapper.selectByPrimaryKey",id);
        System.out.println(s);
        //sqlSessionTemplate.flushStatements()
        SysUser u = (SysUser)o;
        //sqlSessionTemplate.insert("asf");
        //u.setNAME("wangsc");
        return u;
    }

    public List<SysUser> getAllUser()
    {
        List<SysUser> ls = sqlSessionTemplate.selectList("SysUserMapper.selectAll") ;
        return ls;
    }

}
