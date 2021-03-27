package com.aliBoard.models;

import java.time.LocalDate;

public class UserProfile {

    private int id;
    private String status;
    private String name;
    private String email;
    private String telephone;
    private LocalDate birthday;
    private String paymentMethod;
    private LocalDate registryDate;
    private LocalDate unsubscribeDate;

    public UserProfile() {
    }

    public UserProfile(int id, String status, String name, String email, String telephone, LocalDate birthday, String paymentMethod, LocalDate registryDate, LocalDate unsubscribeDate) {
        this.id = id;
        this.status = status;
        this.name = name;
        this.email = email;
        this.telephone = telephone;
        this.birthday = birthday;
        this.paymentMethod = paymentMethod;
        this.registryDate = registryDate;
        this.unsubscribeDate = unsubscribeDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public LocalDate getRegistryDate() {
        return registryDate;
    }

    public void setRegistryDate(LocalDate registryDate) {
        this.registryDate = registryDate;
    }

    public LocalDate getUnsubscribeDate() {
        return unsubscribeDate;
    }

    public void setUnsubscribeDate(LocalDate unsubscribeDate) {
        this.unsubscribeDate = unsubscribeDate;
    }
}
