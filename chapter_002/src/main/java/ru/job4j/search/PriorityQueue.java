package ru.job4j.search;

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
        if (tasks.size() == 0) {
            this.tasks.add(task);
        }
        int max = this.tasks.size();
        for (int index = 0; index < max; index++) {
            if (task.getPriority() < tasks.get(index).getPriority()) {
               this.tasks.add(index, task);
               break;
            }
        }
    }

    public Task take() {

        return this.tasks.poll();
    }
}
