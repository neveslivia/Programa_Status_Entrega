package Entities;

import java.time.LocalDateTime;

public class Products {
    public String nome;
    public int quantidade;
    public  int valor_produto;


    public Products(){

    }
    public Products(String nome,int quantidade,int valor_produto){
        this.nome= nome;
        this.quantidade = quantidade;
        this.valor_produto = valor_produto;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public int getValor_produto() {
        return valor_produto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setValor_produto(int valor_produto) {
        this.valor_produto = valor_produto;
    }
}
