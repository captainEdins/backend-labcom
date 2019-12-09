package com.labcom.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.labcom.api.model.Ufs_Oauth;
import com.labcom.api.model.Ufs_User;


public interface Ufs_Oauth_Repository extends JpaRepository<Ufs_Oauth,Long>{
	Ufs_Oauth findByUsername(String username);

}
