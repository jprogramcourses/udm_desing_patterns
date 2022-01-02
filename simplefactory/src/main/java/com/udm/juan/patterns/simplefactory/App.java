package com.udm.juan.patterns.simplefactory;

import com.udm.juan.patterns.simplefactory.model.Post;

public class App {
    
    public static void main(String[] args) {
    	
    	Post post = PostFactory.creatPost("news");
    	System.out.println(post);
    	
    }
    
}
