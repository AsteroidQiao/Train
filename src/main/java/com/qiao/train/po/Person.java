package com.qiao.train.po;

public class Person {
    private String name;
    private String psd;
    private String gender;
    private String data;
    private String admin;
    private String self;

    public String getName() {
        return name;
    }

    public String getPsd() {
        return psd;
    }

    public String getGender() {
        return gender;
    }

    public String getData() {
        return data;
    }

    public String getAdmin() {
        return admin;
    }

    public String getSelf() {
        return self;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPsd(String psd) {
        this.psd = psd;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public Person(String name, String psd, String gender, String data, String admin, String self) {
        this.name = name;
        this.psd = psd;
        this.gender = gender;
        this.data = data;
        this.admin = admin;
        this.self = self;
    }

    public Person() {
    }
}
