package org.accolite;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            Employee emp = new Employee();
            emp.setId(6902);
            emp.setName("Viral Modi");
            emp.setDesignation("SWE");
            emp.setAge(21);
            Employee emp2 = new Employee();
            emp2.setId(6912);
            emp2.setName("Ayush Agarwal");
            emp2.setDesignation("QA");
            emp2.setAge(22);
            String jsonEmp = objectMapper.writeValueAsString(emp);
            String jsonEmp2 = objectMapper.writeValueAsString(emp2);
            System.out.println(jsonEmp);
            System.out.println(jsonEmp2);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}