package com.offer100.repository;

import com.offer100.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by ren on 2017/9/1.
 */
public interface UserRepository extends JpaRepository<User, Integer> {

}
