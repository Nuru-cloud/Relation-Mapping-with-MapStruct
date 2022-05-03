package com.example.relationpraconceagain.service.impl;

import com.example.relationpraconceagain.model.Company;
import com.example.relationpraconceagain.repo.CompanyRepository;
import com.example.relationpraconceagain.service.CompanyService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CompanyServiceImpl implements CompanyService {

    private final CompanyRepository companyRepository;

    @Override
    public Company saveCompany(Company company) {
        return companyRepository.save(company);
    }

    @Override
    public Company updateCompany(Company company) {
        return companyRepository.save(company);
    }
}
