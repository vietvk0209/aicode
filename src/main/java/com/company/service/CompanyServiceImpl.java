package com.company.service;

import com.company.model.CompanyInfo;
import com.company.repository.CompanyRepository;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService {

    private final CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public CompanyInfo getCompanyInfo() {
        return companyRepository.findAll()
                .stream()
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Chưa có thông tin công ty"));
    }

    @Override
    public CompanyInfo updateCompanyInfo(Long id, CompanyInfo updatedInfo) {
        CompanyInfo existingInfo = companyRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Không tìm thấy thông tin công ty với ID: " + id));

        existingInfo.setName(updatedInfo.getName());
        existingInfo.setTagline(updatedInfo.getTagline());
        existingInfo.setDescription(updatedInfo.getDescription());
        existingInfo.setAddress(updatedInfo.getAddress());
        existingInfo.setEmail(updatedInfo.getEmail());
        existingInfo.setPhone(updatedInfo.getPhone());

        return companyRepository.save(existingInfo);
    }
}
