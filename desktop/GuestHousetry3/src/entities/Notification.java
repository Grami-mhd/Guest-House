/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.sql.Date;

/**
 *
 * @author grami
 */
public class Notification {
    private int id;
    private String text;
    private Date date;
    private boolean isSeen;
    private String type;

    public Notification(int id, String text, Date date, boolean isSeen) {
        this.id = id;
        this.text = text;
        this.date = date;
        this.isSeen = isSeen;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Notification(String text, Date date, boolean isSeen) {
        this.text = text;
        this.date = date;
        this.isSeen = isSeen;
    }

    public Notification(String text, Date date,String type) {
        this.type=type;
        this.text = text;
        this.date = date;
    }

    public Notification() {
    }

    public boolean isIsSeen() {
        return isSeen;
    }

    public void setIsSeen(boolean isSeen) {
        this.isSeen = isSeen;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Notification other = (Notification) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Notification{" + "id=" + id + ", text=" + text + ", date=" + date + ", isSeen=" + isSeen + '}';
    }

    
}
