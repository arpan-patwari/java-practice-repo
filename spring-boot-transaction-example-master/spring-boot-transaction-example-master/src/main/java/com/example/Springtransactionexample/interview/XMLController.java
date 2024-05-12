package com.example.Springtransactionexample.interview;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/xml")
public class XMLController
{


	@GetMapping("/read")
	public ResponseEntity<?> xmlProcessor(@RequestBody String input)
	{


		System.out.println("Sending response");
		return ResponseEntity.ok().body("done");
	}

}
