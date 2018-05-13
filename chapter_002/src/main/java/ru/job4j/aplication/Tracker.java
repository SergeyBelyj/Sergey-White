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
        for (Item it : this.items) {
            if (it == item) {
                it = item;
            }
        }
    }
    public Item[] findByName(String key) {
        int kol = 0;
        for (Item it : this.items) {
            if (it.getName().equals(key)) {
                kol++;
            }
        }
        Item[] result = new Item[kol];
        int i = 0;
        for (Item it : this.items) {
            if (it.getName().equals(key)) {
                result[i] = it;
                i++;
            }
        } return result;
    }

    public Item findById(String id) {
        Item result = null;
        for (Item item : this.items)
            if (item.getId().equals(id)) result = item;

        return result;
    }
    public Item[] findAll() {
        Item[] result = new Item[position];
       for(int i = 0; i < position; i ++) {
            result[i] = this.items[i];


            }
            return result;
        }
    public void delete(String id) {
        Item[] result = new Item[position - 1];
        int otAndDo = 0;
        int findPosition = 0;
        for (Item it : this.items) {

            if (it.getId() == id) { otAndDo = findPosition; break;

            }
            findPosition++;
        }
        System.arraycopy(this.items,0, result, 0, otAndDo - 1);
        System.arraycopy(this.items, otAndDo + 1 ,result, otAndDo -1 , this.items.length - otAndDo);
    }

}