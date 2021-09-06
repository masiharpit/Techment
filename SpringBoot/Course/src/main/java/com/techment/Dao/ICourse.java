package com.techment.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.techment.Entity.Course1;

@Repository
public interface ICourse extends JpaRepository<Course1, Integer>{

}
