package com.sprint.mission.discodeit.entity;

import java.util.UUID;

public class Main {
    private UUID id;
    private Long createdAt;
    private Long updatedAt;

    public Main(UUID id, Long createdAt, Long updatedAt) {
        this.id = id;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void Getter(){

    }

    public void update(){

    }

    public static void main(String[] args) {

    }
}
