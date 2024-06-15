package com.dauphine.blogger.Repository;

import com.dauphine.blogger.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface PostRepository extends JpaRepository<Post, UUID> {
    List<Post> findAllByCategoryId(UUID categoryId);
    List<Post> findAllByTitleOrContent(String title, String content);
}
