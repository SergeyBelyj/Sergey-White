package ru.job4j.aplication;

public class Item {
   private String id;
   private String name;
   private String desc;
   private long created;
   private String[] comments;

    public Item(String name, String desc, long created) {
        this.name = name;
        this.name = name;
        this.created = created;
    }
    public Item(String id, String name) {
    this.id = id;
    this.name = name;
    }

    public Item(String name) {
        this.name = name;
    }


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

}