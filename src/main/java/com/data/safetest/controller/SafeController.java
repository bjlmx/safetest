package com.data.safetest.controller;

import com.data.safetest.entity.Wife;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/*
 * 创建人 john
 * 创建日期 2020-04-08
 * 创建时间 11:28
 * 描述：
 */
@RestController
@RequestMapping("/safe")
public class SafeController {

    @GetMapping("/GET/{id}")
    public String hello(@PathVariable Integer id){
        System.out.println("restful风格的id是 "+id);
        List<Wife> wifeList =new ArrayList<>();
        Wife wife = new Wife();
        wife.setName("马秀");
        wife.setAge(26);
        wife.setHeight("160cm");
        wifeList.add(wife);
        wifeList.forEach(x-> System.out.println(x.toString()));
        return "big data="+id;
    }
}
