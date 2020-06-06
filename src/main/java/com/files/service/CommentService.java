package com.files.service;

import com.files.persistence.model.Comment;
import com.files.web.dto.CommentDto;

public interface CommentService {

	void save(Comment comment);

	int countNumCommentsByPostId(Long postId);

	Comment createNewCommentOnPost(Long postId, CommentDto newCommentForm);

}
