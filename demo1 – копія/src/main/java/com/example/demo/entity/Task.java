package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Task {

    @Id
    @GeneratedValue


    private Long id;

    private String title;
    private String description;
    private String status = "NEW";
    @Column(nullable = false)
    private Boolean completed = false; // ✅ нове поле з дефолтним значенням

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public Boolean getCompleted() { return completed; } // ✅ геттер
    public void setCompleted(Boolean completed) { this.completed = completed; } // ✅ сеттер
}
