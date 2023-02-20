package org.antwalk;

import java.util.List;

import org.antwalk.Dao.PhoneDao;
import org.antwalk.model.Phone;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{

	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		PhoneDao ph=(PhoneDao)context.getBean("PhoneDaoImpl");
		System.out.println("Adding Records");
		ph.create("Samsung",60000);
		ph.create("Mi",20000);
		System.out.println("Listing the books:");
		List<Phone>phLi=ph.listPhones();
		for(Phone p:phLi)
		{
			System.out.println("Id:"+p.getId());
			System.out.println("Brand:"+p.getBrand());
			System.out.println("Price:"+p.getPrice());
		}
	}

}