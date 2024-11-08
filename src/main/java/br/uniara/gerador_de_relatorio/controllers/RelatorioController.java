package br.uniara.gerador_de_relatorio.controllers;

import br.uniara.gerador_de_relatorio.services.RelatorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/relatorio")
public class RelatorioController {

    @Autowired
    RelatorioService relatorioService;

    /**
     * Este grupo abaixo é para os relatorios locais
     */

    @GetMapping("/")
    public ModelAndView findAll() {
        ModelAndView mv = new ModelAndView("relatorio_pagina");
        return mv;
    }
    @GetMapping("/usuario")
    public ModelAndView listarUsuarios() {
        List<Map<String, Object>> usuarios = relatorioService.listarUsuarios();
        ModelAndView mv = new ModelAndView("/Relatorio_Usuario_Pagina");
        mv.addObject("ObjetoRelatorioUsuarios", usuarios);
        return mv;
    }
    @GetMapping("/servico")
    public ModelAndView listarServicos() {
        List<Map<String, Object>> servicos = relatorioService.listarServicos();
        ModelAndView mv = new ModelAndView("/Relatorio_Servico_Pagina");
        mv.addObject("ObjetoRelatorioServicos", servicos);
        return mv;
    }
    @GetMapping("/funcionario")
    public ModelAndView listarFuncionarios() {
        List<Map<String, Object>> funcionarios = relatorioService.listarFuncionarios();
        ModelAndView mv = new ModelAndView("/Relatorio_Funcionario_Pagina");
        mv.addObject("ObjetoRelatorioFuncionarios", funcionarios);
        return mv;
    }
    @GetMapping("/cliente")
    public ModelAndView listarClientes() {
        List<Map<String, Object>> clientes = relatorioService.listarClientes();
        ModelAndView mv = new ModelAndView("/Relatorio_Cliente_Pagina");
        mv.addObject("ObjetoRelatorioClientes", clientes);
        return mv;
    }

    /**
     * Este grupo abaixo são para a dashboard que tem o javascript
     */
    @GetMapping("/dashboard/usuario")
    public ResponseEntity<List<Map<String, Object>>> listarUsuariosDash() {
        List<Map<String, Object>> usuarios = relatorioService.listarUsuarios();
        return ResponseEntity.ok(usuarios);
    }
    @GetMapping("/dashboard/servico")
    public ResponseEntity<List<Map<String, Object>>> listarServicosDash() {
        List<Map<String, Object>> servicos = relatorioService.listarServicos();
        return ResponseEntity.ok(servicos);
    }
    @GetMapping("/dashboard/funcionario")
    public ResponseEntity<List<Map<String, Object>>> listarFuncionariosDash() {
        List<Map<String, Object>> funcionarios = relatorioService.listarFuncionarios();
        return ResponseEntity.ok(funcionarios);
    }
    @GetMapping("/dashboard/cliente")
    public ResponseEntity<List<Map<String, Object>>> listarClientesDash() {
        List<Map<String, Object>> clientes = relatorioService.listarClientes();
        return ResponseEntity.ok(clientes);
    }

}
