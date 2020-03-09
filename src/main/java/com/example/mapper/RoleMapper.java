package com.example.mapper;

import com.example.entity.Role;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleMapper {

    List<Role> findRoleAll();
}
