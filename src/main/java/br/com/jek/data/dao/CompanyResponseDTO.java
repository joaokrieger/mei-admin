package br.com.jek.data.dao;

import java.io.Serializable;

public class CompanyResponseDTO implements Serializable {

    private Long id;

    private String companyName;

    private String cnpj;

    private PersonDTO personDTO;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public PersonDTO getPerson() {
        return personDTO;
    }

    public void setPerson(PersonDTO personDTO) {
        this.personDTO = personDTO;
    }
}
