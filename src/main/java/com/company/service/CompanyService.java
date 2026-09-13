package com.company.service;

import com.company.model.CompanyInfo;

public interface CompanyService {
    CompanyInfo getCompanyInfo();
    CompanyInfo updateCompanyInfo(Long id, CompanyInfo companyInfo);
}
