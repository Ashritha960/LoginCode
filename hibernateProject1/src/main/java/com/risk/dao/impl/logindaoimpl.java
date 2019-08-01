package com.risk.dao.impl;

import java.util.List;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.risk.dao.logindao;



@Repository
public class logindaoimpl  implements logindao{

	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean checkLogin(String email, String password) {
		
				Session session=sessionFactory.openSession();
		boolean userFound = false;
		
		String SQL_QUERY =" from EmployeeDetails as e where e.email='" +email +"' and e.password='"+password+"'";
		

     Query query = (Query) session.createQuery(SQL_QUERY);
		List list = query.list();
System.out.println(list.get(0));
System.out.println(list.get(1));
System.exit(0);

		if ((list != null) && (list.size() > 0)) {
			userFound= true;
		}

		session.close();
		return userFound;     
		
		
	}

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
