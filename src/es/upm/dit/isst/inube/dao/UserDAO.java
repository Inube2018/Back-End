package es.upm.dit.isst.inube.dao;

import es.upm.dit.isst.inube.dao.model.User;
import java.util.List;

public interface UserDAO {
	
	public String login(String email, String password);
	
	public List<User> readAllUser();
	public User create(String name, String mail, String password);
	public User readMail(String mail);
	public void updateUsuario(User use);
	public void deleteUsuario(User user);
	
}
