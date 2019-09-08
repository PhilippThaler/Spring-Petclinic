package fyi.thaler.springpetclinic.controllers;

import fyi.thaler.springpetclinic.services.OwnerService;
import fyi.thaler.springpetclinic.services.PetService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class PetController {
  private final PetService petService;

  public PetController(PetService petService) {
    this.petService = petService;
  }

  @GetMapping({"", "/", "index", "index.html"})
  public String getOwners(Model model) {
    model.addAttribute("pets", petService.findAll());
    return "pets/index";
  }
}
