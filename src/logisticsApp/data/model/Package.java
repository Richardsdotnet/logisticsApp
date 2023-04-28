package logisticsApp.data.model;

import java.time.LocalDateTime;
import java.util.List;

public class Package {
    private int id;
    private int weightInGrams;
    private User sender;
    private User receiver;
    private LocalDateTime timeCreated;

    public int getId() {
        System.out.println(id);
        return id;

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWeightInGrams() {
        return weightInGrams;
    }

    public void setWeightInGrams(int weightInGrams) {
        this.weightInGrams = weightInGrams;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public LocalDateTime getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(LocalDateTime timeCreated) {
        this.timeCreated = timeCreated;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public boolean isPayOnDelivery() {
        return payOnDelivery;
    }

    public void setPayOnDelivery(boolean payOnDelivery) {
        this.payOnDelivery = payOnDelivery;

    }

    private List<Event> events;
    private boolean payOnDelivery;


}
