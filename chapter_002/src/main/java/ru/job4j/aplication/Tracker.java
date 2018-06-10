package ru.job4j.aplication;


import java.util.Calendar;


public class Tracker {

    private Item[] items = new Item[100];
    private int position = 0;

    public Item add(Item  item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }
    public String generateId() {
        return Math.random() + "" + Calendar.getInstance().getTimeInMillis();
    }

    public void replace(String id, Item item) {
        for (int i = 0; i < this.items.length; i++) {
            if (this.items[i].getId().equals(id)) {
                item.setId(this.items[i].getId());
                this.items[i] = item;
                break;
            }
        }
    }

    public Item[] findByName(String key) {
        int kol = 0;
        for (int j = 0; j != position; j++) {
            if (this.items[j].getName().equals(key)) {
                kol++;
            }
        }
            Item[] result = new Item[kol];
            int i = 0;
            for (int j = 0; j != position; j++) {
                if (this.items[j].getName().equals(key)) {
                    result[i] = this.items[j];
                    i++;
                }
            }
            return result;
    }

    public Item findById(String id) {
        Item result = null;
        for (Item item : this.items) {
            if (item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }

    public Item[] findAll() {
        Item[] result = new Item[position];
       for (int i = 0; i != position; i++) {
           result[i] = this.items[i];
       }
        return result;
    }

    public void delete(String id) {
        Item[] result = new Item[position - 1];
        int otAndDo = 0;
        int findPosition = 0;
        for (Item it : this.items) {
            if (it.getId().equals(id)) {
                otAndDo = findPosition;
                break;
            } else {
                findPosition++;
            }
        }
            System.arraycopy(this.items, 0, result,  0, otAndDo);
            System.arraycopy(this.items, otAndDo + 1, result, otAndDo, position - 1);
        this.items = result;
        this.position--;
    }
}