package fyi.thaler.springpetclinic.controllers;

import fyi.thaler.springpetclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owners")
public class OwnerController {

  private final OwnerService ownerService;

  public OwnerController(OwnerService ownerService) {
    this.ownerService = ownerService;
  }

  @GetMapping({"", "/", "index", "index.html"})
  public String getOwners(Model model) {
    model.addAttribute("owners", ownerService.findAll());
    return "owners/index";
  }
}
