package br.com.jek.mapper;

import br.com.jek.data.dao.PersonDTO;
import br.com.jek.model.Person;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    PersonDTO toDTO(Person person);
    Person toEntity(PersonDTO personDTO);

    List<PersonDTO> toDTOs(List<Person> persons);
    List<Person> toEntities(List<PersonDTO> personDTOs);
}