package com.codeup.blog.repository;

import com.codeup.blog.models.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PostRepository extends CrudRepository<Post, Long> {

}
