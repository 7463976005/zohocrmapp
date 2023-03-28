package com.zohocrm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm.entity.Bill;

public interface BillRepository extends JpaRepository<Bill, Long> {

}
