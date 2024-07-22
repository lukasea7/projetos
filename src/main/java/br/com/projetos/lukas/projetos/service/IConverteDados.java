package br.com.projetos.lukas.projetos.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
