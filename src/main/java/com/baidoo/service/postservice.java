package com.baidoo.blogserveer.service;

import java.util.List;

public interface PostService {

    Post savePost(Post post);

    List<Post> getAllPosts();
}