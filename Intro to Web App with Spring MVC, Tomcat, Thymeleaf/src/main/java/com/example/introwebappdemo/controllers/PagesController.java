package com.example.introwebappdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

@Controller
public class PagesController {


    @GetMapping("/")
    public String home(@RequestParam(required = false, defaultValue = "World ! ") String name, ModelMap modelMap) {

        modelMap.put("HtmlThymeleafValue", name);
        // with @RequestParam String name, we have the parameter value directly stored in the name value
        // so name is the parameter name in http://localhost:8080/?name=Daniel
        // and it contains as well Daniel with the help of @RequestParam
        // HtmlThymeleafValue is the value that we need to change dynamically. It's templates home.html
        // required set to false makes the name parameter not a MUST otherwise we get an error
        // defaultValue = "World ! ", is value in absence of the name parameter
        return "pages/home";

    }

    /*
    @GetMapping("/")
    // @ResponseBody is used to have string returned as vue response
    public String home(HttpServletRequest request, ModelMap modelMap) {

        String nameValue =
                (request.getParameter("name") != null &&
                        !request.getParameter("name").isEmpty())
                        ? request.getParameter("name") : "world";

        modelMap.put("name", nameValue);

        //System.out.println("\n\n\n" + request.getParameter("name") + "\n\n\n");
        // http://localhost:8080/?name=Daniel allows us to get the value of name parameter which is here Daniel
        // if name value is empty, an empty string is returned and if there is no param null is returned

        return "pages/home";
        // we can even use HTML tags such as return <h1> Hello world </h1>
        // pages/home looks for home.html file in templates folder

    }
     */

}
