package com.Security.springJwt.repository;

import com.Security.springJwt.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserReposiitory extends JpaRepository<User,Integer> {

    Optional<User> findByUsername(String username);
}
