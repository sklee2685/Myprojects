package com.example.demo_mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private CompanyMapper companyMapper;

    @PostMapping("")
    public Company post(@RequestBody Company company) {
        companyMapper.insert(company);
        return company;
    }

    @GetMapping("")
    public List<Company> getAll() {
        return companyMapper.getAll();
    }

    @GetMapping("/{id}")
    public Company getById(@PathVariable("id") int id) {
        return companyMapper.getById(id);
    }
}
