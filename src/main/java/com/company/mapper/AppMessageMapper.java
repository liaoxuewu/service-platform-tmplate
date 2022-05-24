package com.company.mapper;

import com.company.bean.AppMessage;

import java.util.List;

public interface AppMessageMapper {

    int deleteByPrimaryKey(String id);
    int insert(AppMessage record);
    int insertSelective(AppMessage record);
    AppMessage selectByPrimaryKey(String id);
    int updateByPrimaryKeySelective(AppMessage record);
    int updateByPrimaryKey(AppMessage record);

    List<AppMessage> selectAll();
    List<AppMessage> getMessageById(String id);
}
