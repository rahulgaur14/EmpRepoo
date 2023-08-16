package com.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.entity.Emp;
@Repository
public interface Repo extends JpaRepository<Emp, Integer> {

}
