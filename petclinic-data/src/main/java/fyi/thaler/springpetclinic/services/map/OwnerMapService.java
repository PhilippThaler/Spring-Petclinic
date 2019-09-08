package fyi.thaler.springpetclinic.services.map;

import fyi.thaler.springpetclinic.model.Owner;
import fyi.thaler.springpetclinic.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {
  @Override
  public Set<Owner> findAll() {
    return super.findAll();
  }

  @Override
  public void deleteById(Long id) {
    super.deleteById(id);
  }

  @Override
  public void delete(Owner object) {
    super.delete(object);
  }

  @Override
  public Owner save(Owner object) {
    return super.save(object);
  }

  @Override
  public Owner findById(Long id) {
    return super.findById(id);
  }

  @Override
  public Owner findByLastName(String lastName) {
    return this.map.entrySet()
        .stream()
        .filter(entry -> entry.getValue().getLastName().equals(lastName))
        .findFirst()
        .get()
        .getValue();
  }
}
