package tranquanlam.Dao_Iml.com;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import tranquanlam.Dao.com.DaoUserInfor;
import tranquanlam.entity.com.UserInfor;

@Repository
@Transactional
public class DaoUserInfor_iml implements DaoUserInfor {

	@Autowired
	@Qualifier("template1")
	JdbcTemplate jdbcTemplate;

	@Autowired
	SessionFactory sessionFactory;

	@Transactional
	public List<UserInfor> getAll() {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(UserInfor.class);
		return criteria.list();
	}

	// public List<UserInforDTO> getAll() {
	// String sql="Select*from UserInfor";
	//
	// return jdbcTemplate.query(sql, new Object[] {},new RowMapper<UserInforDTO>(){
	//
	// public UserInforDTO mapRow(ResultSet arg0, int arg1) throws SQLException {
	// UserInforDTO infor=new UserInforDTO();
	// infor.setIdUser(arg0.getString(1));
	// infor.setIdUser(arg0.getString(2));
	// infor.setPassUser(arg0.getString(3));
	// return infor;
	// }
	//
	// });
	//
	// }

	// public UserInforDTO getUSer(String pass) {
	// String sql="Select * from UserInfor where passUser=? ";
	// return jdbcTemplate.queryForObject(sql, new Object[] {pass}, new
	// RowMapper<UserInforDTO>() {
	//
	// public UserInforDTO mapRow(ResultSet arg0, int arg1) throws SQLException {
	// UserInforDTO infor=new UserInforDTO();
	// infor.setIdUser(arg0.getString(1));
	// infor.setNameUser(arg0.getString(2));
	// infor.setPassUser(arg0.getString(3));
	//
	// return infor;
	// }
	//
	// });
	//
	//
	// }

	public UserInfor getUSer(String pass) {
		return (UserInfor) sessionFactory.getCurrentSession().get(UserInfor.class, pass);
	}

	// public boolean checkUser(String pass) {
	// String sql="Select*from UserInfor";
	// List<UserInforDTO> list= jdbcTemplate.query(sql, new Object[] {},new
	// RowMapper<UserInforDTO>(){
	//
	// public UserInforDTO mapRow(ResultSet arg0, int arg1) throws SQLException {
	// UserInforDTO infor=new UserInforDTO();
	// infor.setIdUser(arg0.getString(1));
	// infor.setIdUser(arg0.getString(2));
	// infor.setPassUser(arg0.getString(3));
	// return infor;
	// }
	//
	// });
	// for (UserInforDTO userInfor : list) {
	// if(userInfor.getPassUser().equals(pass)) {
	// return true;
	// }
	// }
	// return false;
	// }

	public boolean checkUser(String pass) {

		List<UserInfor> infors = getAll();
		for (UserInfor userInfor : infors) {
			if (userInfor.getPassUser().equals(pass)) {
				return true;
			}
		}
		return false;

	}
	public void addUser(UserInfor infor) {
		sessionFactory.getCurrentSession().save(infor);
	}
}
