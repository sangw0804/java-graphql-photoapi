package com.serieson.study.photoapi;

import java.util.concurrent.atomic.AtomicInteger;

public class Photo {
    private static AtomicInteger UNIQUE_ID = new AtomicInteger(0);

    private Integer id;
    private String name;
    private String description;

    public Photo(String name, String description) {
        this.id = UNIQUE_ID.getAndIncrement();
        this.name = name;
        this.description = description;
    }
}
