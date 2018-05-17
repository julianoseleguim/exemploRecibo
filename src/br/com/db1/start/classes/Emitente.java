package br.com.db1.start.classes;

public class Emitente {

	private String nome;
	private String documento;
	private Byte confirmacao;
	
	public String getDocumentoFormatado(){
		String documentoFormatado = documento;
		
		if (documento.length() == 11){
			documentoFormatado = documentoFormatado.substring(0, 3) + "." + 
			documentoFormatado.substring(3, 6) + "." + 
			documentoFormatado.substring(6, 9) + "-" +
			documentoFormatado.substring(9, 11);
		}
		
		if (documento.length() == 8)
			documentoFormatado = documentoFormatado.substring(0, 1) + "." + 
					documentoFormatado.substring(1, 4) + "." + 
					documentoFormatado.substring(4, 7) + "-" +
					documentoFormatado.substring(7, 8);
		return documentoFormatado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public Byte getConfirmacao() {
		return confirmacao;
	}

	public void setConfirmacao(Byte confirmacao) {
		this.confirmacao = confirmacao;
	}
	
	
	
}
