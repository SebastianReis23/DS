
package biblioteca;
public class Livro extends Publicaçao{
	private int numeroPaginas;
	private String editora;
	
     public Livro() {
	 
     }
	  public Livro(String titulo, String autor, int anoPublicacao, int numeroPaginas, String editora) {
		    super.getTitulo();
	        super.getAutor();
	        super.getAnoPublicacao();
		    this.numeroPaginas = numeroPaginas;
	        this.editora = editora;
	       
	        
	    }

		
		
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public String getEditora() {
		return editora;
	}

	@Override
        public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println(numeroPaginas);
        System.out.println(editora);
    }

	
	public  exibirDetalhes(String exibirE) {
       super.exibirDetalhes ();
        if (exibirE == "sim") {
            System.out.println(editora);
        }else{
            System.out.println("Ok");
        }
    }
}

