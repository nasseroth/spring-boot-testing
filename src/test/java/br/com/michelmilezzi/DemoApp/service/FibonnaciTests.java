package br.com.michelmilezzi.DemoApp.service;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FibonnaciTests {
	
	@Autowired
	private FibonacciService fibonacciService;
	
	@Test
	public void meuPrimeiroTesteDoFibonacci6() {
		assertThat(fibonacciService.calcularFibonacci(6)).isEqualTo(8L);
	}
	
	@Test
	public void meuPrimeiroTesteDoFibonacci8() {
		assertThat(fibonacciService.calcularFibonacci(8)).isEqualTo(21L);
	}
}
