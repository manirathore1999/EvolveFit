package com.springrest.springrest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.BlogDao;
import com.springrest.springrest.entity.BlogEntity;

@Service
public class BlogServiceImpl {
	
	@Autowired
	BlogDao blogdao;

	public List<BlogEntity> getBlogs() {
		return blogdao.findAll();
	}

	public BlogEntity getBlog(long blogId) {
		return blogdao.findById(blogId).get();
	}

	public BlogEntity addBlog(BlogEntity blog) {
		return blogdao.save(blog);
	}
	
	public String deleteBlog(long blogId)
	{
		System.out.println(blogId);
		blogdao.deleteById(blogId);

		return "deleted";
	}

	public BlogEntity UpdateBlog(BlogEntity blog, long blogId) {	
		BlogEntity be = this.getBlog(blogId);
		if(null != be) {
			be.setBlog(blog.getBlog());
			return blogdao.save(be);
		}
		return null;
		
	}
	
	
	

}
