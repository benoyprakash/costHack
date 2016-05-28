package com.irs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.irs.entity.UserDetails;


@Repository
@Transactional(readOnly = true, value = "transactionManager")
public interface LoginRepository extends JpaRepository<UserDetails, String>{
	
	@Query("SELECT role FROM UserDetails WHERE userId = ? AND password = ?")
	public String authenticate(String  userName, String password);

}
