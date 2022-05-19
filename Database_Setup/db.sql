CREATE DATABASE SieuThiMini;

USE SieuThiMini;

-- Duy

CREATE TABLE NHACUNGCAP(
  MANCC int NOT NULL PRIMARY KEY AUTO_INCREMENT, 
  TENNCC varchar(50), 
  DIACHI varchar(100), 
  SDT varchar(11), 
  EMAIL varchar(50), 
  IS_DELETED boolean
);

CREATE TABLE LOAISANPHAM(
  MALOAI int NOT NULL PRIMARY KEY, 
  TENLOAI varchar(50), 
  MOTA varchar(100), 
  IS_DELETED boolean
);

CREATE TABLE SANPHAM(
  MASP int NOT NULL AUTO_INCREMENT PRIMARY KEY, 
  TENSP varchar(50), 
  MOTA varchar(500), 
  SOLUONG int, 
  HINHANH varchar(100), 
  GIATIEN bigint, 
  MALOAI int, 
  MANCC int, 
  IS_DELETED boolean
);

CREATE TABLE VOUCHER(
  SOVOUCHER int NOT NULL PRIMARY KEY AUTO_INCREMENT, 
  MAVOUCHER varchar(11) NOT NULL, 
  MOTA varchar(100), 
  NGAYBD datetime, 
  NGAYKT datetime, 
  GIATRITOITHIEU bigint, 
  KMTOIDA bigint, 
  PTGIAM int, 
  SOLUOTSD int, 
  IS_DELETED boolean
);

CREATE TABLE GIAMGIASP(
  SOPHIEU int NOT NULL PRIMARY KEY AUTO_INCREMENT, 
  NGAYBD datetime, NGAYKT datetime, 
  PTGIAM int, MASP int, IS_DELETED boolean
);

CREATE TABLE PHIEUHUY(
  MAPHIEU int NOT NULL AUTO_INCREMENT PRIMARY KEY, 
  NGAYLAP datetime, MANV int, IS_DELETED boolean
);

CREATE TABLE CTPHIEUHUY(
  MAPHIEU int NOT NULL, 
  MASP int NOT NULL, 
  SOLUONG int, 
  PRIMARY KEY (MAPHIEU, MASP)
);

CREATE TABLE PHIEUNHAP(
  MAPHIEU int NOT NULL AUTO_INCREMENT PRIMARY KEY, 
  NGAYLAP datetime, MANV int, IS_DELETED boolean
);

CREATE TABLE CTPHIEUNHAP(
  MAPHIEU int NOT NULL, 
  MASP int NOT NULL, 
  SOLUONG int, 
  PRIMARY KEY (MAPHIEU, MASP)
);

CREATE TABLE CTHOADON(
  MAHD int NOT NULL, 
  MASP int NOT NULL, 
  SOLUONG int, 
  GIATIEN bigint, 
  PRIMARY KEY (MAHD, MASP)
);
-- Thay doi khoa cua MANV va MAKH thanh INT
-- Thay doi ma HD thanh INT
-- Thay doi maChucVu thanh INT
-- Tuan
CREATE TABLE HOADON (
  MAHD int NOT NULL AUTO_INCREMENT PRIMARY KEY, 
  NGAYHD DATETIME, 
  HINHTHUC VARCHAR(20), 
  TONGTIEN bigint, 
  TIENGIAM bigint, 
  MANV INT, 
  MAKH INT, 
  SOVOUCHER INT, 
  IS_DELETED BOOLEAN
);

CREATE TABLE NHANVIEN (
  MANV INT NOT NULL AUTO_INCREMENT PRIMARY KEY, 
  TENNV VARCHAR(50), 
  GIOITINH BOOLEAN, 
  CMND VARCHAR(15), 
  NGAYSINH DATE, 
  SODIENTHOAI INT(11), 
  EMAIL VARCHAR(50), 
  DIACHI VARCHAR(100), 
  NGAYTHAMGIA DATE, 
  MACHUCVU INT, 
  IS_DELETED BOOLEAN
);

CREATE TABLE KHACHHANG (
  MAKH INT NOT NULL AUTO_INCREMENT PRIMARY KEY, 
  TENKH VARCHAR(50), 
  GIOITINH BOOLEAN, 
  SODIENTHOAI INT(11), 
  DIACHI VARCHAR(100), 
  EMAIL VARCHAR(50), 
  DIEMTHUONG BIGINT, 
  IS_DELETED BOOLEAN
);

CREATE TABLE TAIKHOAN (
  SOTK INT NOT NULL AUTO_INCREMENT PRIMARY KEY, 
  TENTK VARCHAR(50), 
  MATKHAU VARCHAR(50), 
  MANV INT, 
  SOLANSAI INT, 
  NGAYTAO DATETIME, 
  IS_DELETED BOOLEAN
);

CREATE TABLE CHUCVU (
  MACHUCVU INT NOT NULL AUTO_INCREMENT PRIMARY KEY, 
  TENCHUCVU VARCHAR(50), 
  MOTA VARCHAR(100), 
  IS_DELETED boolean
);

CREATE TABLE LOGIN_DETAIL (
  LOGIN_ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY, 
  AUTH_KEY VARCHAR(50), 
  IP_ADDRESS VARCHAR(20), 
  MAC_ADDRESS VARCHAR(20), 
  LOGIN_TIME DATETIME, 
  LOGOUT_TIME DATETIME, 
  SOTK INT
);

-- Duy

ALTER TABLE SANPHAM ADD CONSTRAINT FK_SANPHAM_LOAISANPHAM
FOREIGN KEY (MALOAI) REFERENCES LOAISANPHAM(MALOAI);


ALTER TABLE SANPHAM ADD CONSTRAINT FK_SANPHAM_NHACUNGCAP
FOREIGN KEY (MANCC) REFERENCES NHACUNGCAP(MANCC);


ALTER TABLE GIAMGIASP ADD CONSTRAINT FK_GIAMGIASP_SANPHAM
FOREIGN KEY (MASP) REFERENCES SANPHAM(MASP);


ALTER TABLE CTPHIEUNHAP ADD CONSTRAINT FK_CHITIETPHIEUNHAP_SP_MASP
FOREIGN KEY (MASP) REFERENCES SANPHAM(MASP);


ALTER TABLE CTPHIEUNHAP ADD CONSTRAINT FK_CHITIETPHIEUNHAP_SP_PHIEUNHAP
FOREIGN KEY (MAPHIEU) REFERENCES PHIEUNHAP(MAPHIEU);


ALTER TABLE CTPHIEUHUY ADD CONSTRAINT FK_CHITIETPHIEUHUY_SP_PHIEUHUY
FOREIGN KEY (MAPHIEU) REFERENCES PHIEUHUY(MAPHIEU);


ALTER TABLE CTPHIEUHUY ADD CONSTRAINT FK_CHITIETPHIEUHUY_SP_MASP
FOREIGN KEY (MASP) REFERENCES SANPHAM(MASP);


ALTER TABLE PHIEUNHAP ADD CONSTRAINT FK_PHIEUNHAP_MANV
FOREIGN KEY (MANV) REFERENCES NHANVIEN(MANV);


ALTER TABLE PHIEUHUY ADD CONSTRAINT FK_PHIEUHUY_MANV
FOREIGN KEY (MANV) REFERENCES NHANVIEN(MANV);

-- Tuan

ALTER TABLE hoadon ADD CONSTRAINT FK_HOADON_NHANVIEN
FOREIGN KEY (MANV) REFERENCES nhanvien(MANV);


ALTER TABLE hoadon ADD CONSTRAINT FK_HOADON_KHACHHANG
FOREIGN KEY (MAKH) REFERENCES khachhang(MAKH);


ALTER TABLE hoadon ADD CONSTRAINT FK_HOADON_VOUCHER
FOREIGN KEY (SOVOUCHER) REFERENCES voucher(SOVOUCHER);


ALTER TABLE CTHOADON ADD CONSTRAINT FK_CTHOADON_HOADON
FOREIGN KEY (MAHD) REFERENCES hoadon(MAHD);


ALTER TABLE CTHOADON ADD CONSTRAINT FK_CTHOADON_SANPHAM
FOREIGN KEY (MASP) REFERENCES sanpham(MASP);


ALTER TABLE nhanvien ADD CONSTRAINT FK_NHANVIEN_CHUCVU
FOREIGN KEY (MACHUCVU) REFERENCES chucvu(MACHUCVU);


ALTER TABLE TAIKHOAN ADD CONSTRAINT FK_TAIKHOAN_NHANVIEN
FOREIGN KEY (MANV) REFERENCES NHANVIEN(MANV);


ALTER TABLE login_detail ADD CONSTRAINT FK_LOGIN_TAIKHOAN
FOREIGN KEY (SOTK) REFERENCES taikhoan(SOTK);

# Xóa data cũ
DELETE FROM GIAMGIASP;
DELETE FROM TAIKHOAN;
DELETE FROM NHANVIEN;
DELETE FROM CHUCVU;
DELETE FROM SANPHAM;
DELETE FROM NHACUNGCAP;
DELETE FROM LOAISANPHAM;
DELETE FROM VOUCHER;
DELETE FROM KHACHHANG;

ALTER TABLE LOAISANPHAM AUTO_INCREMENT = 1;
INSERT INTO `loaisanpham`(`MALOAI`, `TENLOAI`, `MOTA`, `IS_DELETED`)
VALUES 
       (0,'Tất cả','Tất cả sản phẩm trong cửa hàng', 0),
       (1,'Đồ uống','Nước khoáng, nước đóng chai, nước ngọt, nước tăng lực, rượu bia, ....',0),
       (2,'Đồ ăn vặt','Bánh, kẹo các loại, socola,....',0),
       (3,'Đồ ăn chế biến','Mì, bánh mì, cơm, ....',0),
       (4,'Thực phẩm','Trứng, thịt, cá, rau,....',0),
       (5,'Đồ dùng khác','Kem đánh răng, áo mưa, dù, dầu gội, sữa tắm....',0);

ALTER TABLE NHACUNGCAP AUTO_INCREMENT = 1;
INSERT INTO NHACUNGCAP (MANCC, TENNCC, DIACHI, SDT, EMAIL, IS_DELETED)
VALUES (1, 'PepsiCo', 'Hoa Kỳ', '028 3821 9436', 'recruitment@intl.pepsico.com',0),
       (2, 'Coca Cola', 'Hoa Kỳ', '028 3896 1000', 'trucle@coca-cola.com',0),
       (3, 'Chương Dương', 'Việt Nam', '( 84-8) 3836 751', 'info@cdbeco.com.vn',0),
       (4, 'Masan', 'Việt Nam', '+84 28 62563862', 'pr@msn.masangroup.com',0),
       (5, 'Red Bull', 'Thái Lan', '+84 28 9232862', 'customerservice@redbullshopus.com',0),
       (6, 'Carlsberg', 'Đan Mạch', '+84 28 62563862', 'trangthanhphuc91@gmail.com',0),
       (7, 'Lotte', 'Hàn Quốc', '1900 6778', 'cs@lotte.vn',0),
       (8,'Trident', 'Hoa Kỳ','1900 6998', 'cs@trident.vn',0),
       (9, 'Perfetti Van Melle SPA', 'Italy','1900 6798', 'cs@perfertti.vn',0),
       (10, 'Orion Corporation', 'Hàn Quốc','1900 6398', 'cs@orion.vn',0),
       (11, 'Nestlé', 'Thụy Sĩ','1900 6318', 'cs@nestle.vn',0),
       (12,'MiniMart', 'Việt Nam', '0365336991', 'huynhkhaduy@gmail.com',0),
       (13,'GreenFeed', 'Việt Nam', '0343336998', 'cs@feddy.com.vn',0),
       (14,'We Care', 'Việt Nam', '0399936998', 'cs@wecare.com.vn',0),
       (15,'Silkwell', 'Việt Nam', '0399936312', 'cs@silkwell .com.vn',0),
       (16,'Unilever ', 'Anh và Hà Lan', '0399936302', 'cs@unilever.com.vn',0),
       (17,'Gatsby ', 'Nhật Bản', '0323936302', 'cs@gatsby.com.vn',0),
       (18,'3M  ', 'Hoa Kỳ', '0323921302', 'cs@3M.com.vn',0),
       (19,'Colgate   ', 'Hoa Kỳ', '0321231302', 'cs@Colgate .com.vn',0);

ALTER TABLE SANPHAM AUTO_INCREMENT = 1;
INSERT INTO sanpham
VALUES (NULL, 'Pepsi', 'Từ thương hiệu nước ngọt có gas nổi tiếng toàn cầu với mùi vị thơm ngon với hỗn hợp hương tự nhiên cùng chất tạo ngọt tổng hợp, giúp xua tan cơn khát và cảm giác mệt mỏi.  Nước ngọt bổ sung năng lượng làm việc mỗi ngày. Cam kết sản phẩm chính hãng, chất lượng và an toàn', 30, 'pepsi', 10600, 1, 1,0),
       (NULL, 'Sprite', 'Hương vị được ưa chuộng tại hơn 190 quốc gia và lọt top những nước giải khát được yêu thích nhất toàn cầu. Với vị chanh tươi mát cùng những bọt ga sảng khoái tê đầu lưỡi giúp bạn đập tan cơn khát ngay tức thì. Sản phẩm cam kết chính hãng, chất lượng và an toàn từ nhà Sprite', 50, 'sprite', 8800, 1, 2,0),
       (NULL, 'Coca', 'Là loại nước ngọt được nhiều người yêu thích với hương vị thơm ngon, sảng khoái. 6 lon nước ngọt Coca Cola 320ml với lượng gas lớn sẽ giúp bạn xua tan mọi cảm giác mệt mỏi, căng thẳng, đem lại cảm giác thoải mái sau khi hoạt động ngoài trời.', 100, 'coca', 10500, 1, 2,0),
       (NULL, 'Fanta Cam', 'Là sản phẩm nước ngọt có gas của thương hiệu Fanta nổi tiếng giúp giải khát sau khi hoạt động ngoài trời, giải tỏa căng thẳng, mệt mỏi khi học tập, làm việc. 6 lon nước ngọt Fanta hương cam lon 330ml thơm ngon kích thích vị giác, chứa nhiều vitamin C sẽ cung cấp năng lượng cho cơ thể khỏe mạnh.', 20, 'Fanta Cam', 8800, 1, 2,0),
       (NULL, 'Fanta Việt Quất', 'Là sản phẩm nước ngọt có gas của thương hiệu Fanta nổi tiếng giúp giải khát sau khi hoạt động ngoài trời, giải tỏa căng thẳng, mệt mỏi. 6 lon nước ngọt Fanta hương việt quất lon 330ml thơm ngon, giúp tiêu hóa thức ăn nhanh hơn, tránh đầy bụng, dễ dàng thưởng thức được nhiều món ngon hấp dẫn.',30, 'Fanta Viet Quat', 8800, 1, 2,0),
       (NULL, '7 Up', 'Từ thương hiệu nước giải khát 7Up uy tín được nhiều người ưa chuộng. Nước ngọt 7 Up hương chanh lon 320ml có vị ngọt vừa phải và hương vị gas the mát, giúp bạn xua tan nhanh chóng cơn khát, giảm cảm giác ngấy, kích thích vị giác giúp ăn ngon hơn, cung cấp năng lượng cho tinh thần tươi vui mỗi ngày.', 15, '7up', 11000, 1, 1,0),
       (NULL, 'Sá xị', 'Là sản phẩm truyền thống đặc trưng của Chương Dương mang hương vị độc đáo rất được ưa chuộng. Với hương vị sá xị nồng nàn đi kèm với các thành phần quế, hồi hỗ trợ tốt cho hệ tiêu hóa, tuần hoàn, làm ấm cơ thể...cung cấp năng lượng và hàm lượng khoáng chất dồi dào xua đi cơn khát, căng thẳng mệt mỏi.', 22, 'Saxi', 8400, 1, 3,0),
       (NULL, 'Soda', 'Sản xuất theo dây chuyền công nghệ hiện đại kiểm định nghiêm ngặt. Nước Soda Schweppes lon 330ml là thức uống giải khát giúp bổ sung vitamin và khoáng chất tốt cho cơ thể, giúp hanh chóng để bù nước cho cơ thể khi vận động nhiều hoặc chơi thể thao. Cam kết chất lượng an toàn từ thương hiệu Schweppes', 27, 'Soda', 6800, 1, 2,0),
       (NULL, 'Vivant', '  Sản phẩm nước uống đóng chai từ thương hiệu Vivant. Nước khoáng Vivant 500ml từ nguồn khoáng nổi tiếng từ Vĩnh Hảo và Quang Hanh, với tiêu chí dễ uống, c hứa nhiều khoáng chất hòa tan tự nhiên trong nước có tác dụng tốt cho sức khỏe con người. Cam kết chính hãng và an toàn', 150, 'vivant', 4600, 1, 4,0),
       (NULL, 'Aquafina', ' Được lấy từ nguồn nước ngầm đảm bảo  trải qua quy trình khử trùng, lọc sạch các tạp chất. Nước tinh khiết Aquafina 500ml đã đạt tới trình độ nước tinh khiết có tác dụng dịu cơn khát, khi uống sẽ có cảm giác hơi ngọt ở miệng, rất dễ uống. Nhỏ gọn tiện lợi dễ mang bên mình', 200, 'Aquafina', 4300, 1, 1,0),
       (NULL, 'Red Bull', ' Với thành phần tự nhiên, mùi vị thơm ngon, sảng khoái. Sản phẩm giúp cơ thể bù đắp nước, bổ sung năng lượng, vitamin và các khoáng chất, giúp xua tan cơn khát và cảm giác mệt mỏi. Sản phẩm không có đường hóa học, không chứa hóa chất độc hại, đảm bảo an toàn cho người sử dụng.', 19, 'redbull', 9300, 1, 5,0),
       (NULL, 'Bia Carlsberg ', ' Lên men tự nhiên từ nước, đại mạch, ngũ cốc và hoa bia, không chất bảo quản, an toàn với người sử dụng. Carlsberg thương hiệu bia nổi tiếng đến từ Hà Lan cam kết chất lượng và trải nghiệm tuyệt vời nhất.', 300, 'redbull', 24000, 1, 6,0),
       (NULL, 'Kẹo Xylitol ', ' Kẹo gum không đường giúp loại bỏ những thức ăn thừa trong kẽ răng của bạn. Kẹo gum không đường Lotte Xylitol hương Blueberry Mint hộp 137.8g với hương vị trái cây việt quất tươi mát, ngon miệng. Kẹo singum Lotte Xylitoy giúp bạn có hơi thở thơm mát và không lo sâu răng, bảo vệ răng miệng.', 35, 'Xylitol', 58800, 2, 7,0),
       (NULL, 'Kẹo Trident Bạc Hà ', ' Kẹo gum hương bạc hà mang đến cho bạn hơi thở thơm mát cùng tinh thần sảng khoái. Kẹo gum Trident Ice hương bạc hà hũ 56g tiện lợi, có thể mang theo bên người, nhai kẹo sau khi ăn giúp lấy đi thức ăn thừa dính trên răng. Trident là thương hiệu kẹo lớn của Mỹ.', 73, 'trident bạc hà', 31800, 2, 8,0),
       (NULL, 'Kẹo Trident Chanh ', ' Kẹo gum hương bạc hà chanh mang đến cho bạn hơi thở thơm mát cùng tinh thần sảng khoái. Kẹo gum Trident Ice vị chanh hũ 56g tiện lợi, có thể mang theo bên người, nhai kẹo sau khi ăn giúp lấy đi thức ăn thừa dính trên răng. Trident là thương hiệu kẹo lớn của Mỹ.', 63, 'trident chanh', 29300, 2, 8,0),
       (NULL, 'Kẹo Alpenliebe ', ' Với hương vị ngọt ngào của sữa và hương caramen kết hợp với nhau hoàn hảo. Kẹo sữa caramen Alpenliebe gói 120g hương vị thơm ngon, hợp khẩu vị mọi lứa tuổi. Kẹo Alpenliebe thơm ngon, ngọt và thích thú khi ăn. Sản phẩm phù hợp để ăn vặt..', 45, 'alpenliebe', 12600, 2, 9,0),
       (NULL,'Kẹo Alpenliebe mix 2 vị ', 'Hương vị trái cây thơm ngon, ngọt ngào, cung cấp nhiều năng lượng. Viên kẹo mềm dẻo, mang đến trải nghiệm thích thú khi thưởng thức. Kẹo mềm hương trái cây Alpenliebe 2Chew gói 87.5g có thể sử dụng trong các bữa tiệc. Kẹo Alpenliebe là thương hiệu Ý được chọn mua, hương thơm ngọt ngào..', 40, 'alpenliebe 2', 14000, 2, 9,0),
       (NULL, 'Kẹo Chupa Chups ', ' Kẹo dẻo Chupa Chups với những hình dáng ngộ nghĩnh, dẻo dai giúp kích thích vị giác khi ăn. Kẹo dẻo Chupa Chups Mini Crawler gói 56g thơm ngon, hấp dẫn là loại kẹo dẻo được rất nhiều trẻ em ưa chuộng. Kẹo được làm từ trái cây, với vị ngọt thanh mát, dùng ăn vặt cùng bạn bè rất thích hợp.', 40, 'chupa chups', 14600, 2, 9,0),
       (NULL, 'Bánh que Toppo', ' Là bánh que chất lượng, thơm ngon đến từ thương hiệu bánh que Lotte. Bánh que Lotte Toppo socola hương vani hộp 132g với phần bánh giòn rụm cùng phần nhân socola hấp dẫn, ngọt ngào xen chút đắng nhẹ đặc trưng, không gây ngấy, thoảng hương vani thơm tạo nên vị ngon khó cưỡng..', 30, 'toppo', 52800, 2, 7,0),
       (NULL, 'Bánh gấu Koala', ' Bánh gấu thơm ngon với lớp vỏ ngoài giòn ngon, mỏng hòa quyện cùng lớp kem nhân socola bên trong ngon đến khó cướng. Bánh gấu nhân kem socola Lotte Koala March hộp 37g thơm ngon, kích thích vị giác, ăn mãi không ngán đến từ Lotte.', 100, 'koala', 17900, 2, 7,0),
       (NULL, 'Bánh gạo Orion', ' Bánh gạo giòn giòn thơm ngon, bánh có kích thước vừa, thơm ngon, lạ miệng và kích thích vị giác. Bánh gạo nướng vị tự nhiên Orion An gói 151.2g tiện lợi cho các buổi tiệc ngọt. Bánh gạo Orion dinh dưỡng, ăn vặt cũng rất phù hợp để thư giãn và đọc sách..', 150, 'banhgaoorion', 22600, 2, 10,0),
       (NULL, 'Hộp ChocoPie 20 cái', 'Bánh socola với lớp socola béo, thơm mà không bị đắng phủ bên ngoài lớp bánh xốp mịn rất ngon. Kẹp giữa của Bánh Choco-pie hộp 660g (20 cái) là lớp kem marshmallow dẻo thơm. Bánh socola Choco-pie là thương hiệu từ Hàn Quốc', 150, 'chocopie', 68000, 2, 10,0),
       (NULL, 'Hộp Custas 6 cái', ' Bánh bông lan thơm mềm, xôm xốp, dai ngon hấp dẫn. Bánh kem trứng Custas hộp 141g (6 cái) với lớp kem trứng béo ngậy bên trong lớp bánh bông lan, tạo nên hương vị độc đáo. Bánh bông lan Custas hấp dẫn, thơm ngon, phù hợp để ăn vặt hay dùng để làm quà.', 50, 'custas', 25000, 2, 10, 0),
       (NULL, 'Bánh Marine Boy', ' Bánh quy thơm vị tôm nướng, bánh mỏng, giòn tan trong miệng ngon mê li. Bánh cá vị tôm nướng môi đỏ Orion Marine Boy hộp 32g không chỉ thơm ngon mà còn cung cấp chất dinh dưỡng và năng lượng giúp bạn hoạt động giữa buổi nữa nhé. Bánh quy Orion là thương hiệu Hàn Quốc', 50, 'marineboy', 11600, 2, 10,0),
       (NULL, 'Bánh xốp Kitkat', ' Bánh xốp phủ socola ngọt, thơm. Bánh xốp giòn, thơm cùng lớp socola đen nhưng không đắng phủ bên ngoài ngọt thanh hòa quyện vào nhau rất hoàn hảo. Bánh xốp phủ socola KitKat thanh 17g nhỏ gọn, dễ mang theo bên người. Bánh socola KitKat được sản xuất tại Malaysia chất lượng, an toàn', 50, 'kitkat', 6600, 2, 11,0),
       (NULL, 'Bánh mì ốp la', ' Bánh mì ốp la là món ăn quen thuộc với hầu hết người Việt Nam bởi nó không chỉ ngon mà còn cung cấp đủ năng lượng để khởi đầu ngày mới. Sự chế biến hoàn hảo của quả trứng với mặt dưới giòn nhẹ, phần lòng trắng và lòng đỏ hơi chín vừa kết hợp với dưa leo, cà chua, một chút muối tiêu, nước tương, tương ớt cùng với bánh mỳ Việt Nam giòn tan chắc chắn mang đến cho bạn sự ngon miệng.', 99, 'banhmiopla', 12000, 3, 12,0),
       (NULL, 'Mì trộn', ' Mì Trộn thoạt nhìn có vẻ đơn giản nhưng lại mang một hương vị đặc trưng riêng. Một tô Mì Trộn hấp dẫn với giá cả rất phải chăng, thêm một chút giá, một chút hẹ, có thể dùng thêm sa tế cay cũng làm ấm lòng bạn vào bất kì giờ nào trong ngày..', 99, 'mitron', 9000, 3, 12,0),
       (NULL, 'Mì trộn trứng', ' Mì Trộn thoạt nhìn có vẻ đơn giản nhưng lại mang một hương vị đặc trưng riêng. Một tô Mì Trộn hấp dẫn với giá cả rất phải chăng, thêm một chút giá, một chút hẹ, có thể dùng thêm sa tế cay cũng làm ấm lòng bạn vào bất kì giờ nào trong ngày. Sẽ tuyệt hơn nếu bạn kết hợp dùng Mì Trộn với một phần trứng chiên để làm tăng hương vị món ăn.', 99, 'mitrontrung', 13000,3, 12,0),
       (NULL, 'Mì trộn trứng xúc xích', ' Mì Trộn thoạt nhìn có vẻ đơn giản nhưng lại mang một hương vị đặc trưng riêng. Một tô Mì Trộn hấp dẫn với giá cả rất phải chăng, thêm một chút giá, một chút hẹ, có thể dùng thêm sa tế cay cũng làm ấm lòng bạn vào bất kì giờ nào trong ngày. Sẽ tuyệt hơn nếu bạn kết hợp dùng Mì Trộn với một phần trứng chiên và xúc xích nướng để làm tăng hương vị món ăn.', 99, 'mitrontrungxucxich', 18000, 3, 12,0),
       (NULL, 'Mì trộn indome', ' Nguyên liệu đơn giản, hương vị đậm đà, hấp dẫn, đó chính là lý do mì trộn Indomie nhiều năm liền đứng trong top 10 món mì được ưa chuộng nhất thế giới..', 99, 'mitronindomie', 13000, 3, 12,0),
       (NULL, 'Xúc xích', ' Xúc Xích tại Mini Mart sử dụng nguồn nguyên liệu từ các nhà cung cấp uy tín trong nước và ngoài nước. Xúc Xích với lõi béo mềm bên trong, được bao bọc bên ngoài bởi một lớp bì giòn dai, chắc chắn sẽ là sự lựa chọn hoàn hảo để xoa dịu cơn đói của bạn.', 99, 'xucxichchebien', 15000, 3, 12,0),
       (NULL, 'Bánh bao khoai môn', ' Bánh Bao Ca Dé và Bánh Bao Khoai Môn, có nhân làm từ đậu xanh và khoai môn là hai lựa chọn thơm ngon cho bạn bên cạnh Bánh Bao truyền thống. Bánh Bao tại Circle K luôn nóng hổi để phục vụ bạn bất cứ lúc nào trong ngày.', 99, 'banhbaokhoaimon', 11000, 3, 12,0),
       (NULL, 'Bánh bao ca dé', ' Bánh Bao Ca Dé và Bánh Bao Khoai Môn, có nhân làm từ đậu xanh và khoai môn là hai lựa chọn thơm ngon cho bạn bên cạnh Bánh Bao truyền thống. Bánh Bao tại Circle K luôn nóng hổi để phục vụ bạn bất cứ lúc nào trong ngày.', 99, 'banhbaocade', 11000, 3, 12,0),
       (NULL, 'Bánh bao trứng cút', ' Bánh Bao Trứng Cút có nhân được làm từ thịt heo, củ hành, trứng cút, và nấm. Sản phẩm luôn được giữ nóng trong tủ hâm riêng cho Bánh Bao, luôn được đảm bảo là bánh mới, chất lượng và an toàn để phục vụ bạn bất cứ lúc nào trong ngày.', 99, 'banhbaotrungcut', 16000, 3, 12,0),
       (NULL, 'Dimsum', ' Vỏ bánh mỏng, mịn bao trọn phần nhân thịt đầy đặn bên trong. Đảm bảo giữ trọn hương vị tươi mới và ngon lành của món ăn.', 99, 'dimsum', 20000,3, 12,0),
       (NULL, 'Bánh giò', ' Bánh Giò được làm từ bột gạo tẻ với nhân làm từ thịt nạc kèm mộc nhĩ và hành khô.', 99, 'banhgio', 13000, 3, 12,0),
       (NULL, 'Xôi lá chuối', ' Phần xôi mềm dẻo được bọc trong lớp lá chuối tươi được hấp chín kỹ. Nhân xôi đủ đầy với thịt gà xé dai dai, nấm đông cô lạ miệng cùng trứng muối  và tôm khô mằn mặn. Tất cả hòa quyện, tạo nên hương vị đặc trưng và thơm ngon. Còn gì bằng khi buổi sớm thức dậy được thưởng thức bữa sáng ấm nóng và ngon lành với món ăn truyền thống.', 99, 'xoilachuoi', 20000,3, 12,0),
       (NULL, 'Sườn heo non 300g', 'Sườn non heo của thương hiệu G được đóng gói và bảo quản đạt các tiêu chuẩn về an toàn toàn thực phẩm. Sườn mềm, thịt săn chắc và thơm nên thường dùng để làm sườn xào chua ngọt, sườn ram mặn,...', 99, 'suonnon', 87000, 4, 13,0),
       (NULL, 'Ba rọi heo 300g', 'Ba rọi heo rút sườn G được đóng gói và bảo quản đạt các tiêu chuẩn về an toàn toàn thực phẩm. Tỉ lệ nạc mỡ xen kẻ, thịt nhiều hơn mỡ nên rất hợp để nướng, chiên với sả ớt, kho, luộc,... ', 99, 'baroi', 79000, 4, 13,0),
       (NULL, 'Thăn bò 500g', 'thịt mềm, xen lẫn với những đường gân dai nhẹ, thăn bò nhập khẩu đông lạnh thích hợp để áp chảo, hoặc làm beefsteak, bò nướng,...', 99, 'thanbo', 153000, 4, 13,0),
       (NULL, 'Hộp trứng gà', 'Hộp 10 trứng gà tươi G có thể luộc chín chế biến thành một số món ăn khác như: thịt kho trứng, cơm chiên trứng,...', 99, 'trungga', 32000, 4, 13,0),
       (NULL, 'Hộp trứng vịt', 'Hộp 10 trứng gà tươi G có thể luộc chín chế biến thành một số món ăn khác như: thịt kho trứng, cơm chiên trứng,...', 99, 'trungvit', 39000, 4, 13,0),
       (NULL, 'Cá hồi 300g', 'Cá hồi cắt khúc đông lạnh vẫn giữ được độ tươi ngon, màu sắc bắt mắt, được sơ chế sạch sẽ an toàn', 99, 'cahoi', 39000, 4, 13,0),
       (NULL, 'Nấm kim châm 150g', 'Nấm kim châm Hàn Quốc được nuôi trồng và đóng gói theo những tiêu chuẩn nghiêm ngặt, bảo đảm các tiêu chuẩn xanh - sạch, chất lượng và an toàn với người dùng. Sợi nấm dai, giòn và ngọt, khi nấu chín rất thơm nên thường được lăn bột chiên giòn, nấu súp hoặc để nướng ăn kèm.', 99, 'namkimcham', 14300, 4, 13,0),
       (NULL, 'Ớt hiểm 50g', 'Với vị cay nồng, thơm, kích thích vị giác của người ăn, ớt là một trong những gia vị không thể thiếu trong nấu ăn cũng như mâm cơm của người Việt. Ớt hiểm luôn giữ được độ tươi mỗi ngày, được nuôi trồng theo quy trình nghiêm ngặt, bảo đảm các chỉ tiêu về an toàn và chất lượng.', 99, 'othiem', 2800, 4,13,0),
       (NULL, 'Chanh 500g', 'Chanh túi 500g với từng trái to, tròn và mọng nước, chanh giúp tạo nên vị chua đậm đà cho nhiều món ăn hay nước uống, khiến cho nhiều người thích mê. Chanh có thể làm nước đá chanh giải nhiệt mùa hè, tạo nên vị chua cho các món như canh chua, lẩu chua,....', 99, 'chanh', 15300, 4, 13,0),
       (NULL, 'Dưa leo 500g', 'Dưa leo baby trồng tại Lâm Đồng là một giống dưa mới, được trồng khá nhiều ở nước ta, đây là một loại rau củ rất ngon, gần như là quen thuộc trong tất cả bữa ăn ở mọi gia đình. Dưa leo chứa rất nhiều chất dinh dưỡng và vitamin rất tốt cho cơ thể. Dưa leo còn có thể dụng để làm đẹp cũng rất hiệu quả.', 99, 'dualeo', 17100,4, 13,0),
       (NULL, 'Khăn ướt We Care 30 miếng', ' Là sản phẩm đến từ thương hiệu khăn ướt We Care. Khăn ướt We Care không mùi gói 30 tờ được làm từ vải không dệt cao cấp, mềm mại không xơ. Đây là loại khăn ướt không chứa cồn, không mùi an toàn cho da và thích hợp cho da nhạy cảm..', 79, 'khanuot', 16000, 5, 14,0),
       (NULL, 'Khăn giấy lụa Silkwell 3 lớp 160 tờ', ' Khăn giấy thương hiệu Silkwell sản xuất tại Việt Nam trên dây chuyền công nghệ cao. Khăn giấy lụa Silkwell 3 lớp 160 tờ 100% bột giấy nguyên chất, không chất huỳnh quang, giấy mềm mại, dai, thấm hút tốt, không bở dính, dễ dàng dùng vệ sinh cá nhân, lau chùi', 59, 'khanlua', 15900, 5, 15,0),
       (NULL, 'Dầu gội Clear 631ml', ' Dầu gội Clear thương hiệu Hà Lan, là dầu gội làm sạch gàu số 1 Việt Nam. Dầu gội sạch gàu Clear mát lạnh bạc hà 631ml với công nghệ sạch gàu 3 tác động: loại bỏ gàu, tấn công gàu, ngăn gàu tái phát và Vitamin B3 nuôi dưỡng da dầu khoẻ hơn.', 39, 'daugoiclear', 166000, 5, 16,0),
       (NULL, 'Dầu xã Dove', ' Dầu xả Dove thương hiệu Unilever nổi tiếng sản xuất Nhật Bản. Dầu xả thành phần chiết xuất tự nhiên, dưỡng chất Keratin. Kem xả Dove phục hồi hư tổn 173ml mang lại mái tóc óng ả, vào nếp thẳng mượt, phục hồi hư tổn', 29, 'dauxadove', 47000,5, 16,0),
       (NULL, 'Wax vuốt tóc Gatsby 25g', ' Sản phẩm wax tạo kiểu tóc chất lượng từ thương hiệu Gatsby. Wax vuốt tóc Gatsby Mat & Hard dày bồng cá tính 25g là sản phẩm dạng wax giúp bạn dễ dàng tạo kiểu và giữ nếp tối đa cho mái tóc mà không gây cảm giác nặng nề khó chịu. Cam kết chính hãng và an toàn cho tóc', 29, 'keowax', 26900, 5, 17,0),
       (NULL, 'Gel diệt khuẩn Lifebuoy 50ml', 'Lifebouy là nhãn hiệu sạch khuẩn số 1 thế giới với sản phẩm nước rửa tay. Nước rửa tay diệt khuẩn Lifebuoy Total 10 50ml giúp diệt 99,99% vi khuẩn gây bệnh, cung cấp thêm thành phần dưỡng ẩm cho đôi tay mềm mại hơn. Thiết kế nhỏ gọn dễ dàng mang theo', 69, 'gelxitkhuan', 28000,5, 16,0),
       (NULL, 'Nước rửa tay Lifebuoy 450g', ' Nước rửa tay Lifebuoy an toàn, chất lượng được nhà nhà lựa chọn tin dùng. Nước rửa tay Lifebuoy bạc bảo vệ chai 450g giúp khử khuẩn, bảo vệ da tay khỏi 99,9% vi khuẩn gây hại. Nước rửa tay với hương thơm nhẹ tạo cảm giác tươi mát sảng khoái sau mỗi lần sử dụng.', 29, 'nuocruatay', 78000, 5, 16,0),
       (NULL, 'Khẩu trang 3M KF94 màu trắng', ' Khẩu trang thương hiệu 3M là mẫu khẩu trang được khuyến cáo sử dụng cho người tiêu dùng. Khẩu trang 3M 3 lớp KF94 9013 màu trắng kháng khuẩn, chống bụi, bảo vệ đường hô hấp. Lọc ít nhất 94% phân tử gây hại và bụi mịn 2.5 micromet. Thiết kế vừa vặn với khuôn mặt không có khoảng hở', 120, 'khautrangtrang', 25900,5, 18,0),
       (NULL, 'Khẩu trang 3M KF94 màu đen', ' Khẩu trang thương hiệu 3M là mẫu khẩu trang được khuyến cáo sử dụng cho người tiêu dùng. Khẩu trang 3M 3 lớp KF94 9013 màu trắng kháng khuẩn, chống bụi, bảo vệ đường hô hấp. Lọc ít nhất 94% phân tử gây hại và bụi mịn 2.5 micromet. Thiết kế vừa vặn với khuôn mặt không có khoảng hở', 120, 'khautrangden', 29000, 5, 18,0),
       (NULL, 'Bộ 2 kem đánh răng Colgate MaxFresh bạc hà 350g', ' Colgate là nhãn hiệu của Mỹ chuyên về các sản phẩm vệ sinh răng miệng bao gồm sản phẩm kem đánh răng. Bộ 2 kem đánh răng Colgate MaxFresh hương bạc hà 350g công thức đặc biệt giúp diệt khuẩn hiệu quả, ngừa sâu răng tối đa, cho răng chắc khỏe và hơi thở thơm mát.', 90, 'kemdanhrang', 60000,5, 19,0),
       (NULL, 'Bàn chải đánh răng Colgate 360 Charcoal Spiral xoắn kép', 'Bàn chải đánh răng xuất xứ thương hiệu Mỹ. Bàn chải đánh răng Colgate có lông chải xoắn, phủ than hoạt tính. Bàn chải Colgate 360 Charcoal Spiral xoắn kép có đầu bàn chải to với 30% diện tích lông chải tăng thêm, giúp chải sạch hiệu quả.', 50, 'banchay', 42000, 5, 19,0),
       (NULL, 'Nước súc miệng Colgate Plax Peppermint Fresh 750ml', 'Nước súc miệng Colgate được sản xuất tại Thái Lan. Nước súc miệng giúp làm sạch khoang miệng hiệu quả, chăm sóc nướu và mang lại hơi thở thơm ngát tự nhiên. Nước súc miệng Colgate Plax Peppermint Fresh 750ml cho khoang miệng sạch sẽ, diệt vi khuẩn gây hôi miệng.', 23, 'nuocsucmieng', 126000, 5, 19,0);


-- Insert chức vụ
ALTER TABLE CHUCVU AUTO_INCREMENT = 1;
INSERT INTO `chucvu`(`MACHUCVU`, `TENCHUCVU`, `MOTA`, `IS_DELETED`)
VALUES (1,'Nhân viên bán hàng','Thực hiện bán hàng, thanh toán, kiểm tra sản phẩm của cửa hàng',0),
       (2,'Quản lý cửa hàng','Thực hiện quản lý cửa hàng, nhân viên',0);

-- Insert nhân viên
ALTER TABLE NHANVIEN AUTO_INCREMENT = 1;
INSERT INTO `nhanvien`(`MANV`, `TENNV`, `GIOITINH`, `CMND`, `NGAYSINH`, `SODIENTHOAI`, `EMAIL`, `DIACHI`, `NGAYTHAMGIA`, `MACHUCVU`, `IS_DELETED`) VALUES
    (1,'Huỳnh Khánh Duy',0,'3120410088','2002-06-11','0123456789','duyne@gmail.com','Nhà Bè, HCM','2022-05-16',1,0),
    (2,'Trang Thanh Phúc',0,'3120410413','2002-04-24','0123456798','phucne@gmail.com','Quận 8, HCM','2022-05-16',1,0),
    (3,'Trần Gia Lâm',0,'3120560051','2002-10-16','0123456518','lamne@gmail.com','Quận 8, HCM','2022-05-16',2,0),
    (4,'Võ Minh Tuấn',0,'3120410591','2002-08-11','0123456728','tuanne@gmail.com','Quận 8, HCM','2022-05-16',2,0),
    (5,'Vi Đào Tiến Đạt',0,'3120410125','2002-11-26','0123456738','datne@gmail.com','Quận 8, HCM','2022-05-16',1,0);

-- Insert tài khoản
ALTER TABLE TAIKHOAN AUTO_INCREMENT = 1;
INSERT INTO `taikhoan`(`SOTK`, `TENTK`, `MATKHAU`, `MANV`, `SOLANSAI`, `NGAYTAO`, `IS_DELETED`) VALUES
    (1,'nhanvien','nhanvien',1,0,'2022-05-16',0),
    (2,'thanhphuc','123',2,0,'2022-05-16',0),
    (3,'gialam','123',3,0,'2022-05-16',0),
    (4,'admin','admin',4,0,'2022-05-16',0),
    (5,'tiendat','123',5,0,'2022-05-16',0);

-- Insert khách hàng
ALTER TABLE KHACHHANG AUTO_INCREMENT = 1;
INSERT INTO `khachhang`(`MAKH`, `TENKH`, `GIOITINH`, `SODIENTHOAI`, `DIACHI`, `EMAIL`, `DIEMTHUONG`, `IS_DELETED`) VALUES
	(null,'Phạm Hồng Sơn',0,'0154399297','Nông Cống, Thanh Hóa','hongson@gmail.com',0,0),
	(null,'Ngô Liên Phương',1,'0844598588','Kon Tum, Kon Tum','lienphuong@gmail.com',0,0),
	(null,'Đỗ Hải Thanh',1,'0311715027','An Dương, Hải Phòng','haithanh@gmail.com',0,0),
	(null,'Võ Bạch Yến',1,'0896971539','Dương Kinh, Hải Phòng','bachyen@gmail.com',0,0),
	(null,'Hồ Duy Tâm',0,'0602273372','KBang, Gia Lai','duytam@gmail.com',0,0),
	(null,'Lê Cao Minh',0,'0991763662','Bình Thuỷ, Cần Thơ','caominh@gmail.com',0,0),
	(null,'Trần Mộng Giác',0,'0136845039','Bắc Bình, Bình Thuận','monggiac@gmail.com',0,0),
	(null,'Lý Mạnh Dũng',0,'0879829915','Duy Tiên, Hà Nam','manhdung@gmail.com',0,0),
	(null,'Nguyễn Cường Thịnh',0,'0478326352','Yên Lập, Phú Thọ','cuongthinh@gmail.com',0,0),
	(null,'Dương Hoài Phương',1,'0617876595','Văn Lãng, Lạng Sơn','hoaiphuong@gmail.com',0,0),
	(null,'Nguyễn Đông Dương',0,'0840854691','Bến Cát, Bình Dương','dongduong@gmail.com',0,0),
	(null,'Đỗ Kim Phượng',1,'0337596679','Krông Nô, Đắk Nông','kimphuong@gmail.com',0,0),
	(null,'Lê Diễm Trang',1,'0828538660','Uông Bí, Quảng Ninh','diemtrang@gmail.com',0,0),
	(null,'Phạm Bích Thoa',1,'0441013903','Tam Nông, Đồng Tháp','bichthoa@gmail.com',0,0),
	(null,'Hồ Mộng Long',0,'0649772240','Móng Cái, Quảng Ninh','monglong@gmail.com',0,0),
	(null,'Vũ Hùng Dũng',0,'0336300478','Mộc Châu, Sơn La','hungdung@gmail.com',0,0),
	(null,'Huỳnh Huy Khánh',0,'0576396002','Nha Trang, Khánh Hòa','huykhanh@gmail.com',0,0),
	(null,'Đỗ Minh Khiếu',0,'0470107814','Biên Hòa, Đồng Nai','minhkhieu@gmail.com',0,0),
	(null,'Đặng Hướng Thiện',0,'0656449090','Ninh Hải, Ninh Thuận','huongthien@gmail.com',0,0),
	(null,'Lê Đình Dương',0,'0414402384','Bắc Giang, Bắc Giang','dinhduong@gmail.com',0,0),
	(null,'Bùi Nam An',0,'0835310269','Nậm Nhùn, Lai Châu','naman@gmail.com',0,0),
	(null,'Ngô Đông Nguyên',0,'01069693451','Quảng Trạch, Quảng Bình','dongnguyen@gmail.com',0,0),
	(null,'Đỗ Danh Văn',0,'0612258069','Thuận Thành, Bắc Ninh','danhvan@gmail.com',0,0),
	(null,'Nguyễn Hải Nhi',1,'0579869921','Kỳ Sơn, Hoà Bình','hainhi@gmail.com',0,0),
	(null,'Vũ Cát Cát',1,'0881318321','Vũng Tàu, Bà Rịa - Vũng Tàu','catcat@gmail.com',0,0),
	(null,'Vũ Cẩm Tú',1,'0712468869','Đức Cơ, Gia Lai','camtu@gmail.com',0,0),
	(null,'Lê Hữu Tài',0,'0253867053','Hương Thủy, Thừa Thiên Huế','huutai@gmail.com',0,0),
	(null,'Đặng Hương Nhi',1,'0703901479','Cần Giờ, Hồ Chí Minh','huongnhi@gmail.com',0,0),


-- Insert voucher
ALTER TABLE VOUCHER AUTO_INCREMENT = 1;
INSERT INTO `voucher`(`SOVOUCHER`, `MAVOUCHER`, `MOTA`, `NGAYBD`, `NGAYKT`, `GIATRITOITHIEU`, `KMTOIDA`, `PTGIAM`, `SOLUOTSD`, `IS_DELETED`) VALUES
    (1,'NOVOUCHER','Không dùng voucher','2022-05-16','2200-06-16',0,0,0,100000,0),
    (2,'GIAM25K','Giảm 25k cho đơn từ 100k','2022-05-16','2022-06-16',100000,25000,100,5000,0),
    (3,'GIAM10PT','Giảm 10% tối đa 200k','2022-05-16','2022-06-16',0,200000,10,5000,0),
    (4,'GIAM25PT','Giảm 25% khi mua đơn tối thiểu 100k, giảm tối đa 100k','2022-05-16','2022-06-16',100000,100000,25,5000,0),
    (5,'GIAM50K','Giảm 50k khi mua đơn từ 200k','2022-05-16','2022-06-16',200000,50000,100,5000,0)

-- Insert giamgiasp
ALTER TABLE GIAMGIASP AUTO_INCREMENT = 1;
INSERT INTO `giamgiasp`(`SOPHIEU`, `NGAYBD`, `NGAYKT`, `PTGIAM`, `MASP`, `IS_DELETED`) VALUES
    (null,'2022-05-16','2022-06-16',15,1,0),
    (null,'2022-05-16','2022-06-16',5,3,0),
    (null,'2022-05-16','2022-06-16',10,4,0),
    (null,'2022-05-16','2022-06-16',20,7,0),
    (null,'2022-05-16','2022-06-16',16,10,0);

ALTER TABLE PHIEUNHAP AUTO_INCREMENT = 1;
INSERT INTO `phieunhap` (`MAPHIEU`, `NGAYLAP`, `MANV`, `IS_DELETED`) VALUES 
    (NULL, '2022-05-16 17:33:19', '1', '0'), 
    (NULL, '2022-05-17 17:33:19', '2', '0'),
    (NULL, '2022-05-17 17:35:19', '1', '0'), 
    (NULL, '2022-05-17 17:39:19', '2', '0'),
    (NULL, '2022-05-17 16:12:19', '3', '0'), 
    (NULL, '2022-05-17 19:22:19', '1', '0'),
    (NULL, '2022-05-17 20:22:19', '2', '0'),
    (NULL, '2022-05-17 20:23:19', '1', '0'),
    (NULL, '2022-05-17 20:25:19', '3', '0'),
    (NULL, '2022-05-17 21:30:19', '1', '0'),
    (NULL, '2022-05-17 21:35:20', '3', '0'),
    (NULL, '2022-05-17 21:50:54', '5', '0'),
    (NULL, '2022-05-17 21:59:19', '5', '0');

ALTER TABLE ctphieunhap AUTO_INCREMENT = 1;
INSERT INTO `ctphieunhap` (`MAPHIEU`, `MASP`, `SOLUONG`) VALUES 
    ('1', '34', '8'), ('1', '16', '12'), ('1', '12', '12'), ('1', '8', '10'), 
    ('1', '21', '8'), ('1', '6', '24'), ('2', '37', '13'), ('2', '28', '10'), 
    ('2', '42', '10'), ('2', '43', '12'), ('2', '11', '8'), ('3', '36', '10'), 
    ('3', '37', '14'), ('3', '24', '10'), ('3', '58', '12'), ('4', '55', '15'), 
    ('4', '35', '12'), ('5', '47', '5'), ('5', '33', '10'), ('5', '51', '4'), 
    ('6', '7', '8'), ('6', '49', '10'), ('6', '44', '10'), ('6', '40', '12'), 
    ('6', '50', '10');

INSERT INTO `phieuhuy` (`MAPHIEU`, `NGAYLAP`, `MANV`, `IS_DELETED`) VALUES 
    (NULL, '2022-05-16 17:54:45', '1', '0'), 
    (NULL, '2022-05-17 18:05:45', '2', '0'), 
    (NULL, '2022-05-17 18:34:49', '3', '0'), 
    (NULL, '2022-05-17 19:28:49', '5', '0'), 
    (NULL, '2022-05-17 21:55:49', '4', '0'), 
    (NULL, '2022-05-17 22:16:49', '2', '0');

INSERT INTO `ctphieuhuy` (`MAPHIEU`, `MASP`, `SOLUONG`) VALUES 
    ('1', '39', '4'), ('1', '26', '5'), ('1', '27', '3'), ('2', '6', '10'), 
    ('2', '36', '5'), ('2', '44', '4'), ('3', '43', '2'), ('3', '41', '3'), 
    ('3', '30', '6'), ('4', '37', '3'), ('1', '34', '10'), ('4', '38', '5'), 
    ('4', '31', '8'), ('5', '46', '10'), ('5', '51', '2'), ('5', '23', '1'), 
    ('6', '33', '3'), ('6', '47', '9'), ('6', '4', '4'), ('6', '54', '1');

# INSERT INTO


# --Chạy tới đây tự nhiên lỗi mấy dòng này không insert zô được hic hic đem ra insert riêng thì được hoq bít tại s luôn
# INSERT INTO `khachhang`(`MAKH`, `TENKH`, `GIOITINH`, `SODIENTHOAI`, `DIACHI`, `EMAIL`, `DIEMTHUONG`, `IS_DELETED`)
# VALUES (0,NULL, NULL, NULL, NULL, NULL, NULL, 0)
#
# INSERT INTO `voucher`(`SOVOUCHER`, `MAVOUCHER`, `MOTA`, `NGAYBD`, `NGAYKT`, `GIATRITOITHIEU`, `KMTOIDA`, `PTGIAM`, `SOLUOTSD`, `IS_DELETED`)
# VALUES (0,'',NULL,NULL,NULL,NULL,NULL,NULL,NULL,0)
#
# INSERT INTO `nhanvien`(`MANV`, `TENNV`, `GIOITINH`, `CMND`, `NGAYSINH`, `SODIENTHOAI`, `EMAIL`, `DIACHI`, `NGAYTHAMGIA`, `MACHUCVU`, `IS_DELETED`)
# VALUES (0,NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0)