package com.baizhi;

import com.baizhi.dao.AdminDAO;
import com.baizhi.entity.Admin;
import com.baizhi.service.AdminService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestCMFZ {
    @Autowired
    private AdminService adminService;
    @Autowired
    private AdminDAO adminDAO;

    @Test
    public void TestAdmin() {
        List<Admin> list = adminService.getAll();
        System.out.println(list);
        System.out.println(11);
    }
}
