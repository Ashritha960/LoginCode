package com.risk.dao.impl;

import java.util.List;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.risk.dao.AbstractDao;
import com.risk.dao.logindao;
import com.risk.model.Employee;
import com.risk.model.EmployeeDetails;



@Repository
public class logindaoimpl  extends AbstractDao<String, Employee> implements logindao{

	String hashedPassword;
	@Autowired
	private SessionFactory sessionFactory;
	@SuppressWarnings("unchecked")
	@Override
	public boolean checkLogin(String email, String password) {
		/* Session session=sessionFactory.openSession(); */
			boolean userFound = false;
		/*
		 * String SQL_QUERY =" from EmployeeDetails as e where e.email='" +email
		 * +"' and e.password='"+password+"'";
		 */
		
			String SQL_QUERY =" from EmployeeDetails as e where e.email='" +email +"'";
		
		
			Query query = (Query) getSession().createQuery(SQL_QUERY);
			List<EmployeeDetails> list = query.list();
		/*
		 * System.out.println(list.get(0)); System.out.println(list.get(1));
		 */
			for(EmployeeDetails emp:list) {
			 System.out.println(emp.getPassword().toString()); 
			 hashedPassword=emp.getPassword().toString();
			}
		
			//String SaltKey = BCrypt.hashpw(password, BCrypt.gensalt());
		
			Boolean x = BCrypt.checkpw(password, hashedPassword);
			if(x) {
				
			}
			
			//System.out.println(SaltKey);
			
		  //if (BCrypt.checkpw(plaintext, hashed)eckpw(password,hashedPassword ))
		 // String strPas = BCrypt.hashpw(password, "ABCD");
		  
		/*
		 * if(hashedPassword.equals(strPas)) {
		 * System.out.println("The password matches."); } else
		 * System.out.println("The password does not match.");
		 */ 

System.out.println(list.size());

   
		
		
		


		if ((list != null) && (list.size() > 0)) {
			userFound= true;
		}
		/* session.close(); */
		return userFound;     
	}
	
	
	
	
	
	
	

	/*
	 * @Override public void billexecution() { Session
	 * session=sessionFactory.openSession(); Query query = (Query) session.
	 * createQuery("select c.fname,c.phone,o.foodItemName,o.foodItemPrice,o.quantity,o.amount from CustomerDetails c"
	 * + "INNER JOIN OrderDetails o ON c.customerId=o.customerId");
	 * 
	 * List<Object[]> list=query.list(); for(Object[] arr:list) {
	 * System.out.println(list.get(0)); System.out.println(list.get(1));
	 * System.out.println(list.get(2)); System.out.println(list.get(3));
	 * System.out.println(list.get(4)); System.out.println(list.get(5));
	 * 
	 * }
	 * 
	 * }
	 */
	/*
	 * @Override
	 * 
	 * @SuppressWarnings("unchecked") public List<Login> getlogindetails() {
	 * Criteria criteria = createEntityCriteria(); return (List<Login>)
	 * criteria.list(); }
	 * 
	 * @Override public void savelogindata(Login login) {
	 * 
	 * persist(login); }
	 */

}
