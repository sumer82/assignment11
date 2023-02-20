package org.antwalk.Dao;

import java.util.List;

import org.antwalk.model.Phone;

public interface PhoneDao 
{
	public void create(String brand, Integer price);
	 
	 public Phone getPhone(Integer id);
	 
	 public List<Phone> listPhones();
	 
	 public void delete(Integer id);
	 
	 public void update(Integer id, Integer price);
}
