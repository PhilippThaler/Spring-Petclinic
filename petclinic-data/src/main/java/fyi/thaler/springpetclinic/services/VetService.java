package fyi.thaler.springpetclinic.services;

import fyi.thaler.springpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

  Vet findById(Long id);

  Vet save(Vet owner);

  Set<Vet> findAll();
}
