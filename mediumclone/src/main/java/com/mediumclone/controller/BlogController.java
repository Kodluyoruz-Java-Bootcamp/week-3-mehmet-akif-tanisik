package com.mediumclone.controller;

import com.mediumclone.model.Blog;
import com.mediumclone.model.BlogStatus;
import com.mediumclone.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blogs")
public class BlogController
{
    @Autowired
    private BlogService blogService;

    @PostMapping
    public Blog create(Blog blog)
    {
        blogService.createBlog(blog);
        return blog;
    }

    @DeleteMapping
    public void delete(Blog blog)
    {
        blogService.deleteBlog(blog);
    }

    @GetMapping
    public List<Blog> getAll()
    {
        return blogService.getAll();
    }

    @PutMapping
    public Blog update(BlogStatus status, Blog blog)
    {
        Blog tempBlog = blogService.getAll().stream().filter(blg->blg.getTitle().equals(blog.getTitle())).findFirst().get();
        blogService.removeBlog(tempBlog);
        blogService.createBlog(blog);
        return blog;
    }




}
