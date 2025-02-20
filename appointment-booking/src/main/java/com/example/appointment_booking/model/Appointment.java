package com.example.appointment_booking.model;

public class Appointment {
    private String name;
    private String date;
    private String time;
    private String contact;
    private String serviceType;
    private String notes;

    public Appointment(String name, String date, String time, String contact, String serviceType, String notes) {
        this.name = name;
        this.date = date;
        this.time = time;
        this.contact = contact;
        this.serviceType = serviceType;
        this.notes = notes;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getContact() {
        return contact;
    }

    public String getServiceType() {
        return serviceType;
    }

    public String getNotes() {
        return notes;
    }
}
