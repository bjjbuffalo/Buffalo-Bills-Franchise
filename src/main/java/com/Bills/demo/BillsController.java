package com.Bills.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//TEMPLATE ONLY!!
/******************
 * To Do * Create a controller template for a REST API that incorporates Thymeleaf for rendering a webpage view for the user.
******************/
@Controller
@RequestMapping("/Bills")
public class BillsController {



        // Template REST API endpoint returning JSON data
        @GetMapping("/api/data")
        @ResponseBody
        public String getApiData() {
            return "{\"message\": \"This is JSON data from the REST API\"}";
        }

        // Template Thymeleaf view rendering HTML
       // @GetMapping("/webpage")
       // public String getWebpage(Model model) {
           // model.addAttribute("message", "Hello, Thymeleaf!");
           // return "webpage"; // This corresponds to the Thymeleaf template named "webpage.html"
        }
   // }
//}
