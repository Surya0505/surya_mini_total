package com.cg.mini.dao;

import com.cg.mini.exceptions.FMSException;

public interface FMSDao {

	boolean validatefields(String username, String password)throws FMSException;

}
