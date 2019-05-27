package br.com.michelmilezzi.DemoApp.service.impl;

import org.springframework.stereotype.Service;

import br.com.michelmilezzi.DemoApp.service.FibonacciService;
@Service
public class FibonacciServiceImpl implements FibonacciService{

	@Override
	public Long calcularFibonacci(int i) {
		if(i <= 1) {
			return Long.valueOf(i);
		}
		return calcularFibonacci(i - 1) + calcularFibonacci(i - 2);
	}

}
