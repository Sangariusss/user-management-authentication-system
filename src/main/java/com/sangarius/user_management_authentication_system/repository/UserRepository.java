package com.sangarius.user_management_authentication_system.repository;

import com.sangarius.user_management_authentication_system.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
