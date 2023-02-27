package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Task;
import com.example.demo.repository.TaskRepository;
import com.example.demo.service.TaskService;

@RestController
public class TaskController {
	@Autowired
	TaskRepository Repository;
	@Autowired
	TaskService service;
	
	@GetMapping("/get")
	List<Task> getList() {
		return Repository.findAll();
	}
	
	@GetMapping("/getid/{id}")
		public Optional<Task> getbyid(@PathVariable int id) {
			return service.getfunction(id);
		}
	
	@PostMapping("/post")
	public Task create(@RequestBody Task tsk) {
		return Repository.save(tsk)
;	}
	
	@PutMapping("/put")
	public String update(@RequestBody Task tsk) {
		return service.updateDetails(tsk);
	}
	
	@DeleteMapping("/delete")
	public String delete(@RequestParam int id) {
		return service.deleteDetails(id);
	} 

}
