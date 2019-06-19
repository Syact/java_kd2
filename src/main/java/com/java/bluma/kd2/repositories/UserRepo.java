package com.java.bluma.kd2.repositories;

import com.java.bluma.kd2.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Integer> {
}
