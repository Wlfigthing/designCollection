package com.example.designspringboot.Design.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InfoCollege implements College{
    List<Department> departmentList;
    int numOfDepartment = 0;

    public InfoCollege() {
        departmentList = new ArrayList<>();
        addDepartment("信息安全","信息安全");

        addDepartment("网络安全","网络安全");
        addDepartment("服务器安全","服务器安全");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name,desc);
        departmentList.add(department);
    }

    @Override
    public Iterator createIterator() {
        return new InfoCollegeIterator(departmentList);
    }
}
