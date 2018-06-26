package ro.helator.einvoicer.controller;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainContoller {

	@GetMapping("/")
    public String index(Model model) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		model.addAttribute("title", "E-Invoicer");
		model.addAttribute("user", auth.getName());
        return "index";
    }

    @GetMapping("/hello")
    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        model.addAttribute("name", name);
        return "hello";
    }
    
//    @GetMapping("/login")
//    public String login(Model model, @RequestParam Optional<String> error) {
//    	model.addAttribute("title", "E-Invoicer - Login");
//    	model.addAttribute("error",error);
//    	return "login";
//    }
    
    @GetMapping("/logout")
    public String logout(Model model, HttpServletRequest request, HttpServletResponse response) {
    	Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    	if (auth != null){    
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
    	return index(model);
    }
}