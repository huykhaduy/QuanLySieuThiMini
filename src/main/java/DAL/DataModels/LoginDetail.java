package DAL.DataModels;

import java.sql.Timestamp;

public class LoginDetail {
    private int loginID;
    private String tenTK;
    private String authKey;
    private Timestamp loginTime;
    private Timestamp logoutTime;

    public LoginDetail() {

    }
    
    public LoginDetail(int loginID, String tenTK, String authKey, Timestamp loginTime, Timestamp logoutTime) {
        this.loginID = loginID;
        this.tenTK = tenTK;
        this.authKey = authKey;
        this.loginTime = loginTime;
        this.logoutTime = logoutTime;
    }


    public int getLoginID() {
        return this.loginID;
    }

    public void setLoginID(int loginID) {
        this.loginID = loginID;
    }


    public String getTenTK() {
        return this.tenTK;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }
    
    public String getAuthKey() {
        return this.authKey;
    }

    public void setAuthKey(String authKey) {
        this.authKey = authKey;
    }

    public Timestamp getLoginTime() {
        return this.loginTime;
    }

    public void setLoginTime(Timestamp loginTime) {
        this.loginTime = loginTime;
    }

    public Timestamp getLogoutTime() {
        return this.logoutTime;
    }

    public void setLogoutTime(Timestamp logoutTime) {
        this.logoutTime = logoutTime;
    }

    @Override
    public String toString() {
        return "{" +
            " loginID='" + getLoginID() + "'" +
            ", maTK='" + getTenTK() + "'" +
            ", authKey='" + getAuthKey() + "'" +
            ", loginTime='" + getLoginTime() + "'" +
            ", logoutTime='" + getLogoutTime() + "'" +
            "}";
    }

}
