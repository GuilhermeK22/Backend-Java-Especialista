package org.example;

import java.util.LinkedList;
import java.util.Queue;


//enqueue(int valor): Adiciona um elemento no final da fila.
//dequeue(): Remove e retorna o elemento do início da fila.
//rear(): Retorna o elemento do final da fila sem removê-lo.
//front(): Retorna o elemento do início da fila sem removê-lo.
//size(): Retorna o tamanho da fila.
//isEmpty(): Verifica se a fila está vazia.

public class Fila {
        private final Queue<Integer> elementos;

        public Fila() {
            this.elementos = new LinkedList<>();
        }

        // Adiciona um elemento no final da fila
        public void enqueue(int valor) {
            elementos.add(valor);
        }

        // Remove e retorna o elemento do início da fila
        public int dequeue() {
            if (isEmpty()) {
                throw new IllegalStateException("A fila está vazia.");
            }
            return elementos.poll();
        }

        // Retorna o elemento do final da fila sem removê-lo
        public int rear() {
            if (isEmpty()) {
                throw new IllegalStateException("A fila está vazia.");
            }
            return ((LinkedList<Integer>) elementos).getLast();
        }

        // Retorna o elemento do início da fila sem removê-lo
        public int front() {
            if (isEmpty()) {
                throw new IllegalStateException("A fila está vazia.");
            }
            return elementos.peek();
        }

        // Retorna o tamanho da fila
        public int size() {
            return elementos.size();
        }

        // Verifica se a fila está vazia
        public boolean isEmpty() {
            return elementos.isEmpty();
        }

    public static void main(String[] args) {
            Fila fila = new Fila();
            fila.enqueue(10);
            fila.enqueue(20);
            System.out.println("Primeiro da fila: " + fila.front()); // Deve imprimir 10
            System.out.println("Último da fila: " + fila.rear()); // Deve imprimir 20
            System.out.println("Tamanho da fila: " + fila.size()); // Deve imprimir 2
            System.out.println("Elemento removido: " + fila.dequeue()); // Deve imprimir 10
            System.out.println("A fila está vazia? " + fila.isEmpty()); // Deve imprimir false
        }
    }
