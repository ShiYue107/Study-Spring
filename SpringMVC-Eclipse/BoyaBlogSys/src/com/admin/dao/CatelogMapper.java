package com.admin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.admin.pojo.Catelog;
import com.admin.pojo.CatelogExample;

public interface CatelogMapper {
    int countByExample(CatelogExample example);

    int deleteByExample(CatelogExample example);

    int deleteByPrimaryKey(Integer gid);

    int insert(Catelog record);

    int insertSelective(Catelog record);

    List<Catelog> selectByExample(CatelogExample example);

    Catelog selectByPrimaryKey(Integer gid);

    int updateByExampleSelective(@Param("record") Catelog record, @Param("example") CatelogExample example);

    int updateByExample(@Param("record") Catelog record, @Param("example") CatelogExample example);

    int updateByPrimaryKeySelective(Catelog record);

    int updateByPrimaryKey(Catelog record);
}