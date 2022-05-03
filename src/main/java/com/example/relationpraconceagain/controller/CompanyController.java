package com.example.relationpraconceagain.controller;

import com.example.relationpraconceagain.dto.CompanyRequestDto;
import com.example.relationpraconceagain.dto.CompanyResponseDto;
import com.example.relationpraconceagain.mapstruct.CompanyMapper;
import com.example.relationpraconceagain.model.Company;
import com.example.relationpraconceagain.repo.CompanyRepository;
import com.example.relationpraconceagain.service.impl.CompanyServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/company")
public class CompanyController {
    private final CompanyServiceImpl companyServiceImpl;
    private final CompanyMapper companyMapper;
    private final CompanyRepository companyRepository;

    @PostMapping("/add")
    public ResponseEntity<CompanyResponseDto> saveCompany(@RequestBody CompanyRequestDto companyRequestDto) {
        Company company = companyServiceImpl.saveCompany(companyMapper.mapCompanyRequestDtoToCompany(companyRequestDto));
        CompanyResponseDto companyResponseDto = companyMapper.mapCompanyEntityToCompanyResponseDto(company);

        return new ResponseEntity<>(companyResponseDto, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<CompanyResponseDto> updateCompany(@RequestBody CompanyRequestDto companyRequestDto){
        Company company = companyServiceImpl.updateCompany(companyMapper.mapCompanyRequestDtoToCompany(companyRequestDto));
        CompanyResponseDto companyResponseDto = companyMapper.mapCompanyEntityToCompanyResponseDto(company);

        return new ResponseEntity<>(companyResponseDto, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteCompany(@RequestParam(value = "id") final Integer id){
        companyRepository.deleteById(id);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
}
