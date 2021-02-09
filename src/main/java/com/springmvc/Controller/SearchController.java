package com.springmvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

    @RequestMapping("/")
    public String home() {
        return "redirect:/search";
    }

    @RequestMapping("/search")
    public String search() {
        return "search";
    }

    @RequestMapping("/do_search")
    public RedirectView doSearch(@RequestParam("search_text") String searchQueryText) {
        System.out.println(searchQueryText);
        RedirectView redirectView = new RedirectView();
        String url = "https://www.google.com/search?q=" + searchQueryText;
        redirectView.setUrl(url);
        return redirectView;
    }
}
