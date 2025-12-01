package com.testes.spring.testes.service;

import com.testes.spring.testes.entity.Aluno;
import com.testes.spring.testes.repository.AlunoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class AlunoService {

    private final AlunoRepository alunoRepository;

    public List<Aluno> listarAluno(){
        return alunoRepository.findAll();
    }

    public Aluno salvarAluno(Aluno aluno){
        aluno.setSituacao(calcularSituacao(aluno.getNota()));
        return alunoRepository.save(aluno);
    }

    public void deletarAluno(Long id){
        alunoRepository.deleteById(id);
    }

    public Optional<Aluno> buscarPorId(Long id){
        return alunoRepository.findById(id);
    }

    public String calcularSituacao(Double nota){
        if (nota >=  7) return "APROVADO";
        if (nota >= 5 && nota <= 6) return "RECUPERACAO";
        return "REPROVADO";
    }


}
