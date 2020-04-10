package com.petclinic.bootstrap;

import com.petclinic.model.Owner;
import com.petclinic.model.PetType;
import com.petclinic.model.Vet;
import com.petclinic.services.OwnerService;
import com.petclinic.services.PetTypeService;
import com.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");

        PetType cat = new PetType();
        cat.setName("Cat");

        petTypeService.save(dog);
        petTypeService.save(cat);

        Owner owner = new Owner();
        owner.setFirstName("Rufat");
        owner.setLastName("Gulabli");
        ownerService.save(owner);

        owner = new Owner();
        owner.setFirstName("Samir");
        owner.setLastName("Mammadli");
        ownerService.save(owner);

        Vet vet = new Vet();
        vet.setFirstName("Eldar");
        vet.setLastName("Eyyubov");
        vetService.save(vet);

        vet = new Vet();
        vet.setFirstName("Zakir");
        vet.setLastName("Aliyev");
        vetService.save(vet);

        System.out.println(Arrays.toString(ownerService.findAll().toArray()));
        System.out.println(Arrays.toString(vetService.findAll().toArray()));
        System.out.println(Arrays.toString(petTypeService.findAll().toArray()));
    }
}
