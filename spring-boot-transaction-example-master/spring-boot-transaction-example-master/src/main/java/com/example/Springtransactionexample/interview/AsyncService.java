package com.example.Springtransactionexample.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

@Service
public class AsyncService
{

	private int signalNo = 0;

	@Async // public Future<String> sendSignal() throws InterruptedException
	public void sendSignalWithoutWaiting() throws InterruptedException
	{

		System.out.println("Signal number " + signalNo++ + " thread :- " + Thread.currentThread().getName());
		Thread.sleep(10000);
		System.out.println("Ending thread" + Thread.currentThread().getName());
		;
		// return new AsyncResult<String>(String.valueOf(signalNo));
	}

	@Async
	public Future<String> sendSignalWaiting(int signalNo) throws InterruptedException
	{

		System.out.println("Signal number " + signalNo++ + " thread :- " + Thread.currentThread().getName());
		Thread.sleep(5000);
		System.out.println("Ending thread" + Thread.currentThread().getName());
		;
		return new AsyncResult<String>(String.valueOf(signalNo));
	}

	@Async
	public CompletableFuture<Map<String, Integer>> sendSignalWaitingCompletable(int signalNo)
			throws InterruptedException
	{

		System.out.println("Signal number " + signalNo + " thread :- " + Thread.currentThread().getName());

		if (signalNo == 3)
		{
			Thread.sleep(5000);
		} else
		{
			Thread.sleep(100);
		}

		System.out.println("Ending thread" + signalNo + " thread :- " + Thread.currentThread().getName());
		;
		Map<String, Integer> resultMap = new HashMap<>();
		resultMap.put("Completed Signal No:- ", signalNo);

		return CompletableFuture.completedFuture(resultMap);

		// return CompletableFuture.completedFuture(Map.of("Completed Signal No:- ",
		// signalNo));
	}

	@Async
	public Map<String, Integer> sendSignalWaitingOnlyResult(int signalNo) throws InterruptedException
	{

		System.out.println("Signal number " + signalNo + " thread :- " + Thread.currentThread().getName());

		if (signalNo == 3)
		{
			Thread.sleep(9000);
		} else
		{
			Thread.sleep(100);
		}

		System.out.println("Ending thread" + signalNo + " thread :- " + Thread.currentThread().getName());
		;
		Map<String, Integer> resultMap = new HashMap<>();
		resultMap.put("Completed Signal No:- ", signalNo);

		return resultMap;
	}
}
