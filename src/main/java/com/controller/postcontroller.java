package com.baidoo.blogserveer.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/api/posts")
@CrossOrigin(origins= "*")




public class postcontroller {


    @Autowired
    private PostService postService;
 
    @PostMapping

public ResponseEntity<?> createPost(RequestBody Post post){
    try{
        post createPost=postService.savePost(post);
return ResponseEntity.status(HttpStatus.CREATED).body(createdpost);

    }catch(Exception e){
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build{};
    }
}

@GetMapping
public ResponseEntity<List<Post>getAllPosts(){
    try{
        return ResponseEntity.status(HttpStatus.OK).body(postService.getAllPost());
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.ENTER_SERVER_ERROR).build{};
}
}
