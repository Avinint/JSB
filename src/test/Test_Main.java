package test;

import manager.UserManager;
import util.HibernateUtil;

public class Test_Main {

	public static void main(String[] args) {
		
		UserManager manager = new UserManager();
		manager.ajoutPersonne("tom", "Duport", "Thomas", "047785822", "dp@gmail.com");
		manager.ajoutPersonne("shinta","Zeghounai", "Haitem", "0477674429", "shinta@gmail.com");
		manager.ajoutPersonne("bru111","user111111", "1111", "0411111111", "1111@gmail.com");
		manager.ajoutPersonne("bru22", "user22222", "2222", "0422222222222", "222221@gmail.com");
		
		HibernateUtil.sessionFactory.close();
	}
	
}
