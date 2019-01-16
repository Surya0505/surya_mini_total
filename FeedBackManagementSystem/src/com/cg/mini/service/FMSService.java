package com.cg.mini.service;

import com.cg.mini.exceptions.FMSException;

public interface FMSService {

	boolean validateFields(String username, String password) throws FMSException;


}
