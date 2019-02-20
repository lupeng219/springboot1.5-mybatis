package com.example.model;

public class User {
    private Long id;

    private String name;

    private String studentno;

    private String courseno;

    private String cursename;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getStudentno() {
        return studentno;
    }

    public void setStudentno(String studentno) {
        this.studentno = studentno == null ? null : studentno.trim();
    }

    public String getCourseno() {
        return courseno;
    }

    public void setCourseno(String courseno) {
        this.courseno = courseno == null ? null : courseno.trim();
    }

    public String getCursename() {
        return cursename;
    }

    public void setCursename(String cursename) {
        this.cursename = cursename == null ? null : cursename.trim();
    }
}