package tranquanlam.Model.com;

public class Customer {
	
	String tenKH;
	int tuoiKH;
	String email;
	String soCMND;
	String soDT;
	public Customer() {
		super();
	}
	public Customer(String tenKH, int tuoiKH, String email, String soCMND, String soDT) {
		super();
		this.tenKH = tenKH;
		this.tuoiKH = tuoiKH;
		this.email = email;
		this.soCMND = soCMND;
		this.soDT = soDT;
	}
	public String getTenKH() {
		return tenKH;
	}
	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}
	public int getTuoiKH() {
		return tuoiKH;
	}
	public void setTuoiKH(int tuoiKH) {
		this.tuoiKH = tuoiKH;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSoCMND() {
		return soCMND;
	}
	public void setSoCMND(String soCMND) {
		this.soCMND = soCMND;
	}
	public String getSoDT() {
		return soDT;
	}
	public void setSoDT(String soDT) {
		this.soDT = soDT;
	}
	@Override
	public String toString() {
		return "Customer [tenKH=" + tenKH + ", tuoiKH=" + tuoiKH + ", email=" + email + ", soCMND=" + soCMND + ", soDT="
				+ soDT + "]";
	}
	

}
