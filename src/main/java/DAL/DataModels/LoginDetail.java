package DAL.DataModels;

import java.sql.Timestamp;

public class LoginDetail {
    private int loginID;
    private String tenTK;
    private String authKey;
    private Timestamp loginTime;
    private Timestamp logoutTime;
    private String ipAddress;
    private String macAddress;

    public LoginDetail() {

    }

    public LoginDetail(int loginID, String tenTK, String authKey, Timestamp loginTime, Timestamp logoutTime, String ipAddress, String macAddress) {
        this.loginID = loginID;
        this.tenTK = tenTK;
        this.authKey = authKey;
        this.loginTime = loginTime;
        this.logoutTime = logoutTime;
        this.ipAddress = ipAddress;
        this.macAddress = macAddress;
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

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    @Override
    public String toString() {
        return "LoginDetail{" +
                "loginID=" + loginID +
                ", tenTK='" + tenTK + '\'' +
                ", authKey='" + authKey + '\'' +
                ", loginTime=" + loginTime +
                ", logoutTime=" + logoutTime +
                ", ipAddress='" + ipAddress + '\'' +
                ", macAddress='" + macAddress + '\'' +
                '}';
    }
}
