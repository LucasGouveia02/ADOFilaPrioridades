package org.example;

public class Main {
    public static void main(String[] args) {
        FilaPrioridade filaPrioridade = new FilaPrioridade();
        filaPrioridade.enqueue("Reunião com cliente", 1);
        filaPrioridade.enqueue("Enviar relatório", 0);
        filaPrioridade.enqueue("Preparar apresentação", 1);

        System.out.println("Lista de Tarefas:");
        filaPrioridade.exibirTodasTarefas();

        System.out.println("\nTamanho da fila 1: " + filaPrioridade.sizePrioridadeUm());
        System.out.println("\nTamanho total da fila 0: " + filaPrioridade.sizePrioridadeZero());
        System.out.println("\nTamanho total da fila: " + filaPrioridade.sizeTotal());

        System.out.println("\nPróxima tarefa:");
        filaPrioridade.dequeue(1);

        System.out.println("\nLista de Tarefas atualizada:");
        filaPrioridade.exibirTodasTarefas();

        System.out.println("\nTamanho da fila 1: " + filaPrioridade.sizePrioridadeUm());
        System.out.println("\nTamanho total da fila 0: " + filaPrioridade.sizePrioridadeZero());
        System.out.println("\nTamanho total da fila: " + filaPrioridade.sizeTotal());
        System.out.println("\nFila vazia: " + filaPrioridade.isEmpty());
    }
}