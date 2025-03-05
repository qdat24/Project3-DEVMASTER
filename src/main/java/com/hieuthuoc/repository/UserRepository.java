package com.hieuthuoc.repository;

import org.springframework.data.jpa.repository.JpaRepository;s
import org.springframework.stereotype.Repository;
import com.hieuthuoc.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Thêm phương thức tùy chỉnh nếu cần
    User findByEmail(String email);
}
