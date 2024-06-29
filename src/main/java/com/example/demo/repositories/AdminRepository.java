package com.example.demo.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer>
{
	public Admin findByAdminEmail(String email);
}