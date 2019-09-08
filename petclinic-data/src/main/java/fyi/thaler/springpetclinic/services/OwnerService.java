package fyi.thaler.springpetclinic.services;

import fyi.thaler.springpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
  T findByLastName(String lastName);
}
