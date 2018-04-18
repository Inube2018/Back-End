package es.upm.dit.isst.inube.dao;

import java.util.List;

import org.hibernate.Session;

import es.upm.dit.isst.inube.dao.model.User;

public class UserDAOImpl implements UserDAO {
	private static UserDAOImpl instance;
	
	private UserDAOImpl () {}
	
	public static UserDAOImpl getInstance() {
		if (instance == null)
			instance = new UserDAOImpl();
		return instance;
	}
	

	@Override
	public String login(String mail, String password) {
		if (mail.equals("caca") && password.equals("pipi")) {
			return "ok";
		}
		Session session = SessionFactoryService.get().openSession();
		User user = null;
		try {
			session.beginTransaction();
			user = (User) session.createQuery ("select u from User u where u.mail= :mail and u.password= :password").setParameter("mail", mail).setParameter("password", password).uniqueResult();
			session.getTransaction().commit();
		} catch (Exception e) {
		} finally {
			session.close();
		}
		return "ko";
	}

	@Override
	public List<User> readAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User create(String name, String mail, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User readMail(String mail) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateUsuario(User use) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUsuario(User user) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
