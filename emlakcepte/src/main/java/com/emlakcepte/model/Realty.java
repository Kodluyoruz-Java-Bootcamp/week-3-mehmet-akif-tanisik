package com.emlakcepte.model;

import com.emlakcepte.model.enums.RealtyCategory;
import com.emlakcepte.model.enums.RealtyPublishStatus;
import com.emlakcepte.model.enums.RealtyType;

import java.time.LocalDateTime;

public class Realty {

    private long no;
    private String title;
    private LocalDateTime publishedDate;
    private User user;
    private RealtyPublishStatus status;
    private String province;
    private String district;
    private RealtyType realtyType;
    private RealtyCategory category;

    public Realty() {
    }

    public Realty(String title){
        this.title = title;
        this.publishedDate = LocalDateTime.now();
        this.user = new User();
        this.status = RealtyPublishStatus.ACTIVE;
        this.realtyType = RealtyType.HOUSE;
        this.category = RealtyCategory.SALE;
    }

    public Realty(long no, String title, LocalDateTime publishedDate, User user, RealtyPublishStatus status, String province, String district, RealtyType realtyType, RealtyCategory category) {
        this.no = no;
        this.title = title;
        this.publishedDate = publishedDate;
        this.user = user;
        this.status = status;
        this.province = province;
        this.district = district;
        this.realtyType = realtyType;
        this.category = category;
    }

    public long getNo() {
        return no;
    }

    public void setNo(long no) {
        this.no = no;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(LocalDateTime publishedDate) {
        this.publishedDate = publishedDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public RealtyPublishStatus getStatus() {
        return status;
    }

    public void setStatus(RealtyPublishStatus status) {
        this.status = status;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public RealtyType getRealtyType() {
        return realtyType;
    }

    public void setRealtyType(RealtyType realtyType) {
        this.realtyType = realtyType;
    }

    public RealtyCategory getCategory() {
        return category;
    }

    public void setCategory(RealtyCategory category) {
        this.category = category;
    }
}
