package biblioteca;
public class Publicaçao {
	public String titulo;
	public String autor;
	public int anoPublicacao;
	
	public Publicaçao() {
		
	}

        public  void Publicacao(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }	
	

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	
	
	public void exibirDetalhes() {
        System.out.println(titulo);
        System.out.println(autor);
        System.out.println(anoPublicacao);
    }

}



