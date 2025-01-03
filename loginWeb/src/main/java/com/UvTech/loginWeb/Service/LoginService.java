package com.UvTech.loginWeb.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UvTech.loginWeb.Model.LoginEntity;
import com.UvTech.loginWeb.Repo.LoginRepo;

@Service
public class LoginService {
	
	@Autowired
	private LoginRepo loginRepo;

	public String createLogin(LoginEntity loginObj) {
		loginRepo.save(loginObj);
		return "account created successfully.";
	}

	public String deleteById(Integer id) {
		
		// sql query --> delete from table LoginEntity where id = 1
		loginRepo.deleteById(id);
		return "account deleted succesfully.";
	}

	public String updateUser(LoginEntity loginObj) {
		loginRepo.save(loginObj);
		return "user updated successfully.";
	}
	
	
	// Ui --> controller --> service --> DAO layer
}
