package com.atguigu.controller;

import com.atguigu.dao.DeptDao;
import com.atguigu.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by xuehy
 *
 * @version 1.0.0
 */
@RestController
public class DeptController {

    @Autowired
    private DeptDao deptDao;

    @Autowired
    private DiscoveryClient client;

    @RequestMapping("/dept/get/{id}")
    public Dept findByDept(@PathVariable("id") Long id) {
        return deptDao.findById(id);
    }

    @RequestMapping(value = "/dept/addDept", method = RequestMethod.POST)
    public Boolean add(@RequestBody(required = false) Dept dept) {
        return deptDao.addDept(dept);

    }

    @GetMapping("/dept/list")
    public List<Dept> queryLuist() {
        return deptDao.findAll();
    }

    @RequestMapping(value = "/dept/discovery", method = RequestMethod.GET)
    public Object disconvery() {
        List<String> list = client.getServices();
        System.out.println("*********" + list);

        List<ServiceInstance> instanceList = client.getInstances("microservicecloud-dept");
        for (ServiceInstance element : instanceList) {
            System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t" + element.getUri());
        }
        return this.client;
    }
}
