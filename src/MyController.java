package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entity.BlogEntity;
import com.springrest.springrest.service.BlogServiceImpl;



@RestController
public class MyController {
	

	@Autowired
	BlogServiceImpl blogserivceimpl;
	
	//Get all the blogs
	@GetMapping("/blogs")
	public List<BlogEntity> getBlogs()
	{
		return blogserivceimpl.getBlogs();
	}
	
	
	//Get a blog by id
	@GetMapping("/blogs/{blogId}")
	public BlogEntity getBlog(@PathVariable long blogId)
	{
		return blogserivceimpl.getBlog(blogId);
	}
	
	
    //Add a blog
	@PostMapping("/blogs")
	public BlogEntity addBlog(@RequestBody BlogEntity blog)
	{
		return blogserivceimpl.addBlog(blog);
	}
	
	
	//Delete a blog with given id
	@DeleteMapping("/blogs/{blogId}")
	public String deleteBlog(@PathVariable long blogId)
	{
		return blogserivceimpl.deleteBlog(blogId);
	}
	
	
	//Update the blog with given id
	@PutMapping("/blogs/{blogId}")
	public BlogEntity UpdateBlog(@RequestBody BlogEntity blog, @PathVariable long blogId)
	{
		return blogserivceimpl.UpdateBlog(blog,blogId);
	}
}
