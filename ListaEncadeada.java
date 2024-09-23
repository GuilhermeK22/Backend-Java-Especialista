package org.example;

//push(int valor): Adiciona um nó no início da lista.
//pop(): Remove e retorna o nó do início da lista.
//insert(int index, int valor): Insere um nó em uma posição específica.
//remove(int index): Remove o nó de uma posição específica.
//elementAt(int index): Retorna o nó de uma posição específica.
//size(): Retorna o tamanho da lista.
//printList(): Imprime todos os elementos da lista.
public class ListaEncadeada {
        private Node head;
        private int tamanho;

        private static class Node {
            int valor;
            Node proximo;

            Node(int valor) {
                this.valor = valor;
                this.proximo = null;
            }
        }

        public ListaEncadeada() {
            this.head = null;
            this.tamanho = 0;
        }

        // Adiciona um nó no início da lista
        public void push(int valor) {
            Node novoNode = new Node(valor);
            novoNode.proximo = head;
            head = novoNode;
            tamanho++;
        }

        // Remove e retorna o nó do início da lista
        public void pop() {
            if (isEmpty()) {
                throw new IllegalStateException("A lista está vazia.");
            }
            head = head.proximo;
            tamanho--;
        }

        private boolean isEmpty() {
            return false;
        }

        // Insere um nó em uma posição específica
        public void insert(int index, int valor) {
            if (index < 0 || index > tamanho) {
                throw new IndexOutOfBoundsException("Índice fora dos limites.");
            }
            if (index == 0) {
                push(valor);
                return;
            }
            Node novoNode = new Node(valor);
            Node atual = head;
            for (int i = 0; i < index - 1; i++) {
                atual = atual.proximo;
            }
            novoNode.proximo = atual.proximo;
            atual.proximo = novoNode;
            tamanho++;
        }

        // Remove o nó de uma posição específica
        public void remove(int index) {
            if (index < 0 || index >= tamanho) {
                throw new IndexOutOfBoundsException("Índice fora dos limites.");
            }
            if (index == 0) {
                pop();
                return;
            }
            Node atual = head;
            for (int i = 0; i < index - 1; i++) {
                atual = atual.proximo;
            }
            atual.proximo = atual.proximo.proximo;
            tamanho--;
        }

        // Retorna o nó de uma posição específica
        public Node elementAt(int index) {
            if (index < 0 || index >= tamanho) {
                throw new IndexOutOfBoundsException("Índice fora dos limites.");
            }
            Node atual = head;
            for (int i = 0; i < index; i++) {
                atual = atual.proximo;
            }
            return atual;
        }

        // Retorna o tamanho da lista
        public int size() {
            return tamanho;
        }

        // Imprime todos os elementos da lista
        public void printList() {
            Node atual = head;
            while (atual != null) {
                System.out.print(atual.valor + " ");
                atual = atual.proximo;
            }
            System.out.println();
        }

    public static void main(String[] args) {
            ListaEncadeada lista = new ListaEncadeada();
            lista.push(10);
            lista.push(20);
            lista.insert(1, 15);
            lista.printList(); // Deve imprimir 20 15 10
            System.out.println("Elemento no índice 1: " + lista.elementAt(1).valor); // Deve imprimir 15
            lista.remove(1);
            lista.printList(); // Deve imprimir 20 10
            System.out.println("Tamanho da lista: " + lista.size()); // Deve imprimir 2
        }
    }
