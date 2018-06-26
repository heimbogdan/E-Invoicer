package ro.helator.einvoicer.security.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.developerstack.dao.UserDao;
import com.developerstack.model.UserDetails;

public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	public List getUserDetails() {
		Criteria criteria = sessionFactory.openSession().createCriteria(UserDetails.class);
		return criteria.list();
	}

	public UserDetails findUserById(String email) {
		UserDetails userDetails = null;
		Criteria criteria = sessionFactory.openSession().createCriteria(UserDetails.class);
		criteria.add(Restrictions.eq("email", email));
		List entityList = criteria.list();
		if (!entityList.isEmpty()) {
			userDetails = entityList.get(0);
		}
		return userDetails;
	}
}
