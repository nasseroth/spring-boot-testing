package br.com.michelmilezzi.DemoApp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Comissao {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private Vendedor vendedor;
    
    private Double totalDeVendas;

	public Comissao(Vendedor vendedor, Double totalDeVendas) {
		super();
		this.vendedor = vendedor;
		this.totalDeVendas = totalDeVendas;
	}
    // retorna comissao
	public Double calculaComissao() {
		if(this.totalDeVendas < 5000.0) {
			return 0.0;
		} else if (this.totalDeVendas < 30000.00) {
			return (vendedor.getSalario() * this.getPercentual(this.totalDeVendas)) + vendedor.getSalario();
		}
		return (vendedor.getSalario() * this.getPercentual(this.totalDeVendas)) + vendedor.getSalario() + 1000.00;
	}
	
	public Double getPercentual(Double valorTotalDeVendas) {
		if(valorTotalDeVendas >= 5000.00 || valorTotalDeVendas <= 10000.00) {
			return 0.02;
		} else if (valorTotalDeVendas > 10000.00 || valorTotalDeVendas <= 20000.00) {
			return 0.025;
		} else if (valorTotalDeVendas > 20000.00 || valorTotalDeVendas <= 30000.00) {
			return 0.03;
		} else if (valorTotalDeVendas > 30000.00) {
			return 0.05;
		}
		return 0.0;
	}
    /*
     * 
    public BigDecimal addItem(final Product product, final Long quantity, final BigDecimal unitPrice) {
        this.items.add(new InvoiceItem(this, product, quantity, unitPrice));
        this.total = items.stream()
                .map(InvoiceItem::getTotal)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        return getTotal();
    }
     * 
     * */
}
