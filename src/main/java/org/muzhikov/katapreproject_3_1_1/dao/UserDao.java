package org.muzhikov.katapreproject_3_1_1.dao;

import org.muzhikov.katapreproject_3_1_1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {

}
