package tranquanlam.Servive_Iml.com;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tranquanlam.Dao.com.DaoUserInfor;
import tranquanlam.Model.com.UserInforDTO;
import tranquanlam.Servive.com.SvUserInfor;
import tranquanlam.entity.com.UserInfor;


@Service

public class SvUserInfor_iml implements SvUserInfor {

	@Autowired
	DaoUserInfor daoUserInfor;
	
	public List<UserInforDTO> getAllUser() {
		
		ArrayList<UserInforDTO> infors=new ArrayList<UserInforDTO>();
		List<UserInfor> infors2=daoUserInfor.getAll();
		
		for (int i = 0; i < infors2.size(); i++) {
			UserInforDTO e=new  UserInforDTO();
			e.setIdUser(infors2.get(i).getIdUser());
			e.setNameUser(infors2.get(i).getNameUser());
			e.setPassUser(infors2.get(i).getPassUser());
			
			infors.add(e);
		}
		List<UserInforDTO>dtos=infors;
		return dtos;
	}

	public boolean checkPass(String pass) {
		
		if(daoUserInfor.checkUser(pass)) {
			return true;
		}
		return false;
	}

	public void addUser(UserInforDTO dto) {
		
		UserInfor infor=new UserInfor();
		infor.setIdUser(dto.getIdUser());
		infor.setNameUser(dto.getNameUser());
		infor.setPassUser(dto.getPassUser());
		
		daoUserInfor.addUser(infor);
		
	}



}
