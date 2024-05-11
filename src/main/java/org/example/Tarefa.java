package org.example;

public class Tarefa {
    String descricao;
    int prioridade;

    public Tarefa(String descricao, int prioridade) {
        this.descricao = descricao;
        this.prioridade = prioridade;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", prioridade=" + prioridade +
                '}';
    }
}
