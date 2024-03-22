package model;

import java.sql.Date;

public class TacGia {
	private String maTacGia;
	private String hoVaTen;
	private Date ngaySinh;
	private String tieuSu;
	
	public TacGia() {
		// TODO Auto-generated constructor stub
	}
	public TacGia(String maTacGia, String hoVaTen, Date ngaySinh, String tieuSu) {
		super();
		this.maTacGia = maTacGia;
		this.hoVaTen = hoVaTen;
		this.ngaySinh = ngaySinh;
		this.tieuSu = tieuSu;
	}
	public String getMaTacGia() {
		return maTacGia;
	}
	public void setMaTacGia(String maTacGia) {
		this.maTacGia = maTacGia;
	}
	public String getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getTieuSu() {
		return tieuSu;
	}
	public void setTieuSu(String tieuSu) {
		this.tieuSu = tieuSu;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hoVaTen == null) ? 0 : hoVaTen.hashCode());
		result = prime * result + ((maTacGia == null) ? 0 : maTacGia.hashCode());
		result = prime * result + ((ngaySinh == null) ? 0 : ngaySinh.hashCode());
		result = prime * result + ((tieuSu == null) ? 0 : tieuSu.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TacGia other = (TacGia) obj;
		
		if (maTacGia == null) {
			if (other.maTacGia != null)
				return false;
		} else if (!maTacGia.equals(other.maTacGia))
			return false;
	
		return true;
	}
	@Override
	public String toString() {
		return "TacGia [maTacGia=" + maTacGia + ", hoVaTen=" + hoVaTen + ", ngaySinh=" + ngaySinh + ", tieuSu=" + tieuSu
				+ "]";
	}
	
	
	

}
