package br.com.michelmilezzi.DemoApp.service;

import static org.junit.Assert.assertThat;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.michelmilezzi.DemoApp.domain.Comissao;
import br.com.michelmilezzi.DemoApp.domain.Invoice;
import br.com.michelmilezzi.DemoApp.domain.Product;
import br.com.michelmilezzi.DemoApp.domain.Vendedor;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ComissaoTests {
	
	
	@Test
	public void testeComissao() {
		assertThat(Comissao comissao = new Comissao(new Vendedor("Nasser", 1500.00), 3000.0)).isEqualTo(8L);
		comissao.calculaComissao();
	}

}
