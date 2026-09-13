package com.company.controller;

import com.company.model.CompanyInfo;
import com.company.service.CompanyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/company")
@CrossOrigin(origins = "http://localhost:4200")
public class CompanyController {

    private final CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping
    public ResponseEntity<CompanyInfo> getCompanyInfo() {
        CompanyInfo info = companyService.getCompanyInfo();
        return ResponseEntity.ok(info);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CompanyInfo> updateCompanyInfo(
            @PathVariable Long id, 
            @RequestBody CompanyInfo companyInfo) {
        CompanyInfo updated = companyService.updateCompanyInfo(id, companyInfo);
        return ResponseEntity.ok(updated);
    }
}
