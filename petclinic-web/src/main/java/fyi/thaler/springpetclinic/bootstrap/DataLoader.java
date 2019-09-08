package fyi.thaler.springpetclinic.bootstrap;

import fyi.thaler.springpetclinic.model.Owner;
import fyi.thaler.springpetclinic.model.Pet;
import fyi.thaler.springpetclinic.model.PetType;
import fyi.thaler.springpetclinic.model.Vet;
import fyi.thaler.springpetclinic.services.OwnerService;
import fyi.thaler.springpetclinic.services.VetService;
import fyi.thaler.springpetclinic.services.map.OwnerMapService;
import fyi.thaler.springpetclinic.services.map.VetMapService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

  private final OwnerService ownerService;
  private final VetService vetService;

  public DataLoader() {
    ownerService = new OwnerMapService();
    vetService = new VetMapService();
  }

  @Override
  public void run(String... args) throws Exception {
    Owner owner1 = new Owner();
    owner1.setId(1L);
    owner1.setFirstName("Philipp");
    owner1.setLastName("Thaler");
    ownerService.save(owner1);

    Owner owner2 = new Owner();
    owner2.setId(2L);
    owner2.setFirstName("Anja");
    owner2.setLastName("Schütz");
    ownerService.save(owner2);

    System.out.println("Loaded Owners...");

    PetType petType1 = new PetType();
    petType1.setId(1L);
    petType1.setName("Cat");

    PetType petType2 = new PetType();
    petType2.setId(2L);
    petType2.setName("Dog");

    System.out.println("Loaded PetTypes...");

    Pet pet1 = new Pet();
    pet1.setId(1L);
    pet1.setName("Arya");
    pet1.setOwner(owner1);
    pet1.setPetType(petType1);
    pet1.setBirthDate(LocalDate.now());


    Pet pet2 = new Pet();
    pet2.setId(1L);
    pet2.setName("Simba");
    pet2.setOwner(owner1);
    pet2.setPetType(petType2);
    pet2.setBirthDate(LocalDate.now());

    Pet pet3 = new Pet();
    pet3.setId(1L);
    pet3.setName("Mingi");
    pet3.setOwner(owner2);
    pet3.setPetType(petType1);
    pet3.setBirthDate(LocalDate.now());

    System.out.println("Loaded Pets...");

    Vet vet1 = new Vet();
    vet1.setId(1L);
    vet1.setFirstName("Laura");
    vet1.setLastName("Schütz");
    vetService.save(vet1);

    Vet vet2 = new Vet();
    vet2.setId(2L);
    vet2.setFirstName("Franz");
    vet2.setLastName("Schütz");
    vetService.save(vet2);

    System.out.println("Loaded Vets...");
  }
}
