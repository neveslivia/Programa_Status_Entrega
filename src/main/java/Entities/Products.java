package Entities;

public class Products {
    public String nome;
    public int quantidade;
    public  Double valor_produto;


    public Products(){

    }
    public Products(String nome,int quantidade,double valor_produto){
        this.nome= nome;
        this.quantidade = quantidade;
        this.valor_produto = valor_produto;
    }
    public double valortotal( double valor_produto,int quantidade){
        return  valor_produto * quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Double getValor_produto() {
        return valor_produto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setValor_produto(int valor_produto) {
        this.valor_produto = (double) valor_produto;
    }

    @Override
    public String toString() {
        return String.format("Nome do produto:, Quantidade:,  Valor total:," , setNome(nome),setQuantidade(quantidade),valortotal());
    }
}
