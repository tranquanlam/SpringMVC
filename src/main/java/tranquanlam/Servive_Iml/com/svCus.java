package tranquanlam.Servive_Iml.com;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Service;

import tranquanlam.Dao.com.DaoCustomer;
import tranquanlam.Model.com.Customer;
import tranquanlam.Servive.com.SeviceCustomer;
@Service
public class svCus implements SeviceCustomer{

	@Autowired
	DaoCustomer customer;


	public ArrayList<Customer> tableCustomer() {
	
		return (ArrayList<Customer>) customer.tableCustomer();
	}

}
