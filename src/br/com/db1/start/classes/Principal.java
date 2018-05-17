package br.com.db1.start.classes;

public class Principal {
	public static void main(String[] args) {
		exibirCepFormatado(80540150);
		exibirCepFormatado(87909990);
		exibirCepFormatado(89079660);
		
		//exibirDocumentoFormatado("10110622910");
		exibirDocumentoFormatado("95608965");
	}

	private static void exibirCepFormatado(Integer cepSemFormatacao) {
		Endereco endereco = new Endereco();
		endereco.setCep(cepSemFormatacao);
		System.out.println(endereco.getCepFormatado());
	}
	
	private static void exibirDocumentoFormatado(String documentoSemFormatacao) {
		Emitente emitente = new Emitente();
		emitente.setDocumento(documentoSemFormatacao);
		System.out.println(emitente.getDocumentoFormatado());
	}
}
