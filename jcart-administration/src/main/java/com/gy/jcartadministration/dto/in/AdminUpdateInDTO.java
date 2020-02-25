package com.gy.jcartadministration.dto.in;

public class AdminUpdateInDTO {
    private Integer administrator_id;
    private String realName;
    private String password;
    private String email;
    private Byte status;

    public Integer getAdministrator_id() {
        return administrator_id;
    }

    public void setAdministrator_id(Integer administrator_id) {
        this.administrator_id = administrator_id;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}
