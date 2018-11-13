package com.joinyon.crazyit.testbasemodule.bean;

import java.io.Serializable;

public class LoginBean extends BaseBean implements Serializable {
    private LoginData data;

    public LoginData getData() {
        return data;
    }

    public void setData(LoginData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "LoginBean{" +
                "data=" + data +
                '}';
    }

    public static class LoginData implements Serializable {
        private LoginBeanData loginData;
        private String token;
        private String platformAccid;

        public LoginBeanData getLoginData() {
            return loginData;
        }

        public void setLoginData(LoginBeanData loginData) {
            this.loginData = loginData;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public String getPlatformAccid() {
            return platformAccid;
        }

        public void setPlatformAccid(String platformAccid) {
            this.platformAccid = platformAccid;
        }

        @Override
        public String toString() {
            return "LoginData{" +
                    "loginData=" + loginData +
                    ", token='" + token + '\'' +
                    ", platformAccid='" + platformAccid + '\'' +
                    '}';
        }
    }

    public static class LoginBeanData implements Serializable {
        private String id;
        private String loginName;
        private String nickName;
        private String phone;
        private String email;
        private String headUrl;
        private String imHead;
        private String userid;
        private String deleted;
        private String createTime;
        private String firstLogin;
        private String appid;
        private String merchantname;
        private String industryCategory;
        private String type;
        private String token;
        private String accid;
        private String platformAccid;
        private String expiryDate;
        private String isExpiry;
        private String inviteCode;
        private String inviteCodeQr;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getLoginName() {
            return loginName;
        }

        public void setLoginName(String loginName) {
            this.loginName = loginName;
        }

        public String getNickName() {
            return nickName;
        }

        public void setNickName(String nickName) {
            this.nickName = nickName;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getHeadUrl() {
            return headUrl;
        }

        public void setHeadUrl(String headUrl) {
            this.headUrl = headUrl;
        }

        public String getImHead() {
            return imHead;
        }

        public void setImHead(String imHead) {
            this.imHead = imHead;
        }

        public String getUserid() {
            return userid;
        }

        public void setUserid(String userid) {
            this.userid = userid;
        }

        public String getDeleted() {
            return deleted;
        }

        public void setDeleted(String deleted) {
            this.deleted = deleted;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getFirstLogin() {
            return firstLogin;
        }

        public void setFirstLogin(String firstLogin) {
            this.firstLogin = firstLogin;
        }

        public String getAppid() {
            return appid;
        }

        public void setAppid(String appid) {
            this.appid = appid;
        }

        public String getMerchantname() {
            return merchantname;
        }

        public void setMerchantname(String merchantname) {
            this.merchantname = merchantname;
        }

        public String getIndustryCategory() {
            return industryCategory;
        }

        public void setIndustryCategory(String industryCategory) {
            this.industryCategory = industryCategory;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public String getAccid() {
            return accid;
        }

        public void setAccid(String accid) {
            this.accid = accid;
        }

        public String getPlatformAccid() {
            return platformAccid;
        }

        public void setPlatformAccid(String platformAccid) {
            this.platformAccid = platformAccid;
        }

        public String getExpiryDate() {
            return expiryDate;
        }

        public void setExpiryDate(String expiryDate) {
            this.expiryDate = expiryDate;
        }

        public String getIsExpiry() {
            return isExpiry;
        }

        public void setIsExpiry(String isExpiry) {
            this.isExpiry = isExpiry;
        }

        public String getInviteCode() {
            return inviteCode;
        }

        public void setInviteCode(String inviteCode) {
            this.inviteCode = inviteCode;
        }

        public String getInviteCodeQr() {
            return inviteCodeQr;
        }

        public void setInviteCodeQr(String inviteCodeQr) {
            this.inviteCodeQr = inviteCodeQr;
        }

        @Override
        public String toString() {
            return "LoginBeanData{" +
                    "id='" + id + '\'' +
                    ", loginName='" + loginName + '\'' +
                    ", nickName='" + nickName + '\'' +
                    ", phone='" + phone + '\'' +
                    ", email='" + email + '\'' +
                    ", headUrl='" + headUrl + '\'' +
                    ", imHead='" + imHead + '\'' +
                    ", userid='" + userid + '\'' +
                    ", deleted='" + deleted + '\'' +
                    ", createTime='" + createTime + '\'' +
                    ", firstLogin='" + firstLogin + '\'' +
                    ", appid='" + appid + '\'' +
                    ", merchantname='" + merchantname + '\'' +
                    ", industryCategory='" + industryCategory + '\'' +
                    ", type='" + type + '\'' +
                    ", token='" + token + '\'' +
                    ", accid='" + accid + '\'' +
                    ", platformAccid='" + platformAccid + '\'' +
                    ", expiryDate='" + expiryDate + '\'' +
                    ", isExpiry='" + isExpiry + '\'' +
                    ", inviteCode='" + inviteCode + '\'' +
                    ", inviteCodeQr='" + inviteCodeQr + '\'' +
                    '}';
        }
    }
}
