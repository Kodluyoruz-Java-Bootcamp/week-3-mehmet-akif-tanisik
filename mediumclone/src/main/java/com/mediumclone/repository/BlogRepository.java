package com.mediumclone.repository;

import com.mediumclone.model.Blog;
import com.mediumclone.model.BlogStatus;
import com.mediumclone.model.Tag;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BlogRepository
{
    private static List<Blog> blogList = new ArrayList<Blog>();
    private TagRepository tagRepository = new TagRepository();

    public boolean createBlog(Blog blog)
    {
        if ((blog != null) && (blog.getTag() != null) && (blog.getTag().getTagName()!=null))
        {
            tagRepository.createTag(blog.getTag());

        }
        if(blog.getUser()!=null)
        {
            blog.getUser().getBlogs().add(blog);
        }
        return blogList.add(blog);
    }

    public boolean addBlogToTag(Blog blog, Tag tag)
    {
        if(blog.getTag()!=null)
        {
            System.out.println("Blog's tag is already set!");
            return false;
        }
        if (!blogList.contains(blog))
        {
            System.out.println("Blog is not existing!");
            return false;
        }
        if (!tagRepository.getAll().contains(tag))
        {
            System.out.println("Tag is not existing!");
            return false;
        }
        blog.setTag(tag);
        return tag.getBlogs().add(blog);
    }

    public boolean removeBlogFromTag(Blog blog, Tag tag)
    {
        if (!blogList.contains(blog))
        {
            System.out.println("Blog is not existing!");
            return false;
        }
        if (!tagRepository.getAll().contains(tag))
        {
            System.out.println("Tag is not existing!");
            return false;
        }
        blog.setTag(null);
        return tag.getBlogs().remove(blog);
    }

    public boolean removeBlog(Blog blog)
    {
        if (!blogList.contains(blog))
        {
            System.out.println("Blog is not existing!");
            return false;
        }
        blog.getUser().getBlogs().remove(blog);
        blogList.remove(blog);
        return true;
    }

    public List<Blog> getAll()
    {
        return blogList;
    }

    public TagRepository getTagDao()
    {
        return tagRepository;
    }

    public void setTagDao(TagRepository tagDao)
    {
        this.tagRepository = tagDao;
    }

    public void setBlogStatus(Blog blog, BlogStatus status)
    {
        blog.setBlogStatus(status);
    }

}
