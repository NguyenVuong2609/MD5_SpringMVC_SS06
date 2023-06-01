package rikkei.academy.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import rikkei.academy.model.Blog;
import rikkei.academy.service.blog.IBlogService;

import java.util.List;

@Controller
@RequestMapping(value = {"/"})
public class BlogController {
    @Autowired
    private IBlogService blogService;

    @GetMapping
    public String showBlogList(Model model){
        List<Blog> blogList = blogService.findAll();
        model.addAttribute("blogList", blogList);
        return "/blog/list";
    }
}
