package com.pmumentor.model.entities;

public class Student {
    
    private String studentID;
    private String name;
    private String email; 
    private String passwordHash; 
    private String major;
    private String role; // 'Mentee' or 'Mentor'

    public Student(String studentID, String name, String email, String passwordHash, String major, String role) {
        this.studentID = studentID;
        this.name = name;
        this.email = email;
        this.passwordHash = passwordHash;
        this.major = major;
        this.role = role;
    }
    
    
    public String getStudentID() {
        return studentID;
    }
    
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getRole() {
        return role;
    }
    
    public void setRole(String role) {
        this.role = role;
    }

}
