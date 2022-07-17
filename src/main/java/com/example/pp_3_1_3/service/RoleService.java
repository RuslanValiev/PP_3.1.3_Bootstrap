package com.example.pp_3_1_3.service;

import com.example.pp_3_1_3.entity.Role;

import java.util.Set;

public interface RoleService {
    Set<Role> getAllRoles();
    Role getRoleByName(String name);
    Set<Role> getSetOfRoles(String[] roleNames);
    void add(Role role);
    void edit(Role role);
    Role getById(int id);
}
