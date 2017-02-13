package manager;

import org.hibernate.Session;
import util.HibernateUtil;
import bean.Utilisateur;

public class UserManager {

	public void ajoutPersonne(String login, String nom, String prenom, String telephone, String email) {
		Session session  = HibernateUtil.getSessionFactory().getCurrentSession();
		Utilisateur u = new Utilisateur();
		u.setLogin(login);
		u.setNom(nom);
		u.setPrenom(prenom);
		u.setTelephone(telephone);
		u.setEmail(email);
		session.save(u);
		
		session.getTransaction().commit();
	}
	
	public void supprimerPersonne(int id) {
		Session session  = HibernateUtil.getSessionFactory().getCurrentSession();
		Utilisateur u = (Utilisateur) session.load(Utilisateur.class, id);
		session.delete(u);
		
		session.getTransaction().commit();
	}
	
	
}
