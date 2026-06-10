package com.itheima.smartmed.langchain4j.rag.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.smartmed.langchain4j.rag.entity.Appointment;

public interface AppointmentService extends IService<Appointment> {
    Appointment getOne(Appointment appointment);
}