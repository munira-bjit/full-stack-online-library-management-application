package com.munira.miniproject.repository;

import com.munira.miniproject.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByEmail(String email);
    UserEntity findByUserId(Long userId);

    List<UserEntity> findAllByRole(String user);
}
