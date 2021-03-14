package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chris Bay
 */
@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloSpringController {

//        //Handles requests at path /hello
//    @GetMapping("hello") //<--"hello" specifies which path our handler should live at.
//    public String hello() {
//        return "Hello, Spring!";
//    }

//    Handles requests at path /goodbye
//    Lives at /hello/goodbye
    @GetMapping("goodbye") //<--"goodbye" specifies which path our handler should live at.
    public String goodbye() {
        return "Goodbye, Spring!";

    }
//     Live at hello/hello
//    Handles request of the form /hello?name=LaunchCode
    @GetMapping("hello")
    public String helloWithQueryParam(@RequestParam String name) {
        return "Hello, " + name + "!";

    }

    //Path Parameter, or Variable, handles requests of the form /hello/LaunchCode
    //@PathVariable takes an argument that, if matching a portion of the URL, will deliver this data into the handler.
    //name is a placeholder, indicating where in the URL segment to look for the @PathVariable
//    @GetMapping("{name}")
//    //User can be redirected by removing the @ResponseBody annotation from the controller and returning "redirect:/DESIREDPATH"
//    public String helloWithPathParameter(@PathVariable String name) {
//        return "Hello, " + name + "!";
//    }

    //To be able to submit the form via POST, we’ll need to modify the hello() controller to use @RequestMapping.
    // Remember, @RequestMapping can annotate a method that responds to both GET and POST.
    // Live at hello/hello
    //Handles request of the form /hello?name=LaunchCode
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
    public String helloWithQueryParam(@RequestParam String name, @RequestParam String language) {
        return "Hello, " + name + "! Which " + language + "would you like to be greeted in?";
    }
    //Lives at /hello/form
    @GetMapping("form")
    public String helloForm(){
        return "<html>" +
                "<body>" +
                "<form action='hello'>" + //Submit a request to /hello
                "<input type='text' name='name'>" +
                "<select name='language'>" +
                    "<option value='French'>French</option>" +
                    "<option value='German'>German</option>" +
                    "<option value='Spanish'>Spanish</option>" +
                    "<option value='English'>English</option>" +
                    "<option value='Italian'>Italian</option>" +
                "</select>" +
                "<input type='submit' value='Greet me!'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

}













//@Controller
//public class HelloSpringController {

//    // Responds to /hello?name=LaunchCode
//    @RequestMapping(value = "hello", method = {RequestMethod.GET, RequestMethod.POST})
//    public String hello(@RequestParam String name, Model model) {
//        String greeting = "Hello, " + name + "!";
//        model.addAttribute("greeting", greeting);
//        return "hello";
//    }
//
//    // Responds to /hello/LaunchCode
//    @GetMapping("hello/{name}")
//    public String helloAgain(@PathVariable String name, Model model) {
//        String greeting = "Hello, " + name + "!";
//        model.addAttribute("greeting", greeting);
//        return "hello";
//    }
//
//    @GetMapping("form")
//    public String helloForm() {
//        return "form";
//    }
//
//    @GetMapping("hello-names")
//    public String helloNames(Model model) {
//        List<String> names = new ArrayList<>();
//        names.add("LaunchCode");
//        names.add("Java");
//        names.add("JavaScript");
//        model.addAttribute("names", names);
//        return "hello-list";
//    }
//
//}
