package org.antwalk.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.antwalk.model.Phone;
import org.springframework.jdbc.core.RowMapper;

public class PhoneMapper implements RowMapper<Phone>
{

	@Override
	public Phone mapRow(ResultSet rs, int rowNum) throws SQLException 
	{
		Phone p=new Phone();
		p.setId(rs.getInt("id"));
		p.setBrand(rs.getString("brand"));
		p.setPrice(rs.getInt("price"));
		return p;
	}
	
}
