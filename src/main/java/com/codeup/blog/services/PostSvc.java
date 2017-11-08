
package com.codeup.blog.services;

import com.codeup.blog.models.Post;
import com.codeup.blog.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PostSvc {
   // private List<Post> posts;
    private final PostRepository postDao;

    @Autowired
    public PostSvc(PostRepository postDao) {
        this.postDao = postDao;

    }

    public Post findById(long id)
    {
        return postDao.findOne(id);
    }

    public Iterable<Post> findAll() {

        return postDao.findAll();
    }

    public Post save(Post post) {

        return postDao.save(post);
    }
    public void delete(Long id){
        postDao.delete(id);

    }

}