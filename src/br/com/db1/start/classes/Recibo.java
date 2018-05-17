package br.com.db1.start.classes;

import java.util.Date;
import java.util.List;

public class Recibo {
	
	private Integer numero;
	private Double valor;
	private Date dataCadastro;	
	private Date dataEmissao;
	private Boolean confirmacao;
	
	private List<Servico> servico;
	private Emitente emitente;
	private Pagador pagador;
	private Cidade cidade;
	
	
	public String getValorDescritivo(){
		return "";
	}
	public String getDataEmissaoDescritiva(){
		return "";
	}
	
}
