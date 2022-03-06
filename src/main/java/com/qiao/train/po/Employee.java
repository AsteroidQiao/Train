package com.qiao.train.po;

public class Employee {
    private String name;
    private String gender;
    private String age;
    private String position;
    private String major;
    private String exp;
    private String eduBg;
    private String school;
    private String phone;
    private String email;
    private String info;

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public String getMajor() {
        return major;
    }

    public String getExp() {
        return exp;
    }

    public String getEduBg() {
        return eduBg;
    }

    public String getSchool() {
        return school;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getInfo() {
        return info;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public void setEduBg(String eduBg) {
        this.eduBg = eduBg;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Employee(String name, String gender, String age, String position, String major, String exp, String eduBg, String school, String phone, String email, String info) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.position = position;
        this.major = major;
        this.exp = exp;
        this.eduBg = eduBg;
        this.school = school;
        this.phone = phone;
        this.email = email;
        this.info = info;
    }
}
