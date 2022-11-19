package com.amigoscode.bookservice;

import lombok.Data;

@Data
public class BookSaveRequest {

    private String name;
    private String author;
    private String price;
}
