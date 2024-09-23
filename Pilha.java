package org.example;

import java.util.ArrayList;

//push(int valor): Adiciona um elemento no topo da pilha.
// pop(): Remove e retorna o elemento do topo da pilha.
// top(): Retorna o elemento do topo da pilha sem removê-lo.
// isEmpty(): Verifica se a pilha está vazia.
// size(): Retorna o tamanho da pilha.
public class Pilha {
        private final ArrayList<Integer> elementos;

        public Pilha() {
            this.elementos = new ArrayList<>();
        }

        // Adiciona um elemento no topo da pilha
        public void push(int valor) {
            elementos.add(valor);
        }

        // Remove e retorna o elemento do topo da pilha
        public int pop() {
            if (isEmpty()) {
                throw new IllegalStateException("A pilha está vazia.");
            }
            return elementos.remove(elementos.size() - 1);
        }

        // Retorna o elemento do topo da pilha sem removê-lo
        public int top() {
            if (isEmpty()) {
                throw new IllegalStateException("A pilha está vazia.");
            }
            return elementos.get(elementos.size() - 1);
        }

        // Verifica se a pilha está vazia
        public boolean isEmpty() {
            return elementos.isEmpty();
        }

        // Retorna o tamanho da pilha
        public int size() {
            return elementos.size();
        }
    public static void main(String[] args) {
            Pilha pilha = new Pilha();
            pilha.push(10);
            pilha.push(20);
            System.out.println("Topo da pilha: " + pilha.top()); // Deve imprimir 20
            System.out.println("Tamanho da pilha: " + pilha.size()); // Deve imprimir 2
            System.out.println("Elemento removido: " + pilha.pop()); // Deve imprimir 20
            System.out.println("A pilha está vazia? " + pilha.isEmpty()); // Deve imprimir false
        }
    }
