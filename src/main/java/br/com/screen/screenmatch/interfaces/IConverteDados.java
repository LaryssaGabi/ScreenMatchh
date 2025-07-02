package br.com.screen.screenmatch.interfaces;

public interface IConverteDados {
   <T> T obterDados(String json, Class<T> classe);
}
