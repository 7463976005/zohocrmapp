package com.zohocrm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entity.Bill;
import com.zohocrm.repository.BillRepository;

@Service
public class BillServiceImpl implements BillService {
	
	@Autowired
	private BillRepository billRepo;

	@Override
	public void saveOneBill(Bill bill) {

		billRepo.save(bill);
		
	}

	@Override
	public List<Bill> getAllBill() {
		List<Bill> bills = billRepo.findAll();
		return bills;
	}

}
