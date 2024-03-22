package model;

public class SanPham {
   private String maSanPham;
   private String tenSanPham;
   private TacGia tacGia;
   private int namXuatBan;
   private double giaNhap;
   private double giaGoc;
   private double giaBan;
   private int soLuong;
   private TheLoai theLoai;
   private String ngonNgu;
   private String moTa;
   private String anh;
   private KhachHang maKhachHang;
   
   public SanPham() {
	// TODO Auto-generated constructor stub
}
   
public SanPham(String maSanPham, String tenSanPham, TacGia tacGia, int namXuatBan, double giaNhap, double giaGoc,
		double giaBan, int soLuong, TheLoai theLoai, String ngonNgu, String moTa) {
	super();
	this.maSanPham = maSanPham;
	this.tenSanPham = tenSanPham;
	this.tacGia = tacGia;
	this.namXuatBan = namXuatBan;
	this.giaNhap = giaNhap;
	this.giaGoc = giaGoc;
	this.giaBan = giaBan;
	this.soLuong = soLuong;
	this.theLoai = theLoai;
	this.ngonNgu = ngonNgu;
	this.moTa = moTa;
}
 
public SanPham(String maSanPham, String tenSanPham, TacGia tacGia, int namXuatBan, double giaNhap, double giaGoc,
		double giaBan, int soLuong, TheLoai theLoai, String ngonNgu, String moTa, String anh) {
	super();
	this.maSanPham = maSanPham;
	this.tenSanPham = tenSanPham;
	this.tacGia = tacGia;
	this.namXuatBan = namXuatBan;
	this.giaNhap = giaNhap;
	this.giaGoc = giaGoc;
	this.giaBan = giaBan;
	this.soLuong = soLuong;
	this.theLoai = theLoai;
	this.ngonNgu = ngonNgu;
	this.moTa = moTa;
	this.anh = anh;
}

public SanPham(String maSanPham, String tenSanPham, TacGia tacGia, int namXuatBan, double giaNhap, double giaGoc,
		double giaBan, int soLuong, TheLoai theLoai, String ngonNgu, String moTa, String anh, KhachHang maKhachHang) {
	super();
	this.maSanPham = maSanPham;
	this.tenSanPham = tenSanPham;
	this.tacGia = tacGia;
	this.namXuatBan = namXuatBan;
	this.giaNhap = giaNhap;
	this.giaGoc = giaGoc;
	this.giaBan = giaBan;
	this.soLuong = soLuong;
	this.theLoai = theLoai;
	this.ngonNgu = ngonNgu;
	this.moTa = moTa;
	this.anh = anh;
	this.maKhachHang = maKhachHang;
}

public String getMaSanPham() {
	return maSanPham;
}
public void setMaSanPham(String maSanPham) {
	this.maSanPham = maSanPham;
}
public String getTenSanPham() {
	return tenSanPham;
}
public void setTenSanPham(String tenSanPham) {
	this.tenSanPham = tenSanPham;
}
public TacGia getTacGia() {
	return tacGia;
}
public void setTacGia(TacGia tacGia) {
	this.tacGia = tacGia;
}
public int getNamXuatBan() {
	return namXuatBan;
}
public void setNamXuatBan(int namXuatBan) {
	this.namXuatBan = namXuatBan;
}
public double getGiaNhap() {
	return giaNhap;
}
public void setGiaNhap(double giaNhap) {
	this.giaNhap = giaNhap;
}
public double getGiaGoc() {
	return giaGoc;
}
public void setGiaGoc(double giaGoc) {
	this.giaGoc = giaGoc;
}
public double getGiaBan() {
	return giaBan;
}
public void setGiaBan(double giaBan) {
	this.giaBan = giaBan;
}
public int getSoLuong() {
	return  soLuong;
}
public void setSoLuong(int soLuong) {
	this.soLuong = soLuong;
}
public TheLoai getTheLoai() {
	return theLoai;
}
public void setTheLoai(TheLoai theLoai) {
	this.theLoai = theLoai;
}
public String getNgonNgu() {
	return ngonNgu;
}
public void setNgonNgu(String ngonNgu) {
	this.ngonNgu = ngonNgu;
}
public String getMoTa() {
	return moTa;
}
public void setMoTa(String moTa) {
	this.moTa = moTa;
}

public String getAnh() {
	return anh;
}
public void setAnh(String anh) {
	this.anh = anh;
}

public KhachHang getMaKhachHang() {
	return maKhachHang;
}

public void setMaKhachHang(KhachHang maKhachHang) {
	this.maKhachHang = maKhachHang;
}

@Override
public String toString() {
	return "SanPham [maSanPham=" + maSanPham + ", tenSanPham=" + tenSanPham + ", tacGia=" + tacGia + ", namXuatBan="
			+ namXuatBan + ", giaNhap=" + giaNhap + ", giaGoc=" + giaGoc + ", giaBan=" + giaBan + ", soLuong=" + soLuong
			+ ", theLoai=" + theLoai + ", ngonNgu=" + ngonNgu + ", moTa=" + moTa + ", anh=" + anh + ", maKhachHang="
			+ maKhachHang + "]";
}






   
}
