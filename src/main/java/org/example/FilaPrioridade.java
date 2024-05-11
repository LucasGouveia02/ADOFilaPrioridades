package org.example;

public class FilaPrioridade {
    Celula[] heads;
    int sizeTotal = 0, sizePrioridadeUm = 0, sizePrioridadeZero = 0;
    private Celula inicioPrioridadeZero, inicioPrioridadeUm, atualPrioridadeZero,
            atualPrioridadeUm, auxPrioridadeZero, auxPrioridadeUm;

    public FilaPrioridade() {
        this.heads = new Celula[2]; // Cabeças das filas de prioridade
    }

    public void enqueue(String descricao, int prioridade) {
        Tarefa novaTarefa = new Tarefa(descricao, prioridade);
        if (heads[prioridade] == null) {
            if (prioridade == 0){
                inicioPrioridadeZero = new Celula(null, null, novaTarefa);
                heads[prioridade] = inicioPrioridadeZero;
                auxPrioridadeZero = inicioPrioridadeZero;
                sizePrioridadeZero++;
            } else {
                inicioPrioridadeUm = new Celula(null, null, novaTarefa);
                heads[prioridade] = inicioPrioridadeUm;
                auxPrioridadeUm = inicioPrioridadeUm;
                sizePrioridadeUm++;
            }
        } else {
            if (prioridade == 0) {
                atualPrioridadeZero = new Celula(auxPrioridadeZero, null, novaTarefa);
                auxPrioridadeZero.setProximo(atualPrioridadeZero);
                auxPrioridadeZero = atualPrioridadeZero;
                sizePrioridadeZero++;
            } else {
                atualPrioridadeUm = new Celula(auxPrioridadeUm, null, novaTarefa);
                auxPrioridadeUm.setProximo(atualPrioridadeUm);
                auxPrioridadeUm = atualPrioridadeUm;
                sizePrioridadeUm++;
            }
        }
        sizeTotal++;
    }

    public boolean dequeue(int prioridade) {
        Celula remove = front(prioridade);
        if (remove != null) {
            if (prioridade == 0) {
                inicioPrioridadeZero = remove.getProximo();
                inicioPrioridadeZero.setAnterior(null);
                heads[prioridade] = inicioPrioridadeZero;
                remove.setProximo(null);
                return true;
            } else {
                inicioPrioridadeUm = remove.getProximo();
                inicioPrioridadeUm.setAnterior(null);
                heads[prioridade] = inicioPrioridadeUm;
                remove.setProximo(null);
                return true;
            }
        }
        return false;
    }

    public Celula front(int prioridade) {
        if (prioridade == 0) {
            return inicioPrioridadeZero;
        } else {
            return inicioPrioridadeUm;
        }
    }

    public int sizeTotal() {
        return sizeTotal;
    }

    public int sizePrioridadeUm() {
        return sizePrioridadeUm;
    }

    public int sizePrioridadeZero() {
        return sizePrioridadeZero;
    }

    public void exibirTodasTarefas() {
        for (int i = 1; i >= 0; i--) {
            System.out.println("Prioridade " + i + ":");
            Celula inicio = heads[i];
            while (inicio != null) {
                System.out.println(inicio.getTarefa().toString());
                inicio = inicio.getProximo();
            }
        }
    }
}
