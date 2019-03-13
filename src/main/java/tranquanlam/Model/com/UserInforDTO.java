package tranquanlam.Model.com;

import tranquanlam.entity.com.UserInfor;

public class UserInforDTO {
	String idUser;
	String nameUser;
	String passUser;
	
	
	public UserInforDTO() {
		super();
	}
	public UserInforDTO(String idUser, String nameUser, String passUser) {
		super();
		this.idUser = idUser;
		this.nameUser = nameUser;
		this.passUser = passUser;
	}
	public UserInfor adduser(String idUser, String nameUser, String passUser) {
		UserInfor infor=new UserInfor();
		
		infor.setIdUser(idUser);
		infor.setNameUser(nameUser);
		infor.setPassUser(passUser);
		
		return infor;
	}
	public String getIdUser() {
		return idUser;
	}
	public void setIdUser(String idUser) {
		this.idUser = idUser;
	}
	public String getNameUser() {
		return nameUser;
	}
	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}
	public String getPassUser() {
		return passUser;
	}
	public void setPassUser(String passUser) {
		this.passUser = passUser;
	}
	
	
}
