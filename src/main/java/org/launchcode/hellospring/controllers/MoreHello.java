//package org.launchcode.hellospring.controllers;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//@Controller
//@ResponseBody
//@RequestMapping("hellos")
//public class MoreHello {
//
//    @GetMapping("")
//    public String hellos() {
//        return "Hello!";
//    }
//
////    //Handles post requests at path /goodbye-friends
//    @PostMapping("goodbyes-friends") //<--"goodbye" specifies which path our handler should live at.
//    public String goodbyeFriend() {
//        return "Goodbye, Spring Friend!";
//
//    }
//
//        //Responds to get requests at /hellos-you?coder=Batman
//    @GetMapping("hellos")
//    public String helloToo(@RequestParam String coders) {
//        return "Hello, " + coders + "!";
//    }
//
//    @GetMapping("{coders}")
//    //User can be redirected by removing the @ResponseBody annotation from the controller and returning "redirect:/DESIREDPATH"
//    public String helloWithPathParamToo(@PathVariable String coders) {
//        return "Hello, " + coders + "!";
//    }
//
//    @GetMapping("venus/{orbiters}")
//    public String venusOrbiterToo(@PathVariable String orbiters) {
//        return orbiters + " currently orbits Venus.";
//    }
//
//        //Responds to get requests at /hellos?coder=Batman
//        @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
//        public String helloWithQueryParamToo(@RequestParam String coders) {
//            return "Hello, " + coders + "!";
//        }
//
//        @GetMapping("form")
//        public String helloFormToo() {
//            return "<html>" +
//                    "<body>" +
//                    "<form action='hellos' method='post'>" + //Submit a request to /hellos
//                    "<input type='text' name='coders'>" +
//                    "<input type='submit' value='Greet me!'>" +
//                    "</form>" +
//                    "</body>" +
//                    "</html>";
//        }
//
//    @GetMapping("helloToo") //<--On form submission, the data is sent to another path, /helloToo.
//    public String helloToYou(@RequestParam String coders) {
//        return "Hello, " + coders + "!";
//    }
//
//        //To be able to submit the form via POST, we’ll need to modify the hellos() controller to use @RequestMapping.
//        // Remember, @RequestMapping can annotate a method that responds to both GET and POST.
//        @RequestMapping(value="hellos", method = {RequestMethod.GET, RequestMethod.POST})
//        public String helloYouToo(@RequestParam String coders) {
//            return "Hello, " + coders + "!";
//        }
//
//        //Controller method that generates a form at index
//        @GetMapping //<-- Remember, no argument means this maps to "/".
//        public String helloFormsNew() {
//            String html =
//                    "<html>" +
//                            "<body>" +
//                            "<form method='get' action = /hellos'>" +
//                            "<input type-'text' name='coders' />" +
//                            "<input type='submit' value='Greet Me!' />" +
//                            "</form>" +
//                            "</body>" +
//                            "</html>";
//            return html;
//        }
//
//
//}
