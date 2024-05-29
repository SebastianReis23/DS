
package biblioteca;
public class Revista extends Publicaçao{
     private String mesPublicacao;
     private int numeroEdicao;
     
     public Revista() {
    	 
     }


     public  Revista(String titulo, String autor, int anoPublicacao, int numeroEdicao, String mesPublicacao) {
    	    super.getTitulo();
	        super.getAutor();
	        super.getAnoPublicacao();
        this.numeroEdicao = numeroEdicao;
        this.mesPublicacao = mesPublicacao;
    }
    
	public String getMesPublicacao() {
		return mesPublicacao;
	}
	public void setMesPublicacao(String mesPublicacao) {
		this.mesPublicacao = mesPublicacao;
	}
	public int getNumeroEdicao() {
		return numeroEdicao;
	}
	public void setNumeroEdicao(int numeroEdicao) {
		this.numeroEdicao = numeroEdicao;
	}
     
     @override
     public void exibirDetalhes() {
        super.exibirDetalhes(); // Chama o método exibirDetalhes() da classe base
        System.out.println("Número da Edição: " + numeroEdicao);
        System.out.println("Mês de Publicação: " + mesPublicacao);
    }
     
     public  exibirDetalhes(String exibirMP) {
        super.exibirDetalhes(); 
   
       if (exibirMP == "sim" ) {
           System.out.println(mesPublicacao);
       } else {
           System.out.println("ok");
       }
}

}





