package com.cg.mini.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.cg.mini.exceptions.FMSException;

import com.cg.mini.model.Users;
import com.cg.mini.utility.JDBCUtility;

public class FMSDaoImpl implements FMSDao {
	
	PreparedStatement statement = null;
	Connection connection = null;
	ResultSet resultSet = null;
	@Override
	public boolean validatefields(String username, String password) throws FMSException {
		List<Users> list= new ArrayList<>();
		connection = JDBCUtility.getConnection();
		boolean flag = false;
		try {
			statement = connection.prepareStatement(QueryMapper.checkQuery);
			statement.setString(1, username);
			statement.setString(2, password);
			resultSet = statement.executeQuery();
			
			while (resultSet.next()) {
				String user = resultSet.getString(1);
				Users users = new Users();
				users.setUsername(user);
				list.add(users);
			}
			if (list.isEmpty()) {
				flag = false;
			}else {
				flag=true;
			}
		} catch (Exception e) {
			throw new FMSException("No data found");
		}
				
		return flag;
	}

}
