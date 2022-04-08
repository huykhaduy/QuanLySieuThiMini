package BUS.AccountServices;

import DAL.DataAcessObject.LoginDetailDAO;
import DAL.DataAcessObject.NhanVienDAO;
import DAL.DataAcessObject.TaiKhoanDAO;
import DAL.DataModels.ChucVu;
import DAL.DataModels.LoginDetail;
import DAL.DataModels.NhanVien;
import DAL.DataModels.TaiKhoan;

import java.sql.Timestamp;

public class LoginAction{
    private final TaiKhoanDAO taiKhoanDAO;
    private final LoginDetailDAO loginDetailDAO;
    private final NhanVienDAO nhanVienDAO;
    private final int AUTH_KEY_EXPIRE_TIME = 1000*60*60*2; // 2 hours
    private int soTK;

    public LoginAction() {
        taiKhoanDAO = new TaiKhoanDAO();
        loginDetailDAO = new LoginDetailDAO();
        nhanVienDAO = new NhanVienDAO();
    }

    //Hàm này sẽ được gọi khi click đăng nhập ở form đăng nhập
    public boolean loginInput(String username, String password, boolean rememberMe){
        TaiKhoan tk = taiKhoanDAO.selectByTenTK(username);
        if (tk == null)
            return false;
        if (!tk.getMatKhau().equals(password))
            return false;
        soTK = tk.getSoTK();
        if (rememberMe){
            storeLoginAuth();
        }
        return true;
    }

    //Kiểm tra file lưu auth key có tồn tại hay không và trả về kết quả kiểm tra
    public boolean checkAuthKey(){
        LoginFile loginFile = new LoginFile();
        String authKey = loginFile.readFromFile();
        if (authKey == null)
            return false;
        LoginDetail loginDetail = loginDetailDAO.selectByAuthKey(authKey);
        if (loginDetail == null)
            return false;
        soTK = loginDetail.getSoTK();
        return true;
    }

    //Lấy chức vụ ng dùng từ số tài khoản
    public int getChucVuNguoiDung(int soTK) {
        TaiKhoan taiKhoan = taiKhoanDAO.select(soTK);
        NhanVien nhanVien = nhanVienDAO.select(taiKhoan.getMaNV());
        return nhanVien.getMaChucVu();
    }

    //Khởi tạo frame khi login thành công
    protected void showFrame(){
        int maChucVu = getChucVuNguoiDung(soTK);
        if (maChucVu == ChucVu.NHANVIENBANHANG)
//            new NhanVienBanHangFrame(soTK);
            System.out.println("Khoi tao frame nhan vien ban hang");
        else if (maChucVu == ChucVu.NHANVIENQUANLY)
//            new NhanVienQuanLyFrame(soTK);
            System.out.println("Khoi tao frame nhan vien quan ly");

    }

    protected void storeLoginAuth(){
        //Generate auth key and store it to file
        LoginFile loginFile = new LoginFile();
        String authKey = loginFile.createAuthKey(50);
        loginFile.setAuthKey(authKey);
        loginFile.writeToFile();
        //Store to database
        LoginDetail loginDetail = new LoginDetail(0,authKey,"192.168.1.1","None_MAC", new Timestamp(System.currentTimeMillis()), new Timestamp(System.currentTimeMillis()+AUTH_KEY_EXPIRE_TIME),soTK);
        loginDetailDAO.insert(loginDetail);
    }

    public void initLogin(){
        if (checkAuthKey())
            showFrame();
        else{
            System.out.println("Hien thi form dang nhap!");
            loginInput("duy","duy",true);
            //Initalize login form
            //new login form here: new LoginForm();
        }

    }

    public int getSoTK() {
        return soTK;
    }

    public void setSoTK(int soTK) {
        this.soTK = soTK;
    }

    public static void main(String[] args){
//        LoginFile loginFile = new LoginFile("DUYHECKER");
//        loginFile.writeToFile();
        LoginAction loginAction = new LoginAction();
        loginAction.initLogin();
    }
}
