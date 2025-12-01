package com.testes.spring.testes.repository;

import com.testes.spring.testes.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
