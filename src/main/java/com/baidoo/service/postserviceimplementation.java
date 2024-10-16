package com.baidoo.blogserveer.service;

import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;

@Service
public class postserviceimplementation {
    @Autowired
    private Postrespostory postrespostory;

    public Post savePost(Post post){
        post.setLikeCount(0);
        post.setViewCount(0);
        post.setCommentCount(0);
        post.setData(new Date());

        return postrespostory.save(post);
    }

    public List<Post> getAllPosts() {
        return postrespostory.findAll();
    }
}