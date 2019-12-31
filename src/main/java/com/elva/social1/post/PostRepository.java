package com.elva.social1.post;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, String> {
	public List<Post> findByUserId(String userId);

}
