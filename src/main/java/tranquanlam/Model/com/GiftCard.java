package tranquanlam.Model.com;

public class GiftCard {
		String maQT;
		String tenQT;
		String  trangthai;
		Float giaQT;
		String maLoaiQT;
		public GiftCard() {
			super();
		}
		
		public GiftCard(String maQT, String tenQT, String trangthai, Float giaQT, String maLoaiQT) {
			super();
			this.maQT = maQT;
			this.tenQT = tenQT;
			this.trangthai = trangthai;
			this.giaQT = giaQT;
			this.maLoaiQT = maLoaiQT;
		}

		public String getMaQT() {
			return maQT;
		}
		public void setMaQT(String maQT) {
			this.maQT = maQT;
		}
		public String getTenQT() {
			return tenQT;
		}
		public void setTenQT(String tenQT) {
			this.tenQT = tenQT;
		}
		public String getTrangthai() {
			return trangthai;
		}
		public void setTrangthai(String trangthai) {
			this.trangthai = trangthai;
		}
		public Float getGiaQT() {
			return giaQT;
		}
		public void setGiaQT(Float giaQT) {
			this.giaQT = giaQT;
		}
		public String getMaLoaiQT() {
			return maLoaiQT;
		}
		public void setMaLoaiQT(String maLoaiQT) {
			this.maLoaiQT = maLoaiQT;
		}
		@Override
		public String toString() {
			return "GiftCard [maQT=" + maQT + ", tenQT=" + tenQT + ", trangthai=" + trangthai + ", giaQT=" + giaQT
					+ ", maLoaiQT=" + maLoaiQT + "]";
		}
		
		
}
