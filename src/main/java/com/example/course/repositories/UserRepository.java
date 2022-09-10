package com.example.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course.entities.Usuario;

//@Repository --> Esta annotation é opcional porque a interface já está herdando de JpaRepository que já está registrada como @Repository
public interface UserRepository extends JpaRepository<Usuario, Long> {

}
