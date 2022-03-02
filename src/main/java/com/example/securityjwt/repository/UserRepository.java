package com.example.securityjwt.repository;

import com.example.securityjwt.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author z.xin
 * @since 02.03.2022 12:54
 */

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserName(String userName);
}
