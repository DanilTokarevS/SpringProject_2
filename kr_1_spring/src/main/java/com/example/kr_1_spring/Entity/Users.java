package com.example.kr_1_spring.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="all_users")
public class Users {

    @Id
    @Column(name = "user_id")
    private int userId;

    @Column(name = "auth_token")
    private String authToken;

    @Column(name = "user_name")
    private String username;

    @Column(name = "position_on_starship")
    private String positionOnStarship;

    @Column(name = "age")
    private int age;

    @Column(name = "sex")
    private String sex;

    @Column(name = "balance")
    private int balance;

    @Column(name = "background")
    private String background;

    @Column(name = "public_background")
    private String publicBackground;

    @Column(name = "photo")
    private String photo;

    @Column(name = "security_background")
    private String securityBackground;

    @Column(name = "medical_background")
    private String medicalBackground;

    @Column(name = "psychology_background")
    private String psychologyBackground;

    @Column(name = "last_available")
    private int lastAvailable;

    @Column(name = "user_settings")
    private int userSettings;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPositionOnStarship() {
        return positionOnStarship;
    }

    public void setPositionOnStarship(String positionOnStarship) {
        this.positionOnStarship = positionOnStarship;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getPublicBackground() {
        return publicBackground;
    }

    public void setPublicBackground(String publicBackground) {
        this.publicBackground = publicBackground;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getSecurityBackground() {
        return securityBackground;
    }

    public void setSecurityBackground(String securityBackground) {
        this.securityBackground = securityBackground;
    }

    public String getMedicalBackground() {
        return medicalBackground;
    }

    public void setMedicalBackground(String medicalBackground) {
        this.medicalBackground = medicalBackground;
    }

    public String getPsychologyBackground() {
        return psychologyBackground;
    }

    public void setPsychologyBackground(String psychologyBackground) {
        this.psychologyBackground = psychologyBackground;
    }

    public int getLastAvailable() {
        return lastAvailable;
    }

    public void setLastAvailable(int lastAvailable) {
        this.lastAvailable = lastAvailable;
    }

    public int getUserSettings() {
        return userSettings;
    }

    public void setUserSettings(int userSettings) {
        this.userSettings = userSettings;
    }

}
