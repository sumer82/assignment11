package org.antwalk.Dao;

import java.util.List;

import javax.sql.DataSource;
import org.antwalk.model.Phone;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
@Component
public class PhoneDaoImpl implements PhoneDao
{
	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplateObj;
	
	public void setJdbcTemplateObject(JdbcTemplate jdbcTemplateObject) {
		this.jdbcTemplateObj = jdbcTemplateObject;
	}

	public void setDataSource(DataSource ds) {
		this.dataSource = ds;// initializing connection
		this.jdbcTemplateObj = new JdbcTemplate(dataSource);
	}
	public void create(String brand, Integer price)
	 {
		 try
		 {
			 String SQL = "INSERT INTO PH (brand,price) VALUES (?, ?)";
			 jdbcTemplateObj.update(SQL, new Object[]{brand, price} );
				System.out.println("Created Record Brand = " + brand + " Price = " + price);
				 // to simulate the exception.
				 //throw new RuntimeException("simulate Error condition") ;
				  } catch (DataAccessException e) {
				       System.out.println("Error in creating record, rolling back");
				       throw e;
				    }
	 }
	 
	 public Phone getPhone(Integer id)
	 {
		 String SQL = "SELECT * FROM PH WHERE id = ?";
		 Phone phone = (Phone) jdbcTemplateObj.queryForObject(SQL, new Object[]{id}, new PhoneMapper());
		 return phone;
	 }
	 
	 public List<Phone> listPhones()
	 {
		 String SQL = "SELECT * FROM Ph";
		 List<Phone> phones = (List<Phone>) jdbcTemplateObj.query(SQL, new PhoneMapper());
		 return phones;
	 }
	 
	 public void delete(Integer id)
	 {
		 String SQL = "DELETE FROM PH WHERE id = ?";
		 jdbcTemplateObj.update(SQL, new Object[]{id});
		 System.out.println("Deleted Record with EMPID = " + id );
	 }
	 
	 public void update(Integer id, Integer price) 
	 {
		 String SQL = "UPDATE PH SET price = ? WHERE id = ?";
		 jdbcTemplateObj.update(SQL, new Object[]{price, id});
		 System.out.println("Updated Record with EMPID = " + id );
	 }
}
