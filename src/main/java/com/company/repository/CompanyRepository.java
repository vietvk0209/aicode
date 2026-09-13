package com.company.repository;

import com.company.model.CompanyInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<CompanyInfo, Long> {
}
