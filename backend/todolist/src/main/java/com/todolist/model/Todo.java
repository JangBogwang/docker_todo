package com.todolist.model;

import jakarta.persistence.*;

@Entity
@Table(name = "todos") // 기존 테이블 이름과 매핑
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String text;

    private boolean completed = false;

    // Getters and Setters (Lombok 사용 시 @Data 어노테이션으로 생략 가능)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
