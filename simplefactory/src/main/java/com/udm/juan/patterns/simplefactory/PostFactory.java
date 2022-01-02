package com.udm.juan.patterns.simplefactory;

import com.udm.juan.patterns.simplefactory.model.BlogPost;
import com.udm.juan.patterns.simplefactory.model.NewsPost;
import com.udm.juan.patterns.simplefactory.model.Post;
import com.udm.juan.patterns.simplefactory.model.ProductPost;

public class PostFactory {

	public static Post creatPost(String type) {
		switch (type) {
		case "blog":
			return new BlogPost();
		case "news":
			return new NewsPost();
		case "product":
			return new ProductPost();
		default:
			throw new IllegalArgumentException("Post type is unknown");
		}
	}

}
