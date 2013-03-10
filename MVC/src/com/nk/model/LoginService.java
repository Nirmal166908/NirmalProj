package com.nk.model;

public class LoginService {
	
	public String authenticateLogin(LoginBean Login){
		
		String retVal = null;
		System.out.println("inside service call....");
		if(this.IsLoginFldsPresent(Login)){
			System.out.println("inside login fld");
			if(this.validateLogin(Login)){
				Login.setMessage("Welcome Nirmal Kumar Ravi!");
				retVal = "success";
			}
			else{
				Login.setMessage("user name or Password incorrect");
				retVal = "failure";
			}
		}
		else{
			Login.setMessage("Please Enter Login Id And Pasword");
			retVal="failure";
		}
		return retVal;
	}
	
	public boolean IsLoginFldsPresent(LoginBean Login){
		if(Login.getLoginId().isEmpty() || Login.getPassword().isEmpty()){
			return false;
		}
		return true;
	}
	
	public boolean validateLogin(LoginBean Login){
		if(Login.getLoginId().equals("nirmal") && Login.getPassword().equals("kumar")){
			return true;
		}
		return false;
	}
}