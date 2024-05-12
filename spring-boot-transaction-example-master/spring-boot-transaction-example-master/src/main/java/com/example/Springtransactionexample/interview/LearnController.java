package com.example.Springtransactionexample.interview;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/learn")
@Controller
public class LearnController
{

	@GetMapping("/without-controller")
	public ResponseEntity<?> asyncControllerAccumulatin()
	{
		return ResponseEntity.ok().body(new Employee(20000, "arpan"));
	}
}
