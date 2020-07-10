package com.book.model;

import java.util.UUID;

public class Book {

    public Book() {

        super();
    }

    public Book(String name, String author) {

        super();
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.author = author;
    }

    public String getAuthor() {

        return author;
    }

    public String getId() {

        return id;
    }

    public String getName() {

        return name;
    }


    public void setAuthor(String author) {

        this.author = author;
    }


    public void setId(String id) {

        this.id = id;
    }

    public void setName(String name) {

        this.name = name;
    }


    @Override
    public String toString() {

        return "Book [name=" + name + ", author=" + author + "]";
    }

    protected String name;

    protected String id;

    protected String author;
}
