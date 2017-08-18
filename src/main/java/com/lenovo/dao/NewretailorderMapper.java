package com.lenovo.dao;

import com.lenovo.entity.Newretailorder;
import com.lenovo.entity.NewretailorderCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NewretailorderMapper {
    int countByExample(NewretailorderCriteria example);

    int deleteByExample(NewretailorderCriteria example);

    int deleteByPrimaryKey(Integer orderId);

    int insert(Newretailorder record);

    int insertSelective(Newretailorder record);

    List<Newretailorder> selectByExample(NewretailorderCriteria example);

    Newretailorder selectByPrimaryKey(Integer orderId);

    int updateByExampleSelective(@Param("record") Newretailorder record, @Param("example") NewretailorderCriteria example);

    int updateByExample(@Param("record") Newretailorder record, @Param("example") NewretailorderCriteria example);

    int updateByPrimaryKeySelective(Newretailorder record);

    int updateByPrimaryKey(Newretailorder record);
}