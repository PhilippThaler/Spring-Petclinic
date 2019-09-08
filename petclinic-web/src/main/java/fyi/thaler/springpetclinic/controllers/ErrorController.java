package fyi.thaler.springpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/error")
public class ErrorController {
  @GetMapping({"", "/", "index", "index.html"})
  public String getError() {
   return "error/index";
  }
}
