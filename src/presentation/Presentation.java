package presentation;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.*;

import metier.Imetier;
import metier.MetierImpl;

public class Presentation {

	
	
	public static void main(String[] args) {
		
		
		/*
		try {
			Scanner scanner = new Scanner(new File("config.txt"));
			String daoClassName = scanner.nextLine();
			String metierClassName = scanner.nextLine();
			
			Class cDao = Class.forName(daoClassName);
			Class cMetier = Class.forName(metierClassName);	
			IDAO dao = (IDAO) cDao.newInstance();
			Imetier metier = (Imetier)  cMetier.newInstance();
			Method met = cMetier.getMethod("setDao", new Class[]{IDAO.class});
			met.invoke(metier, new Object[]{dao});
			System.out.println(metier.calcul());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		
		
//		DaoImpl dao = new DaoImpl();
//		MetierImpl metier = new MetierImpl();
//		metier.setDao(dao);
		
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext(new String[] {"spring-ioc.xml"});
		
		
        
	}

}
