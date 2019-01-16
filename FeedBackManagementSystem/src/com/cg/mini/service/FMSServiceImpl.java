package com.cg.mini.service;

import com.cg.mini.dao.FMSDao;
import com.cg.mini.dao.FMSDaoImpl;
import com.cg.mini.exceptions.FMSException;

public class FMSServiceImpl implements FMSService {
	
	FMSDao fmsdao = new FMSDaoImpl();
	

	@Override
	public boolean validateFields(String username, String password) throws FMSException {
		// TODO Auto-generated method stub
		return fmsdao.validatefields(username,password);
	}

}
