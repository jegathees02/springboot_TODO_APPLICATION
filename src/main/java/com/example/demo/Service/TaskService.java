package com.example.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Task;
import com.example.demo.Repository.TaskRepository;

@Service
public class TaskService {
	@Autowired
	TaskRepository Repository;
	
	public String updateDetails(Task ts) {
		Repository.save(ts);
		return "Updated Successfully";
		
	}
	
	public String deleteDetails(int id) {
		Repository.deleteById(id);
		return "Done";
	}
	public Optional<Task> getfunction(int id) {
		return Repository.findById(id);
	}

}
