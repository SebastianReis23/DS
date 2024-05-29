package biblioteca;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner ler = new Scanner(System.in);

Livro harry = new Livro( "Harry Potter e a Ordem da Fênix","J.K. Rowling",800, 2003,"ROCCO");
harry.setTitulo("Harry Potter e a Ordem da Fênix");
harry.setAutor("J.K. Rowling");
harry.setAnoPublicacao(2003);
harry.setNumeroPaginas(766);

System.out.println("Quer mostrar a editora ?");
String exibirE =ler.next();


System.out.println(harry.getTitulo());
System.out.println(harry.getAutor());
System.out.println(harry.getAnoPublicacao());
System.out.println(harry.getNumeroPaginas());
System.out.println(exibirE);





Revista quem = new Revista();
quem.setTitulo("A morete da rinha elizabeth II");
quem.setAutor("lilia cabral");
quem.setAnoPublicacao(2007);
quem.setNumeroEdicao(46);

System.out.println("Quer mostrar o mês de publicação ?");
String exibirMP =ler.next();


System.out.println(quem.getTitulo());
System.out.println(quem.getAutor());
System.out.println(quem.getAnoPublicacao());
System.out.println(quem.getNumeroEdicao());
System.out.println(exibirMP);



}
}
