package org.example;

public class Celula {
    Tarefa tarefa;
    Celula proximo;
    Celula anterior;

    public Celula(Celula anterior, Celula proximo, Tarefa tarefa) {
        this.tarefa = tarefa;
        this.proximo = proximo;
        this.anterior = anterior;
    }

    public Tarefa getTarefa() {
        return tarefa;
    }

    public void setTarefa(Tarefa tarefa) {
        this.tarefa = tarefa;
    }

    public Celula getProximo() {
        return proximo;
    }

    public void setProximo(Celula proximo) {
        this.proximo = proximo;
    }

    public Celula getAnterior() {
        return anterior;
    }

    public void setAnterior(Celula anterior) {
        this.anterior = anterior;
    }
}
