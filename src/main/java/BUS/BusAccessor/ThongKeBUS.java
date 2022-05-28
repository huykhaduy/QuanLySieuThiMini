/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS.BusAccessor;

import java.util.List;

import DAL.DataAcessObject.HoaDonDAO;
import DTO.ChiTietHoaDon;
import DTO.ChiTietPhieuHuy;
import DTO.ChiTietPhieuNhap;
import DTO.HoaDon;
import DTO.KhachHang;
import DTO.NhanVien;
import DTO.PhieuHuy;
import DTO.PhieuNhap;
import DTO.SanPham;

/**
 *
 * @author huykh
 */
public class ThongKeBUS {
    private final SanPhamBUS spBus;
    private final NhanVienBUS nvBus;
    private final HoaDonBUS hdBus;
    private final KhachHangBUS khBus;
    private final CTHoaDonBUS cthdBus;
    private final PhieuNhapBUS phieunhapBus;
    private final CTPhieuNhapBUS ctPhieuNhapBus;
    private final PhieuHuyBUS phieuHuyBus;
    private final CTPhieuHuyBUS ctPhieuHuyBus;

    public ThongKeBUS() {
        spBus = new SanPhamBUS();
        nvBus = new NhanVienBUS();
        hdBus = new HoaDonBUS();
        cthdBus = new CTHoaDonBUS();
        phieunhapBus = new PhieuNhapBUS();
        ctPhieuNhapBus = new CTPhieuNhapBUS();
        phieuHuyBus = new PhieuHuyBUS();
        ctPhieuHuyBus = new CTPhieuHuyBUS();
        khBus = new KhachHangBUS();
    }

    public NhanVien getNhanVienBanNhieuDonNhat(List<HoaDon> listHD) {
        List<NhanVien> listNV = nvBus.getAll();
        if (listNV.isEmpty())
            return null;
        NhanVien nv = listNV.get(0);
        int max = 0;
        for (NhanVien n : listNV) {
            int count = 0;
            for (HoaDon hd : listHD) {
                if (hd.getMaNV() == n.getMaNV())
                    count++;
            }
            if (count > max) {
                max = count;
                nv = n;
            }
        }
        return nv;
    }

    public NhanVien getNhanVienCoDoanhThuCaoNhat(List<HoaDon> listHD) {
        List<NhanVien> listNV = nvBus.getAll();
        if (listNV.isEmpty())
            return null;
        NhanVien nv = listNV.get(0);
        Long max = 0L;
        for (NhanVien n : listNV) {
            Long doanhThu = 0L;
            for (HoaDon hd : listHD) {
                if (hd.getMaNV() == n.getMaNV())
                    doanhThu += hd.getTongTien();
            }
            if (doanhThu > max) {
                max = doanhThu;
                nv = n;
            }
        }
        return nv;
    }

    public int getSoLuongHoaDon(List<HoaDon> listHD) {
        return listHD.size();
    }

    public int getTongSoHoaDon() {
        List<HoaDon> listHD = hdBus.getAll();
        return listHD.size();
    }

    public KhachHang getKhachHangMuaNhieuDon(List<HoaDon> listHD) {
        List<KhachHang> listKH = khBus.getAll();
        if (listKH.isEmpty())
            return null;
        KhachHang kh = listKH.get(0);
        int max = 0;
        for (KhachHang k : listKH) {
            int count = 0;
            for (HoaDon hd : listHD) {
                if (hd.getMaKH() == k.getMaKH())
                    count++;
            }
            if (count > max) {
                max = count;
                kh = k;
            }
        }
        return kh;
    }

    public KhachHang getKhachHangDoanhThuCaoNhat(List<HoaDon> listHD) {
        List<KhachHang> listKH = khBus.getAll();
        if (listKH.isEmpty())
            return null;
        KhachHang kh = listKH.get(0);
        Long max = 0L;
        for (KhachHang k : listKH) {
            Long doanhThu = 0L;
            for (HoaDon hd : listHD) {
                if (hd.getMaKH() == k.getMaKH())
                    doanhThu += (hd.getTongTien() - hd.getTienGiam());
            }
            if (doanhThu > max) {
                max = doanhThu;
                kh = k;
            }
        }
        return kh;
    }
    
    public Long getDoanhThuThang(List<HoaDon> listHD) {
        Long doanhThu = 0L;
        if (listHD.isEmpty())
            return 0L;
        for (HoaDon hd : listHD) {
            doanhThu += (hd.getTongTien() - hd.getTienGiam());
        }
        return doanhThu;
    }

    public int getTongSanPhamBanDuoc(List<HoaDon> listHD) {
        int tong = 0;
        if (listHD.isEmpty()) {
            return 0;
        }
        for (HoaDon hd : listHD) {
            List<ChiTietHoaDon> listCTHD = cthdBus.getByKey1(hd.getMaHD());
            for (ChiTietHoaDon cthd : listCTHD) {
                tong += cthd.getSoLuong();
            }
        }
        return tong;
    }

    public Long getTongDoanhThu() {
        List<HoaDon> listHD = hdBus.getAll();
        Long doanhThu = 0L;
        for (HoaDon hd : listHD) {
            doanhThu += (hd.getTongTien() - hd.getTienGiam());
        }
        return doanhThu;
    }

    public int getTongSanPhamDaBan() {
        List<HoaDon> listHD = hdBus.getAll();
        int tong = 0;
        for (HoaDon hd : listHD) {
            List<ChiTietHoaDon> listCTHD = cthdBus.getByKey1(hd.getMaHD());
            for (ChiTietHoaDon cthd : listCTHD) {
                tong += cthd.getSoLuong();
            }
        }
        return tong;
    }

    public int getTongSanPhamNhap(List<PhieuNhap> list) {
        if (list.isEmpty())
            return 0;
        int tong = 0;
        for (PhieuNhap ph : list) {
            List<ChiTietPhieuNhap> listCT = ctPhieuNhapBus.getByKey1(ph.getMaPhieu());
            for (ChiTietPhieuNhap ct : listCT) {
                tong += ct.getSoLuong();
            }
        }
        return tong;
    }

    public int getTongSanPhamHuy(List<PhieuHuy> listCT) {
        if (listCT.isEmpty())
            return 0;
        int tong = 0;
        for (PhieuHuy ct : listCT) {
            List<ChiTietPhieuHuy> listCTHuy = ctPhieuHuyBus.getByKey1(ct.getMaPhieu());
            for (ChiTietPhieuHuy ctph : listCTHuy) {
                tong += ctph.getSoLuong();
            }
        }
        return tong;
    }

    public SanPham getSanPhamHuyNhieuNhat(List<PhieuHuy> list) {
        if (list.isEmpty())
            return null;
        List<SanPham> listSP = spBus.getAll();
        SanPham sp = spBus.getAll().get(0);
        int max = 0;
        for (SanPham sanpham : listSP) {
            int count = 0;
            for (PhieuHuy ph : list) {
                List<ChiTietPhieuHuy> listCT = ctPhieuHuyBus.getByKey1(ph.getMaPhieu());
                for (ChiTietPhieuHuy ctph : listCT) {
                    if (sanpham.getMaSP() == ctph.getMaSP())
                        count++;
                }
            }
            if (count > max) {
                max = count;
                sp = sanpham;
            }
        }
        return sp;
    }

    public SanPham getSanPhamNhapNhieuNhat(List<PhieuNhap> list) {
        if (list.isEmpty())
            return null;
        List<SanPham> listSP = spBus.getAll();
        SanPham sp = spBus.getAll().get(0);
        int max = 0;
        for (SanPham sanpham : listSP) {
            int count = 0;
            for (PhieuNhap ph : list) {
                List<ChiTietPhieuNhap> listCT = ctPhieuNhapBus.getByKey1(ph.getMaPhieu());
                for (ChiTietPhieuNhap ctph : listCT) {
                    if (sanpham.getMaSP() == ctph.getMaSP())
                        count++;
                }
            }
            if (count > max) {
                max = count;
                sp = sanpham;
            }
        }
        return sp;
    }
    
}
