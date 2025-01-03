package com.UvTech.loginWeb.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.UvTech.loginWeb.Model.LoginEntity;
import com.UvTech.loginWeb.Service.LoginService;

@RestController
public class LoginController {
	
	@Autowired
	private LoginService service;
	
	@GetMapping("/createLogin/{userName}/{password}")
	public String createLogin(
			@PathVariable String userName,
			@PathVariable String password
			) {
		LoginEntity loginObj = new LoginEntity(userName,password);
		
		//constructor way to create obj
		
		//using setters
//		loginObj.setId();
		
		return service.createLogin(loginObj);
	}

	@DeleteMapping("/deleteById/{id}")
	public String deleteById(
			@PathVariable Integer id
			) {
		return service.deleteById(id);
	}
	
	@PutMapping("/updateUser/{id}/{userName}/{password}")
	public String updateUser(
			@PathVariable Integer id,
			@PathVariable String userName,
			@PathVariable String password) {
		
		LoginEntity loginObj = new LoginEntity();
		loginObj.setId(id);
		loginObj.setUserName(userName);
		loginObj.setPassword(password);
		
		return service.updateUser(loginObj);
	}

}
