package com.springrest.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springrest.springrest.entity.BlogEntity;

@Repository
public interface BlogDao extends JpaRepository<BlogEntity,Long>
{

	
	
}
