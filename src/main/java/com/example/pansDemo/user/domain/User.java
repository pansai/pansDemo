package com.example.pansDemo.user.domain;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

  private Long userId;

  private String uname;

  private String iconImgUrl;

  private String mobile;

  private String email;

  private String passwd; //登录密码

  private Short authLevel;

  private String securityPwd; //支付密码

  private Long inviteesUserId;

  private Date createdAt;

  private Date updatedAt;

  private Date LastLoginTime; //最后登录时间

  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public String getUname() {
    return uname;
  }

  public void setUname(String uname) {
    this.uname = uname;
  }

  public String getIconImgUrl() {
    return iconImgUrl;
  }

  public void setIconImgUrl(String iconImgUrl) {
    this.iconImgUrl = iconImgUrl;
  }

  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPasswd() {
    return passwd;
  }

  public void setPasswd(String passwd) {
    this.passwd = passwd;
  }

  public Short getAuthLevel() {
    return authLevel;
  }

  public void setAuthLevel(Short authLevel) {
    this.authLevel = authLevel;
  }

  public String getSecurityPwd() {
    return securityPwd;
  }

  public void setSecurityPwd(String securityPwd) {
    this.securityPwd = securityPwd;
  }

  public Long getInviteesUserId() {
    return inviteesUserId;
  }

  public void setInviteesUserId(Long inviteesUserId) {
    this.inviteesUserId = inviteesUserId;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public Date getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Date getLastLoginTime() {
    return LastLoginTime;
  }

  public void setLastLoginTime(Date lastLoginTime) {
    LastLoginTime = lastLoginTime;
  }

  @Override
  public String toString() {
    return "User{" +
        "userId=" + userId +
        ", uname='" + uname + '\'' +
        ", iconImgUrl='" + iconImgUrl + '\'' +
        ", mobile='" + mobile + '\'' +
        ", email='" + email + '\'' +
        ", passwd='" + passwd + '\'' +
        ", authLevel=" + authLevel +
        ", securityPwd='" + securityPwd + '\'' +
        ", inviteesUserId=" + inviteesUserId +
        ", createdAt=" + createdAt +
        ", updatedAt=" + updatedAt +
        ", LastLoginTime=" + LastLoginTime +
        '}';
  }
}
