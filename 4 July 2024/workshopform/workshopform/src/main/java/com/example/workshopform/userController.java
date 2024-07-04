// UserController.java
package com.example.workshopform;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class userController {

    @PostMapping("/login")
    public String login(@RequestParam("username") String username,
            @RequestParam("password") String password,
            RedirectAttributes redirectAttributes) {
        if ("admin".equals(username) && "1234".equals(password)) {
            // Redirect to admininput page
            return "redirect:/admininput";
        } else {
            // Redirect back to login page with error message
            redirectAttributes.addFlashAttribute("error", "Invalid username or password");
            return "redirect:/";
        }
    }
}
