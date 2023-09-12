package algorithm.sem_4.task_2;

/*
1. Добавляем массив связных списков с фиксированным размером (массив
бакетов), либо передаваемым в конструкторе.
2. Хэш-таблица оперирует индексами, потому массив будет идеальным
вариантов для представления бакетов.
3. Также реализуем метод вычисления индекса на основании хэш-кода
ключа.
 */

import algorithm.sem_4.task_1.HashTable;

public class HashTable2<K,V> {

    private static final int INIT_BASKET_COUNT = 16;

    private Basket[] baskets;

    public HashTable2() {
        this(INIT_BASKET_COUNT);
    }

    public HashTable2(int initSize) {
        baskets = (Basket[]) new Object[initSize];
    }

    private int calculateBasketIndex(K key) {
        return key.hashCode() % baskets.length;
    }

    private class Entity{

        private K key;
        private V value;
    }

    private class Basket{

        private Node head;

        private class Node{
            private Node text;

            private Entity value;
        }
    }

}
