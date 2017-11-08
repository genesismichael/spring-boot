package com.codeup.blog.repository;

import com.codeup.blog.models.User;

import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository <User, Long> {
}
