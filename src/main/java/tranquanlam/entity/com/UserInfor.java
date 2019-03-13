package tranquanlam.entity.com;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the UserInfor database table.
 * 
 */
@Entity
@NamedQuery(name="UserInfor.findAll", query="SELECT u FROM UserInfor u")
public class UserInfor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String idUser;

	private String nameUser;

	private String passUser;
	
	

	@Column(name="[ROLE]")
	private String role;

	public UserInfor() {
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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}