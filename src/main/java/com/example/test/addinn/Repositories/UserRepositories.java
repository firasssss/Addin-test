package com.example.test.addinn.Repositories;

import com.example.test.addinn.Models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositories  extends JpaRepository<UserModel, Long> {




}
