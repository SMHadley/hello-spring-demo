//package org.launchcode.hellospring.controllers;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//@Controller
//public class HelloAgain {
//
//
////    //Handles post requests at path /goodbye-friend
////    @PostMapping("goodbye-friend") //<--"goodbye" specifies which path our handler should live at.
////    @ResponseBody
////    public String goodbyeFriend() {
////        return "Goodbye, Spring Friend!";
////
////    }
//
////    //Handles get and post requests at path /hello-goodbye
////    @RequestMapping(value="hello-goodbye", method= {RequestMethod.GET, RequestMethod.POST})
////    public String helloGoodbye() {
////        return "Salutations, Spring Friend!";
////
////    }
//
//    //Responds to get requests at /hello-you?coder=Batman
////    @GetMapping("hello-you")
////    @ResponseBody
////    public String helloTwo(@RequestParam String coder) {
////        return "Hello, " + coder + "!";
////    }
//
////    @GetMapping("hello-you/{coder}")
////    //User can be redirected by removing the @ResponseBody annotation from the controller and returning "redirect:/DESIREDPATH"
////    public String helloWithPathParamTwo(@PathVariable String coder) {
////        return "Hello, " + coder + "!";
////    }
//
////    @GetMapping("venus/{orbiter}")
////    @ResponseBody
////    public String venusOrbiterTwo(@PathVariable String orbiter) {
////        return orbiter + " currently orbits Venus.";
////    }
//
//    //Responds to get requests at /hello-you?coder=Batman
//    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "hello-you")
//    @ResponseBody
//    public String helloWithQueryParamTwo(@RequestParam String coder) {
//        return "Hello, " + coder + "!";
//    }
//
//    @GetMapping("form")
//    @ResponseBody
//    public String helloFormTwo() {
//        return "<html>" +
//                "<body>" +
//                "<form action='hello-you' method='post'>" + //Submit a request to /hello-you
//                "<input type='text' name='coder'>" +
//                "<input type='submit' value='Greet me!'>" +
//                "</form>" +
//                "</body>" +
//                "</html>";
//    }
////
////    @GetMapping("helloTwo") //<--On form submission, the data is sent to another path, /helloTwo.
////    @ResponseBody
////    public String helloYouTwo(@RequestParam String coder) {
////        return "Hello, " + coder + "!";
////    }
//
//    //To be able to submit the form via POST, we’ll need to modify the hello() controller to use @RequestMapping.
//    // Remember, @RequestMapping can annotate a method that responds to both GET and POST.
//    @RequestMapping(value="hello", method = {RequestMethod.GET, RequestMethod.POST})
//    @ResponseBody
//    public String helloYouTwo(@RequestParam String coder) {
//        return "Hello, " + coder + "!";
//    }
//
//    //Controller method that generates a form at index
//    @GetMapping //<-- Remember, no argument means this maps to "/".
//    @ResponseBody
//    public String helloFormNew() {
//        String html =
//                "<html>" +
//                        "<body>" +
//                        "<form method='get' action = /helloTwo'>" +
//                        "<input type-'text' name='coder' />" +
//                        "<input type='submit' value='Greet Me!' />" +
//                        "</form>" +
//                        "</body>" +
//                        "</html>";
//        return html;
//    }
//}
