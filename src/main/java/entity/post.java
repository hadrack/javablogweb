package com.baidoo.blogserveer.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
class entityClassName {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private long id;
     private String name;

     @Column(length=5000)
     private String content;

     private String postedly;

     private String img;
     private Date date;
      private int likecount;
      private list<String> tags


    private entityIdType id;

    public entityClassName() {
    }

    public entityIdType getId() {
        return id;
    }

    public void setId(entityIdType id) {
        this.id = id;
    }
}



public class post {


}
