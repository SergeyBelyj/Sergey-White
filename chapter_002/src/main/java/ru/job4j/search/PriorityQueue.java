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
        int index = tasks.size();
        for (Task t : tasks) {
            if ((t.getPriority() > task.getPriority())){
                index = tasks.indexOf(t);
               break;
            }
        }
        this.tasks.add(index,task);
    }


    public Task take() {

        return this.tasks.poll();
    }
}
