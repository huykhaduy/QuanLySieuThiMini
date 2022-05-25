/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL.Exel;

import BUS.BusAccessor.CTHoaDonBUS;
import BUS.BusAccessor.SanPhamBUS;
import BUS.SaleServices.Money;
import DAL.DataModels.ChiTietHoaDon;
import DAL.DataModels.SanPham;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author huykh
 */
public class HTMLTemplate {
    private static SanPhamBUS spBus = new SanPhamBUS();
   
    public static String getHTMLTemplate(String maHD, String tgBanHang, String tenNV, String tenKH, String listProduct, String tienTong, String tienGiam, String tienPhaiTra){
        String html = """
               <!DOCTYPE html>
               <html>
                 <head>
                   <meta charset="utf-8" />
                   <meta http-equiv="X-UA-Compatible" content="IE=edge" />
                   <title></title>
                   <meta name="description" content="" />
                   <meta name="viewport" content="width=device-width, initial-scale=1" />
                   <link rel="stylesheet" href="" />
                   <style>
                     * {
                             padding: 0;
                             margin: 0;
                             box-sizing: border-box;
                             font-weight: normal;
                             font-family: sans-serif;
                           }
                           table {
                             border-collapse: collapse;
                             width: 700px;
                           }
                     
                           td,
                           th {
                             border: 1px solid rgb(213, 227, 237);
                             text-align: left;
                             padding: 8px;
                           }
                     
                           tr:nth-child(even) {
                             background-color: rgb(213, 230, 234);
                           }
                           .header_content {
                             height: 250px;
                             display: flex;
                           }
                           .header_mahoadon_title {
                             color: rgb(115, 113, 113);
                           }
                           .header_ngaythanhtoan {
                             margin-top: 30px;
                           }
                           .header_mahoadon_info {
                             color: white;
                             background-color: rgb(119, 185, 232);
                             width: 110px;
                             font-size: 20px;
                             text-align: center;
                             padding: 5px;
                             margin-top: 5px;
                             font-weight: bold;
                           }
                           .header_image {
                             position: absolute;
                             left: 200px;
                             top: 0px;
                           }
                           .hoadon{
                             color:rgb(119, 185, 232);
                             font-weight: bold;
                             font-size: 20px;
                             text-align: center;
                             margin-bottom: 20px;
                           }
                           .title_content{
                             position: absolute;
                             left: 550px;
                             top: 60px;
                           }
                           .nguoibanhang{
                             margin: 5px 0px;
                             margin-bottom: 20px;
                           }
                           .nguoimuahang{
                             margin-top: 5px;
                           }
                           .thongtinmuahang{
                             margin-bottom: 10px;
                             color: rgb(119, 185, 232);
                             font-weight: bold;
                           }
                           .total_content{
                             text-align: right;
                             margin-right: 80px;
                             margin-top: 30px;
                           }
                           .line{
                             margin: 5px 0px;
                           }
                           .thankforbuy{
                             text-align: center;
                             color: rgb(255, 255, 255);
                             background-color: rgb(119, 185, 232);
                             padding: 10px;
                             margin-top: 30px;
                           }
                   </style>
                 </head>
                 <body>
                   <div class="hoadon">H\u00d3A \u0110\u01a0N B\u00c1N H\u00c0NG</div>
                   <div class="header_content">
                     <div class="header_mahoadon">
                       <div class="header_mahoadon_title">M\u00c3 H\u00d3A \u0110\u01a0N:</div>
                       <div class="header_mahoadon_info">%s</div>
                       <div class="header_ngaythanhtoan">
                         <div class="header_ngaythanhtoan_title">Ng\u00e0y thanh to\u00e1n:</div>
                         <div class="header_ngaythanhtoan_info">%s</div>
                       </div>
                     </div>
                     <div class="header_image">
                       <img src="./payment.png" alt="" style="width: 300px" />
                     </div>
                   </div>
                   <div class="title_content">
                     <div class="nguoibanhang_tilte">Nh\u00e2n vi\u00ean b\u00e1n h\u00e0ng: </div>
                     <div class="nguoibanhang">%s</div>
                     <div class="nguoimuahang_tilte">Kh\u00e1ch h\u00e0ng: </div>
                     <div class="nguoimuahang">%s</div>
                   </div>
                   <div class="thongtinmuahang">
                     Th\u00f4ng tin mua h\u00e0ng
                   </div>
                   <div class="buying_content">
                     <table>
                       <tr>
                         <td>STT</td>
                         <td>T\u00ean s\u1ea3n ph\u1ea9m</td>
                         <td>S\u1ed1 l\u01b0\u1ee3ng</td>
                         <td>\u0110\u01a1n gi\u00e1</td>
                         <td>Th\u00e0nh ti\u1ec1n</td>
                       </tr>
                       %s
                     </table>
                   </div>
                   <div class="total_content">
                     <div class="total_title">
                       <div class="line">
                         T\u1ed5ng ti\u1ec1n: %s
                       </div>
                       <div class="line">
                         Ti\u1ec1n gi\u1ea3m: %s
                       </div>
                       <div class="line" style="color:rgb(119, 185, 232);font-weight: bold">
                         Ti\u1ec1n tr\u1ea3: %s
                       </div>
                     </div>
                   </div>
                   <div class="thankforbuy">
                       C\u1ea3m \u01a1n \u0111\u00e3 mua h\u00e0ng t\u1ea1i MiniMart. Ch\u00fac b\u1ea1n 1 ng\u00e0y t\u1ed1t l\u00e0nh !
                   </div>
                 </body>
               </html>""".formatted(maHD, tgBanHang, tenNV, tenKH, listProduct, tienTong, tienGiam, tienPhaiTra);
        return html;
    }
    
    public static String convertChiTietSPToHTML(List<ChiTietHoaDon> list){
        if (list == null || list.isEmpty())
            return "";
        String content = "";
        int i = 1;
        for (ChiTietHoaDon cthd:list){
            SanPham sp = spBus.get(cthd.getMaSP());
            content += """
                      <tr>
                        <td>%d</td>
                        <td>%s</td>
                        <td>%s</td>
                        <td>%d</td>
                        <td>%s</td>
                      </tr>""".formatted(i, sp.getTenSP(), Money.format(cthd.getGiaTien()), cthd.getSoLuong(), Money.format(cthd.getGiaTien()*cthd.getSoLuong()));
            i++;
        }
        return content;
    }
    
    public static void main(String[] args){
        CTHoaDonBUS cthd = new CTHoaDonBUS();
        List<ChiTietHoaDon> list = cthd.getByKey1(2);
        String str = convertChiTietSPToHTML(list);
        String html = getHTMLTemplate("1", "11/06/2002", "duy", "meo", str, "30000", "50000", "200000");
        System.out.println(html);
    }
    
}
