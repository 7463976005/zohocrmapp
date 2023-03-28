package com.zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entity.Bill;
import com.zohocrm.entity.Contact;
import com.zohocrm.service.BillService;
import com.zohocrm.service.ContactService;

@Controller
public class BillingController {
	
	@Autowired
	private BillService billService;
	
	@Autowired
	private ContactService contactService;
	
	@RequestMapping("/generateBill")
	public String viewBillingPage(@RequestParam("id") long id, Model model) {
		Contact contact=contactService.getContactById(id);
		model.addAttribute("contact", contact);
		return "generate_bill";
	}
	
	@PostMapping("/saveBill") 
	public String saveBill(@ModelAttribute("bill") Bill bill, Model model) {
		billService.saveOneBill(bill);
		List<Contact> contacts = contactService.getAllContacts();
		model.addAttribute("contacts", contacts);
		return "list_contacts";
	}
	
	@RequestMapping("/listallBill")
	public String listAllLeads(Model model) {
		List<Bill> bills = billService.getAllBill();
		model.addAttribute("bills", bills);
		return "list_bill";
	} 

}
