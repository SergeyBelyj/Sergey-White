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
        Iterator<Task> iterator = tasks.iterator();
        if (tasks.size() > 0) {
            if (task.getPriority() > tasks.getFirst().getPriority()) {
                iterator.next();
                this.tasks.add(task);
            } else {
                this.tasks.addFirst(task);
            }
        } else {
            this.tasks.add(task);
        }
    }

    public Task take() {
        return this.tasks.poll();
    }
}