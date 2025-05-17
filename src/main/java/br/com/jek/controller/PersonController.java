package br.com.jek.controller;

import br.com.jek.data.dao.PersonDTO;
import br.com.jek.service.PersonService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/person")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public ResponseEntity<List<PersonDTO>> getAllPersons(){
        List<PersonDTO> persons = personService.findAll();
        return ResponseEntity.ok(persons);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<PersonDTO> getPersonById(@PathVariable("id") Long id){
        PersonDTO personDTO = personService.findById(id);
        return ResponseEntity.ok(personDTO);
    }

    @PostMapping
    public ResponseEntity<PersonDTO> createPerson(@RequestBody @Valid PersonDTO personDTO){
        PersonDTO person = personService.create(personDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(person);
    }

    @PutMapping
    public ResponseEntity<PersonDTO> updatePerson(@RequestBody @Valid PersonDTO personDTO){
        PersonDTO person = personService.update(personDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(person);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deletePerson(@PathVariable Long id){
        personService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
