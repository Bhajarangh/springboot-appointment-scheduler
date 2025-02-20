package com.example.appointment_booking.controller;

import com.example.appointment_booking.model.Appointment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/appointment")
public class AppointmentController {

    @GetMapping("/form")
    public String showForm() {
        return "appointmentForm";
    }

    @PostMapping("/submit")
    public String submitAppointment(
            @RequestParam String name,
            @RequestParam String date,
            @RequestParam String time,
            @RequestParam String contact,
            @RequestParam String serviceType,
            @RequestParam(required = false) String notes,
            Model model) {

        if (notes == null || notes.trim().isEmpty()) {
            notes = "No additional notes provided";
        }

        Appointment appointment = new Appointment(name, date, time, contact, serviceType, notes);
        model.addAttribute("appointment", appointment);
        return "appointmentSuccess";
    }
} 