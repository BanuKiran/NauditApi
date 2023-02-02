package com.ensar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ensar.entity.FileDB;



@Repository
public interface FileDBRepository extends JpaRepository<FileDB, String> {

}