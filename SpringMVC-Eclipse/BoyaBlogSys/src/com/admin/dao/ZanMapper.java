package com.admin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.admin.pojo.Zan;
import com.admin.pojo.ZanExample;

public interface ZanMapper {
    int countByExample(ZanExample example);

    int deleteByExample(ZanExample example);

    int deleteByPrimaryKey(Integer zid);

    int insert(Zan record);

    int insertSelective(Zan record);

    List<Zan> selectByExample(ZanExample example);

    Zan selectByPrimaryKey(Integer zid);

    int updateByExampleSelective(@Param("record") Zan record, @Param("example") ZanExample example);

    int updateByExample(@Param("record") Zan record, @Param("example") ZanExample example);

    int updateByPrimaryKeySelective(Zan record);
    
    int updateByAid(Zan record);

    int updateByPrimaryKey(Zan record);
}