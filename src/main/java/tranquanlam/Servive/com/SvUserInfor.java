package tranquanlam.Servive.com;

import java.util.ArrayList;
import java.util.List;

import tranquanlam.Model.com.UserInforDTO;
import tranquanlam.entity.com.UserInfor;

public interface SvUserInfor {
	
	public List<UserInforDTO> getAllUser();
	public boolean checkPass(String pass) ;
	public void addUser (UserInforDTO dto) ;
	
	
}
