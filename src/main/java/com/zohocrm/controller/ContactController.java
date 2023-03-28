package com.zohocrm.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zohocrm.entity.Contact;
import com.zohocrm.service.ContactService;

@Controller
public class ContactController {
	
	private ContactService contactService;
	
	
	public ContactController(ContactService contactService) {
		this.contactService = contactService;
	}


	//http://localhost:8080/zohocrmapp/listallContacts
	@RequestMapping("/listallContacts")
	public String listAllContacts(Model model) {
		List<Contact> contacts = contactService.getAllContacts();
		model.addAttribute("contacts", contacts);
		return "list_contacts";
	}
	

}
