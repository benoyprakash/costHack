package com.irs.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.irs.entity.UserAccount;

@Repository
public interface UserAccountRepository extends CrudRepository<UserAccount, Long> {

	public UserAccount findByEmail(String email);

	public UserAccount findByUserTypeAndUserName(Integer userType, String userName);

	public UserAccount findByUserTypeAndEmail(Integer userType, String email);

}
