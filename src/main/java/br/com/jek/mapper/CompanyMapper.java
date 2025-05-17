package br.com.jek.mapper;

import br.com.jek.data.dao.CompanyResponseDTO;
import br.com.jek.model.Company;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = { PersonMapper.class })
public interface CompanyMapper {

    @Mapping(source = "person", target = "person")
    CompanyResponseDTO toDTO(Company company);

    @Mapping(source = "person", target = "person")
    Company toEntity(CompanyResponseDTO dto);

    List<CompanyResponseDTO> toDTOs(List<Company> companies);

    List<Company> toEntities(List<CompanyResponseDTO> dtos);
}
