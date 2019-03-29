package com.zpself.modle02;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by zengpeng on 2019/3/25
 */
@Service
public class MyUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //Login login = loginService.findByUsername(username).orElseThrow();

        Set<GrantedAuthority> authorities = new HashSet<>();
        //roleService.getRoles(login.getId()).forEach(r -> authorities.add(new SimpleGrantedAuthority(r.getName())));
        authorities.add(new SimpleGrantedAuthority("/hi2"));
        return new org.springframework.security.core.userdetails.User(
                username, null/*login.getPassword()*/,
                true,//是否可用
                true,//是否过期
                true,//证书不过期为true
                true,//账户未锁定为true
                authorities);
    }
}
