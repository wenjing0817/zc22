package com.zy.user.pojo;

public class User {

    private Integer us_id;
    private  String us_email;
    private  String us_name;
    private  String us_password;
    private  Double us_money;
    private  String us_idcard;
    private  String us_phone;
    private  String us_address;
    private  Integer us_role;
    private  String us_sex;
    private  String us_code;

    public Integer getUs_id() {
        return us_id;
    }

    public void setUs_id(Integer us_id) {
        this.us_id = us_id;
    }

    public String getUs_email() {
        return us_email;
    }

    public void setUs_email(String us_email) {
        this.us_email = us_email;
    }

    public String getUs_name() {
        return us_name;
    }

    public void setUs_name(String us_name) {
        this.us_name = us_name;
    }

    public String getUs_password() {
        return us_password;
    }

    public void setUs_password(String us_password) {
        this.us_password = us_password;
    }

    public Double getUs_money() {
        return us_money;
    }

    public void setUs_money(Double us_money) {
        this.us_money = us_money;
    }

    public String getUs_idcard() {
        return us_idcard;
    }

    public void setUs_idcard(String us_idcard) {
        this.us_idcard = us_idcard;
    }

    public String getUs_phone() {
        return us_phone;
    }

    public void setUs_phone(String us_phone) {
        this.us_phone = us_phone;
    }

    public String getUs_address() {
        return us_address;
    }

    public void setUs_address(String us_address) {
        this.us_address = us_address;
    }

    public Integer getUs_role() {
        return us_role;
    }

    public void setUs_role(Integer us_role) {
        this.us_role = us_role;
    }

    public String getUs_sex() {
        return us_sex;
    }

    public void setUs_sex(String us_sex) {
        this.us_sex = us_sex;
    }

    public String getUs_code() {
        return us_code;
    }

    public void setUs_code(String us_code) {
        this.us_code = us_code;
    }

    @Override
    public String toString() {
        return "User{" +
                "us_id=" + us_id +
                ", us_email='" + us_email + '\'' +
                ", us_name='" + us_name + '\'' +
                ", us_password='" + us_password + '\'' +
                ", us_money=" + us_money +
                ", us_idcard='" + us_idcard + '\'' +
                ", us_phone='" + us_phone + '\'' +
                ", us_address='" + us_address + '\'' +
                ", us_role=" + us_role +
                ", us_sex='" + us_sex + '\'' +
                ", us_code='" + us_code + '\'' +
                '}';
    }

    public User() {
        super();
    }

    public User(Integer us_id, String us_email, String us_name, String us_password, Double us_money, String us_idcard, String us_phone, String us_address, Integer us_role, String us_sex, String us_code) {
        this.us_id = us_id;
        this.us_email = us_email;
        this.us_name = us_name;
        this.us_password = us_password;
        this.us_money = us_money;
        this.us_idcard = us_idcard;
        this.us_phone = us_phone;
        this.us_address = us_address;
        this.us_role = us_role;
        this.us_sex = us_sex;
        this.us_code = us_code;
    }
}
