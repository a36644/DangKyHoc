package com.example.ElearningTLU.Dto.Request;

import com.example.ElearningTLU.Entity.CourseType;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class CourseRequest {
    private String CourseId;
    private String CourseName;
    private int Credits;
    private double Coefficient;
    private CourseType type;
    private List<String> majorId= new ArrayList<>();
    private List<String> departmentId = new ArrayList<>();
    private List<String> reqiId = new ArrayList<>();
    private int requestCredits;

    public List<String> getReqiId() {
        return reqiId != null ? reqiId : new ArrayList<>();
    }

    public List<String> getMajorId() {
        return majorId!=null?majorId:new ArrayList<>();
    }
    public List<String> getDepartmentId() {
        return departmentId!=null?departmentId:new ArrayList<>();
    }
}
