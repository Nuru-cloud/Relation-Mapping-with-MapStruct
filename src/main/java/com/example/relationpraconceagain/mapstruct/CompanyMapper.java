package com.example.relationpraconceagain.mapstruct;

import com.example.relationpraconceagain.dto.CompanyRequestDto;
import com.example.relationpraconceagain.dto.CompanyResponseDto;
import com.example.relationpraconceagain.model.Company;
import org.mapstruct.*;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR, unmappedTargetPolicy = ReportingPolicy.IGNORE, unmappedSourcePolicy =  ReportingPolicy.IGNORE)
public interface CompanyMapper {

    Company mapCompanyRequestDtoToCompany(CompanyRequestDto companyRequestDto);

    CompanyResponseDto mapCompanyEntityToCompanyResponseDto(Company company);
}
