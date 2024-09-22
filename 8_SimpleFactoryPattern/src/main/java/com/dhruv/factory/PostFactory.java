package com.dhruv.factory;

import com.dhruv.model.BlogPost;
import com.dhruv.model.NewsPost;
import com.dhruv.model.Post;
import com.dhruv.model.ProductPost;

public class PostFactory {

    public static Post createPost(String type){
        switch (type){
            case "blog":
                return new BlogPost();
            case "news":
                return new NewsPost();
            case "product":
                return new ProductPost();
            default:
                throw new IllegalArgumentException("Post Type is unknown");
        }
    }
}
