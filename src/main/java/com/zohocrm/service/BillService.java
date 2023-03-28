package com.zohocrm.service;

import java.util.List;

import com.zohocrm.entity.Bill;

public interface BillService {

  public void saveOneBill(Bill bill);

public List<Bill> getAllBill();

}
