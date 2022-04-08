package BUS.AccountServices;

import DAL.DataAcessObject.LoginDetailDAO;
import DAL.DataAcessObject.NhanVienDAO;
import DAL.DataAcessObject.TaiKhoanDAO;
import DAL.DataModels.ChucVu;
import DAL.DataModels.LoginDetail;
import DAL.DataModels.NhanVien;
import DAL.DataModels.TaiKhoan;

public class LoginAction{
    private final TaiKhoanDAO taiKhoanDAO;
    private final LoginDetailDAO loginDetailDAO;
    private final NhanVienDAO nhanVienDAO;
    private int soTK;

    public LoginAction() {
        taiKhoanDAO = new TaiKhoanDAO();
        loginDetailDAO = new LoginDetailDAO();
        nhanVienDAO = new NhanVienDAO();
    }

    public boolean loginInput(String username, String password) {
        TaiKhoan tk = taiKhoanDAO.selectByTenTK(username);
        if (tk == null)
            return false;
        if (!tk.getMatKhau().equals(password))
            return false;
        soTK = tk.getSoTK();
        return true;
    }

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

    public int getChucVuNguoiDung(int soTK) {
        TaiKhoan taiKhoan = taiKhoanDAO.select(soTK);
        NhanVien nhanVien = nhanVienDAO.select(taiKhoan.getMaNV());
        return nhanVien.getMaChucVu();
    }

    protected void showFrame(){
        int maChucVu = getChucVuNguoiDung(soTK);
        if (maChucVu == ChucVu.NHANVIENBANHANG)
//            new NhanVienBanHangFrame(soTK);
            System.out.println("Khoi tao frame nhan vien ban hang");
        else if (maChucVu == ChucVu.NHANVIENQUANLY)
//            new NhanVienQuanLyFrame(soTK);
            System.out.println("Khoi tao frame nhan vien quan ly");

    }

    public void initLogin(){
        if (checkAuthKey())
            showFrame();
        else
            System.out.println("Hien thi form dang nhap!");
            //Initalize login form
            //new login form here: new LoginForm();
    }

    public int getSoTK() {
        return soTK;
    }

    public void setSoTK(int soTK) {
        this.soTK = soTK;
    }

    public static void main(String[] args){
//        LoginFile loginFile = new LoginFile("DUYACESS");
//        loginFile.writeToFile();
        LoginAction loginAction = new LoginAction();
        loginAction.initLogin();
//        System.out.println(loginAction.getSoTK());
    }
}
