package com.testes.spring.testes.controller;

import com.testes.spring.testes.entity.Aluno;
import com.testes.spring.testes.service.AlunoService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@AllArgsConstructor
@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private final AlunoService alunoService;

    @PostMapping
    public Aluno salvarAluno(@RequestBody Aluno aluno){
        return alunoService.salvarAluno(aluno);
    }

    @GetMapping
    public List<Aluno> listarAlunos(){
        return alunoService.listarAluno();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Aluno> listarAlunos(@PathVariable Long id){
        return alunoService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarAluno(@PathVariable Long id) {
        alunoService.deletarAluno(id);
        return ResponseEntity.noContent().build();
    }

}
