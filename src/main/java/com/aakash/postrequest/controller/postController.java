package com.aakash.postrequest.controller;

import com.aakash.postrequest.bindingClass.bookBindingClass;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class postController {

    @PostMapping(value = "/book" , consumes = "application/json")
    public ResponseEntity<String> postBook (@RequestBody bookBindingClass book){
        System.out.println(book);
        //Store the book that the user sent into the DB.
        String response = "Your data is stored in database.";
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
