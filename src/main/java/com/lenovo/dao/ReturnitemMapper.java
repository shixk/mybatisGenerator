package com.lenovo.dao;

import com.lenovo.entity.Returnitem;
import com.lenovo.entity.ReturnitemCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReturnitemMapper {
    int countByExample(ReturnitemCriteria example);

    int deleteByExample(ReturnitemCriteria example);

    int deleteByPrimaryKey(Integer returnItemId);

    int insert(Returnitem record);

    int insertSelective(Returnitem record);

    List<Returnitem> selectByExample(ReturnitemCriteria example);

    Returnitem selectByPrimaryKey(Integer returnItemId);

    int updateByExampleSelective(@Param("record") Returnitem record, @Param("example") ReturnitemCriteria example);

    int updateByExample(@Param("record") Returnitem record, @Param("example") ReturnitemCriteria example);

    int updateByPrimaryKeySelective(Returnitem record);

    int updateByPrimaryKey(Returnitem record);
}