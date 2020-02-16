package com.example.demo.service;

import com.example.demo.User;
import org.apache.ibatis.annotations.Param;
import org.xmlunit.util.Mapper;

import java.lang.*;

@org.springframework.stereotype.Service

public class ServiceImp implements Service{
    @Override
    public User getId(){
        return Mapper.findId(code);
    }
    @Override
    public User getName(){
        return Mapper.findName(code);
    }
    @Override
    public User getStudentId(){
        return Mapper.findStudentId(code);
    }
}
