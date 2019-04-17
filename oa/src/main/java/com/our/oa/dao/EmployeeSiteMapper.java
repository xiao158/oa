package com.our.oa.dao;

import com.our.oa.entity.EmployeeSite;
import java.util.List;

/**
* Created by Mybatis Generator on 2019/03/31
*/
public interface EmployeeSiteMapper {
    int deleteByPrimaryKey(Integer employeeSiteId);

    int insert(EmployeeSite record);

    EmployeeSite selectByPrimaryKey(Integer employeeSiteId);

    List<EmployeeSite> selectAll();

    int updateByPrimaryKey(EmployeeSite record);
}