package ru.job4j.aplication;


import java.util.ArrayList;
import java.util.Calendar;


public class Tracker {

    private ArrayList<Item> items;
    private int position = 0;

    public Item add(Item  item) {
        item.setId(this.generateId());
        this.items.set(this.position++, item);
        return item;
    }

    public void edit(Item fresh) {
        for (int index = 0; index != items.size(); ++index) {
            Item item = items.get(index);
            if (item != null && item.getId().equals(fresh.getId())) {
                items.set(index, fresh);
                break;
            }
        }
    }

    public String generateId() {
        return Math.random() + "" + Calendar.getInstance().getTimeInMillis();
    }

    public void replace(String id, Item item) {
        for (int i = 0; i < this.items.size(); i++) {
            if (this.items.get(i).getId().equals(id)) {
                item.setId(this.items.get(i).getId());
                this.items.set(i, item);
                break;
            }
        }
    }

    public ArrayList<Item> findByName(String key) {
        int kol = 0;
        for (int j = 0; j != position; j++) {
            if (this.items.get(j).getName().equals(key)) {
                kol++;
            }
        }
        ArrayList<Item> result = null;
            int i = 0;
            for (int j = 0; j != position; j++) {
                if (this.items.get(j).getName().equals(key)) {
                    result.set(i, this.items.get(j));
                    i++;
                }
            }
            return result;
    }

    public Item findById(String id) {
        Item result = null;
        if (position > 0) {
            for (Item item : this.items) {
                if (id.equals(item.getId())) {
                    result = item;
                    break;
                }
            }
        }
        return result;
    }

    public ArrayList<Item> findAll() {
        ArrayList<Item> result = null;
       for (int i = 0; i != position; i++) {
           result.set(i, this.items.get(i));
       }
        return result;
    }

    public void delete(String id) {
        if (position > 0) {
            ArrayList<Item> result = null;
            for (Item it : this.items) {
                if (it.getId().equals(id)) {

                    this.items.remove(it);
                    break;
                }
            }
            this.items = result;
        }
    }
}