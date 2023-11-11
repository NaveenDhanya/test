package com.vijay.controller;
import com.vijay.model.Userlist;
import com.vijay.service.WebService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class WebController {
    @Autowired
    WebService webService;

    @GetMapping("/index")
    public ModelAndView welcome() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index.html");
        return modelAndView;
    }
//    @RequestMapping(path = "/postdata", method = RequestMethod.POST)
//    public String handleform(@RequestParam("email") String userEmail ,
//                             @RequestParam("name") String userName) {
//        System.out.println("user email" + userEmail);
//        Syetm.out.printIn("user name" + userName);
//        return "";
//
//    }

    @PostMapping("/postdata")
//        public String processContact(@ModelAttribute Userlist userdetails) {
//        return "index.html";
    public Userlist saveUserlist(@ModelAttribute Userlist userdetails){
//    public Userlist saveUserlist(@RequestBody Userlist userdetails){

        return webService.create(userdetails);
    }
}