package com.labcom.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.labcom.api.model.Ufs_User;
import com.labcom.api.repository.Ufs_User_Repository;

@RestController
public class Ufs_User_Controller {

	private Ufs_User_Repository repository;
	
	public Ufs_User_Controller(Ufs_User_Repository repository) {
		this.repository = repository;
	}
	
	@RequestMapping(value = "/lab/contact_list",  method = RequestMethod.GET)
	public List<Ufs_User> getLogin() {
		return repository.findAll();
	}
}
