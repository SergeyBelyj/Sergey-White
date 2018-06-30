package ru.job4j.aplication;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;


public class Tracker {

    private List<Item> items = new ArrayList<Item>();
    private int position = 0;

    public Item add(Item  item) {
        item.setId(this.generateId());
        this.items.add(this.position++, item);
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

    public List<Item> findByName(String key) {
            List<Item> result = new ArrayList<Item>();
            int i = 0;
            for (int j = 0; j != this.items.size(); j++) {
                if (this.items.get(j).getName().equals(key)) {
                    result.add(i, this.items.get(j));
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

    public List<Item> findAll() {
       List<Item> result = new ArrayList<Item>();
       for (int i = 0; i != this.items.size(); i++) {
           result.add(i, this.items.get(i));
       }
        return result;
    }

    public void delete(String id) {
        if (position > 0) {
            List<Item> result = new ArrayList<Item>();
            for (Item it : this.items) {
                if (it.getId().equals(id)) {
                    this.items.remove(it);
                    break;
                }
            }
            result = this.items;
            this.position--;
        }
    }
}