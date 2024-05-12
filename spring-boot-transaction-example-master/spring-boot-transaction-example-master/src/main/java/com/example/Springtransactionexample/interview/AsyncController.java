package com.example.Springtransactionexample.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/async")
public class AsyncController
{
	@Autowired
	AsyncService service;

	private List<Future<String>> signalLists = new ArrayList<Future<String>>();
	// private List<CompletableFuture<Map<String, Integer>>> signalCompletableLists
	// = new ArrayList<CompletableFuture<Map<String, Integer>>>();
	private List<Map<String, Integer>> signalCompletableLists = new ArrayList<Map<String, Integer>>();

	@GetMapping("/no-wait/{signals}")
	public ResponseEntity<?> asyncControllerWihoutWait(@PathVariable int signals) throws InterruptedException
	{
		int signal = 0;

		while (signal != signals)
		{
			service.sendSignalWithoutWaiting();
			signal++;
		}
		System.out.println("Sending response");
		return ResponseEntity.ok().body("done");
	}


	@GetMapping("/wait/{signals}")
	public ResponseEntity<?> asyncControllerAccumulatin(@PathVariable int signals)
			throws InterruptedException, ExecutionException
	{
		int signal=0;

		List<String> doneSignals = new ArrayList<>();

		while (signal != signals)
		{
			signalLists.add(service.sendSignalWaiting(signal));

			signal++;
		}
		

		/*
		 * for (Future<String> sig : signalLists) { doneSignals.add(sig.get()); }
		 */
		System.out.println("Sending response  for accumulating");
		return ResponseEntity.ok().body("done accumulating");
	}

	@GetMapping("/completable/{signals}")
	public ResponseEntity<?> asyncControllerAccumulatingCompletable(@PathVariable int signals)
			throws InterruptedException, ExecutionException
	{
		Integer signal = 0;

		while (signal != signals)
		{
			CompletableFuture<Map<String, Integer>> future = service.sendSignalWaitingCompletable(signal);
			if (!future.isDone())
			{
				Thread.sleep(1000);
				Map<String, Integer> resultMap = new HashMap<>();
				resultMap.put("Time out Signal No:- ", signal);

				future.complete(resultMap);
			}
			signalCompletableLists.add(future.get());
			signal++;
		}

		System.out.println("Sending response  for accumulating");
		return ResponseEntity.ok().body(signalCompletableLists);
		
		/*
		 * signalCompletableLists.forEach(x -> { try { System.out.println(x); } catch
		 * (InterruptedException | ExecutionException e) { // TODO Auto-generated catch
		 * block e.printStackTrace(); } } );
		 * 
		 * 
		 * return ResponseEntity.ok().body(signalCompletableLists.stream().map(x -> {
		 * try { return x.get(); } catch (InterruptedException | ExecutionException e) {
		 * // TODO Auto-generated catch block e.printStackTrace(); } return null;
		 * }).collect(Collectors.toList())
		 * 
		 * );
		 */
		 
	}

	@GetMapping("/completable1/{signals}")
	public ResponseEntity<?> asyncControllerOnlyResults(@PathVariable int signals)
	{
		Integer signal = 0;

		while (signal != signals)
		{
			CompletableFuture<Map<String, Integer>> future = new CompletableFuture<Map<String, Integer>>();
			

			
			
		}
		return null;
	}


	@GetMapping
	public ResponseEntity<?> getStatus() throws InterruptedException, ExecutionException
	{
		List<String> doneSignals = new ArrayList<>();

		if (signalLists == null)
			return ResponseEntity.ok().body("no data found");

		for (Future<String> sig : signalLists)
		{
			doneSignals.add(sig.get());
		}
		System.out.println("Sending response  for accumulating");
		return ResponseEntity.ok().body(doneSignals);
	}

}
