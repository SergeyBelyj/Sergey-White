package ru.job4j.aplication;

import java.util.Objects;

public class Item extends Object {
   private String id;
   private String name;
   private String desc;
   private long created;
   private String[] comments;

    public Item(String name, String desc, long created) {
        this.name = name;
        this.desc = desc;
        this.created = created;
    }

    public Item(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public Item() { }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public long getCreated() {
        return created;
    }

    public String getName() {
        return name;
    }

    public String[] getComments() {
        return comments;
    }

    public void setComments(String[] comments) {
        this.comments = comments;
    }

    public void setCreated(long created) {
        this.created = created;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Item)) {
            return false;
        }
        Item item = (Item) o;
        return created == item.created
                && Objects.equals(name, item.name)
                && Objects.equals(desc, item.desc);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, desc, created);
    }

    @Override
    public String toString() {
        return "Item{"
                + "name='"
                + this.name
                + '\''
                +  '}';
    }
}