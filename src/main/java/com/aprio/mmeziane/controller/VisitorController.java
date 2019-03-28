package com.aprio.mmeziane.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aprio.mmeziane.model.Visitor;
import com.aprio.mmeziane.repository.VisitorRepository;

@RestController
public class VisitorController {
	
	@Autowired
	VisitorRepository visitorRepository;
	
	@GetMapping("/")
	public String index() {
		return "Welcome Visitor";
	}
	
	@GetMapping("/visitors")
	private List<Visitor> getAllVisitors(){
		return visitorRepository.findAll();
	}
	
	@GetMapping("visitors/{id}")
	private Visitor getVisitor(@PathVariable("id") int id) {
		return visitorRepository.findById(id).get();
	}
	
	
//	  @GetMapping("visitors/{firstname}") 
//	  private Visitor getVisitorByFirstName(@PathVariable("firstname") String firstname) {
//		  return  visitorRepository.findByName(firstname).get();
//	  }
	 
	
	@DeleteMapping("visitors/{id}")
	private void deleteVisitor(@PathVariable("id") int id) {
		visitorRepository.deleteById(id);
	}
	
	@PostMapping("/visitors")
	private int saveVisitor(@RequestBody Visitor visitor) {
		visitorRepository.save(visitor);
		return visitor.getId();
	}

}
