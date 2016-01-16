package com.bluewise.services;

import com.bluewise.model.BaIcd10;
import com.bluewise.model.SysUser;
import com.bluewise.util.MybatisSqlHelper;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by wangshunchu on 15/12/20.
 */
@Service
public class BaIcd10Service {
   // @Resource
    //private SysUserMapper dao;
   @Autowired
   private SqlSessionTemplate sqlSessionTemplate;

    @Transactional
    public BaIcd10 getBaIcd10ById(String id) {
      //  SysUser u = dao.selectByPrimaryKey(id);
        BaIcd10 u = (BaIcd10) sqlSessionTemplate.selectOne("BaIcd10Mapper.selectByPrimaryKey",id);
        return u;
    }

    /**
     * 获取列表,这是一个麻烦的事情
     */

}
