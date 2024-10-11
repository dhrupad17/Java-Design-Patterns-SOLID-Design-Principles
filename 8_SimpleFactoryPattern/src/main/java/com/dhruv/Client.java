package com.dhruv;

import com.dhruv.factory.PostFactory;
import com.dhruv.model.Post;

public class Client {

    //Driver Code
    public static void main(String[] args) {
        Post post= PostFactory.createPost("news");
        System.out.println(post);
    }
}
