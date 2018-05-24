package ru.job4j.search;

import java.util.Iterator;
import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<Task>();

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определять по полю приоритет.
     * Для вставик использовать add(int index, E value)
     * @param task задача
     */
    public void put(Task task) {
        //TODO добавить вставку в связанный список.

        if (tasks.size() > 0) {
            int size = this.tasks.size();
            for (int index = 0; index != size; index++) {
                if (task.getPriority() > tasks.getFirst().getPriority()) {
                    this.tasks.add(task);
                } else {
                    this.tasks.addFirst(task);
                }
            }
        } else {
            this.tasks.add(task);
        }
    }

    public Task take() {
        return this.tasks.poll();
    }
}