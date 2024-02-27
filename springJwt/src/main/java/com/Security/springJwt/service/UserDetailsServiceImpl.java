package com.Security.springJwt.service;

import com.Security.springJwt.repository.UserReposiitory;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserReposiitory userReposiitory;


    public UserDetailsServiceImpl(UserReposiitory userReposiitory) {
        this.userReposiitory = userReposiitory;
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userReposiitory.findByUsername(username).orElseThrow( ()-> new UsernameNotFoundException( " User not found") );
    }
}
