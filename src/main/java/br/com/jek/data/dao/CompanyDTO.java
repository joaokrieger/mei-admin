package br.com.jek.data.dao;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;

public class CompanyDTO implements Serializable {

    private Long id;

    @NotBlank(message = "The company name cannot be blank")
    private String companyName;

    @NotBlank(message = "The company CNPJ cannot be blank")
    private String cnpj;

    @NotNull(message = "The person ID cannot be null")
    private Long personId;

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

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }
}
