package com.codem.mahadi.contactmanagementsystem;

public class Product {

    private int id;
    private String company_name;
    private String website;
    private String company_auth_name;
    private String email;
    private String mobileNo;
    private String tracking_id;
    private String branch_name;
    private String company_address;

    Product(int id, String company_name, String website, String company_auth_name, String email, String mobileNo) {
        this.id = id;
        this.company_name = company_name;
        this.website = website;
        this.company_auth_name = company_auth_name;
        this.email = email;
        this.mobileNo = mobileNo;
    }

    Product(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getCompany_auth_name() {
        return company_auth_name;
    }

    public void setCompany_auth_name(String company_auth_name) {
        this.company_auth_name = company_auth_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getTracking_id() {
        return tracking_id;
    }

    public void setTracking_id(String tracking_id) {
        this.tracking_id = tracking_id;
    }

    public String getBranch_name() {
        return branch_name;
    }

    public void setBranch_name(String branch_name) {
        this.branch_name = branch_name;
    }

    public String getCompany_address() {
        return company_address;
    }

    public void setCompany_address(String company_address) {
        this.company_address = company_address;
    }
}
