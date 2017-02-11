package presentation;

import java.io.File;
import java.util.Scanner;

import dao.*;

import metier.Imetier;
import metier.MetierImpl;

public class Presentation {

	
	
	public static void main(String[] args) {
		
		
		
		try {
			Scanner scanner = new Scanner(new File("config.txt"));
			String daoClassName = scanner.nextLine();
			String metierClassName = scanner.nextLine();
			
			Class cDao = Class.forName(daoClassName);
			Class cMetier = Class.forName(metierClassName);
			
			IDAO dao = (IDAO) cDao.newInstance();
			
			Imetier metier = (Imetier)  cMetier.newInstance();
			
			
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
//		DaoImpl dao = new DaoImpl();
//		MetierImpl metier = new MetierImpl();
//		metier.setDao(dao);
		
        System.out.println(metier.calcul());
	}

}
