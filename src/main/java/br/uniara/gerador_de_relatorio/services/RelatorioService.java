package br.uniara.gerador_de_relatorio.services;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class RelatorioService {
    private final JdbcTemplate jdbcTemplate;

    public RelatorioService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    public List<Map<String, Object>> listarUsuarios() {
        String sql = "SELECT * FROM TB_USUARIO";
        return jdbcTemplate.queryForList(sql);
    }
    public List<Map<String, Object>> listarServicos() {
        String sql = "SELECT * FROM TB_SERVICO";
        return jdbcTemplate.queryForList(sql);
    }
    public List<Map<String, Object>> listarFuncionarios() {
        String sql = "SELECT * FROM TB_FUNCIONARIO";
        return jdbcTemplate.queryForList(sql);
    }
    public List<Map<String, Object>> listarClientes() {
        String sql = "SELECT * FROM TB_CLIENTE";
        return jdbcTemplate.queryForList(sql);
    }

}
