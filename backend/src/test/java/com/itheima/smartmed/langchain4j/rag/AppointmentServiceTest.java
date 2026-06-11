package com.itheima.smartmed.langchain4j.rag;

import com.itheima.smartmed.langchain4j.rag.entity.Appointment;
import com.itheima.smartmed.langchain4j.rag.service.AppointmentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
class AppointmentServiceTest {

    @Autowired
    private AppointmentService appointmentService;

    @Test
    void testGetOne() {
        Appointment appointment = new Appointment();
        appointment.setUsername("张三");
        appointment.setIdCard("123456789012345678");
        appointment.setDepartment("内科");
        appointment.setDate("2025-04-14");
        appointment.setTime("上午");

        Appointment appointmentDB = appointmentService.getOne(appointment);
        System.out.println(appointmentDB);
    }

    @Test
    // 添加 @Transactional 注解并设置不回滚，或者去掉 @Transactional
    void testSave() {
        Appointment appointment = new Appointment();
        appointment.setUsername("张三");
        appointment.setIdCard("123456789012345678");
        appointment.setDepartment("内科");
        appointment.setDate("2025-04-14");
        appointment.setTime("上午");
        appointment.setDoctorName("张医生");

        boolean result = appointmentService.save(appointment);
        System.out.println("保存结果: " + result);
        System.out.println("生成的ID: " + appointment.getId());
    }

    @Test
    void testRemoveById() {
        appointmentService.removeById(1L);
    }
}