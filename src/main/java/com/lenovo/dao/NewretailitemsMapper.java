package com.lenovo.dao;

import com.lenovo.entity.Newretailitems;
import com.lenovo.entity.NewretailitemsCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NewretailitemsMapper {
    int countByExample(NewretailitemsCriteria example);

    int deleteByExample(NewretailitemsCriteria example);

    int deleteByPrimaryKey(Integer orderItemId);

    int insert(Newretailitems record);

    int insertSelective(Newretailitems record);

    List<Newretailitems> selectByExample(NewretailitemsCriteria example);

    Newretailitems selectByPrimaryKey(Integer orderItemId);

    int updateByExampleSelective(@Param("record") Newretailitems record, @Param("example") NewretailitemsCriteria example);

    int updateByExample(@Param("record") Newretailitems record, @Param("example") NewretailitemsCriteria example);

    int updateByPrimaryKeySelective(Newretailitems record);

    int updateByPrimaryKey(Newretailitems record);
}