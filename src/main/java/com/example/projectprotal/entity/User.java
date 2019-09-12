package com.example.projectprotal.entity;

public class User {
    private Integer id;

    private String userUuid;

    private String username;

    private String password;

    private String email;

    private String telephone;

    private Integer role;

    private String image;

    private String lastIp;

    private String lastTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid == null ? null : userUuid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public String getLastIp() {
        return lastIp;
    }

    public void setLastIp(String lastIp) {
        this.lastIp = lastIp == null ? null : lastIp.trim();
    }


    public String getLastTime() {
        return lastTime;
    }

    public void setLastTime(String lastTime) {
        this.lastTime = lastTime == null ? null : lastTime.trim();
    }

    @Override
    public String toString() {
        return "User{" +
         "id=" + id +
         ", userUuid='" + userUuid + '\'' +
         ", username='" + username + '\'' +
         ", password='" + password + '\'' +
         ", email='" + email + '\'' +
         ", telephone='" + telephone + '\'' +
         ", role=" + role +
         ", image='" + image + '\'' +
         ", lastIp='" + lastIp + '\'' +
         ", lastTime='" + lastTime + '\'' +
         '}';
    }
}