package com.UvTech.loginWeb.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.UvTech.loginWeb.Model.LoginEntity;

@Repository
public interface LoginRepo extends JpaRepository<LoginEntity,Integer>{

	//class 
//	public static void show() {
//		System.out.print(false);
//    };
    
    
    //interface
//    public void show();
}
