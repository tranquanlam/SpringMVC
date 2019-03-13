package tranquanlam.Dao.com;

import java.util.List;

import tranquanlam.Model.com.UserInforDTO;
import tranquanlam.entity.com.UserInfor;

public interface DaoUserInfor {
	public List<UserInfor> getAll();
	public UserInfor getUSer( String pass) ;
	public boolean checkUser(String pass);
	public void addUser(UserInfor infor) ;
}
