package com.example.Springtransactionexample.interview;

import org.apache.catalina.connector.Response;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/v1")
public class RestCOntroller
{

	@GetMapping("/rest/{test}?q=1")
	public Response getMessage(@RequestBody Object req, @RequestHeader HttpHeaders header, @PathVariable String test,
			@RequestParam Integer q)
	{

		return new Response();
	}

}
