package com.example.relationpraconceagain.controller;

import com.example.relationpraconceagain.dto.EmployeeRequestDto;
import com.example.relationpraconceagain.dto.EmployeeResponseDto;
import com.example.relationpraconceagain.mapstruct.EmployeeMapper;
import com.example.relationpraconceagain.model.Employee;

import com.example.relationpraconceagain.service.EmployeeService;
import com.example.relationpraconceagain.service.impl.EmployeeServiceImpl;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class EmployeeController{

    private final EmployeeService employeeService;
    private final EmployeeMapper employeeMapper;

    @PostMapping("/employee/add")
    public ResponseEntity<EmployeeResponseDto> saveEmployee(@RequestBody EmployeeRequestDto employeeRequestDto){
        Employee employee = employeeMapper.mapEmployeeRequestDtoEmployee(employeeRequestDto);
        EmployeeResponseDto employeeResponseDto = employeeMapper.mapEmployeeEntitytoEmployeeRequestDto(employeeService.saveEmployee(employee));

        return new ResponseEntity<>(employeeResponseDto, HttpStatus.CREATED);
    }
}
