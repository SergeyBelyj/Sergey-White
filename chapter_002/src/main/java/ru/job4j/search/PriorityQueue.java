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
        int index = 0;
        for (int i = 0; i < this.tasks.size(); i++) {
            if ((task.getPriority() > tasks.get(i).getPriority())&&(task.getPriority() < tasks.get(i + 1).getPriority()) ){
                index = i + 1;
               break;
            }
        }
        this.tasks.add(index,task);
    }


    public Task take() {

        return this.tasks.poll();
    }
}
