package logisticsApp.data.model;

import java.time.LocalDateTime;

public class Event {
    private int id;
    private LocalDateTime when;
    private String what;
    private User who;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getWhen() {
        return when;
    }

    public void setWhen(LocalDateTime when) {
        this.when = when;
    }

    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public User getWho() {
        return who;
    }

    public void setWho(User who) {
        this.who = who;
    }


}
