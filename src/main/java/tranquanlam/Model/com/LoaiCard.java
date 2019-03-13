package tranquanlam.Model.com;

public class LoaiCard {
	int maLoaiC;
	String tenLoaiC;
	String trangLoaiCard;
	
	public String getTrangLoaiCard() {
		return trangLoaiCard;
	}
	public void setTrangLoaiCard(String trangLoaiCard) {
		this.trangLoaiCard = trangLoaiCard;
	}
	public int getMaLoaiC() {
		return maLoaiC;
	}
	public void setMaLoaiC(int maLoaiC) {
		this.maLoaiC = maLoaiC;
	}
	public String getTenLoaiC() {
		return tenLoaiC;
	}
	public void setTenLoaiC(String tenLoaiC) {
		this.tenLoaiC = tenLoaiC;
	}
	public LoaiCard() {
		super();
	}

	public LoaiCard(int maLoaiC, String tenLoaiC, String trangLoaiCard) {
		super();
		this.maLoaiC = maLoaiC;
		this.tenLoaiC = tenLoaiC;
		this.trangLoaiCard = trangLoaiCard;
	}
	@Override
	public String toString() {
		return "LoaiCard [maLoaiC=" + maLoaiC + ", tenLoaiC=" + tenLoaiC + ", trangLoaiCard=" + trangLoaiCard + "]";
	}

	
}