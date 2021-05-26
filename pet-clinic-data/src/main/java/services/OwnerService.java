package services;

import com.example.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findByLastName(String lastName);
    Set<Owner> findAll();
    Owner findById(Long id);
    Owner save(Owner owner);
}