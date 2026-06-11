package com.itheima.smartmed.langchain4j.rag.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.smartmed.langchain4j.rag.entity.Appointment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AppointmentMapper extends BaseMapper<Appointment> {
}