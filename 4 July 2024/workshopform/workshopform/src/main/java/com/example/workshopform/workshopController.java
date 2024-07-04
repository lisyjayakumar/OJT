// WorkshopController.java
package com.example.workshopform;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class workshopController {

    @RequestMapping("/admin")
    public String admin() {
        return "admin"; // This should correspond to your admin.html or admin.jsp
    }

    @RequestMapping("/admininput")
    public String adminInput() {
        return "admininput"; // This should correspond to your admininput.html or admininput.jsp
    }
    @RequestMapping("/display")
    public String display() {
        return "display"; // This should correspond to your admininput.html or admininput.jsp
    }
    @RequestMapping("/register")
    public String register() {
        return "register"; // This should correspond to your admininput.html or admininput.jsp
    }

}
