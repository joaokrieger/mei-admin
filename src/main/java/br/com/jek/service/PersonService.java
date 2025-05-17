package br.com.jek.service;

import br.com.jek.data.dao.PersonDTO;
import br.com.jek.exception.ResourceNotFoundException;
import br.com.jek.mapper.PersonMapper;
import br.com.jek.model.Person;
import br.com.jek.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private final PersonRepository personRepository;
    private final PersonMapper personMapper;

    public PersonService(PersonRepository personRepository, PersonMapper personMapper) {
        this.personRepository = personRepository;
        this.personMapper = personMapper;
    }

    public List<PersonDTO> findAll() {
        return personMapper.toDTOs(personRepository.findAll());
    }

    public PersonDTO findById(Long id) {
        var entity = personRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));
        return personMapper.toDTO(entity);
    }

    public PersonDTO create(PersonDTO personDTO) {
        Person entity = personMapper.toEntity(personDTO);
        return personMapper.toDTO(personRepository.save(entity));
    }

    public PersonDTO update(PersonDTO personDTO) {
        Person entity = personRepository.findById(personDTO.getId())
                .orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));
        return personMapper.toDTO(personRepository.save(entity));
    }

    public void delete(Long id) {
        Person entity = personRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));
        personRepository.delete(entity);
    }
}
