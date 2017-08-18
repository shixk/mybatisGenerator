package com.lenovo.dao;

import com.lenovo.entity.Returnorder;
import com.lenovo.entity.ReturnorderCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReturnorderMapper {
    int countByExample(ReturnorderCriteria example);

    int deleteByExample(ReturnorderCriteria example);

    int deleteByPrimaryKey(Integer returnOrderId);

    int insert(Returnorder record);

    int insertSelective(Returnorder record);

    List<Returnorder> selectByExample(ReturnorderCriteria example);

    Returnorder selectByPrimaryKey(Integer returnOrderId);

    int updateByExampleSelective(@Param("record") Returnorder record, @Param("example") ReturnorderCriteria example);

    int updateByExample(@Param("record") Returnorder record, @Param("example") ReturnorderCriteria example);

    int updateByPrimaryKeySelective(Returnorder record);

    int updateByPrimaryKey(Returnorder record);
}