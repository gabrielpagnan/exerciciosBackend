public class Livro {
    // Atributos
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private String isbn;
    private boolean disponibilidade;

    // Construtor
    public Livro(String titulo, String autor, int anoPublicacao, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.isbn = isbn;
        this.disponibilidade = true; // começa disponível
    }

    // Método para emprestar
    public void emprestar() {
        if (disponibilidade) {
            disponibilidade = false;
            System.out.println("O livro \"" + titulo + "\" foi emprestado com sucesso!");
        } else {
            System.out.println("O livro \"" + titulo + "\" não está disponível para empréstimo.");
        }
    }

    // Método para devolver
    public void devolver() {
        if (!disponibilidade) {
            disponibilidade = true;
            System.out.println("O livro \"" + titulo + "\" foi devolvido com sucesso!");
        } else {
            System.out.println("O livro \"" + titulo + "\" já estava disponível.");
        }
    }

    // Método para exibir informações
    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anoPublicacao);
        System.out.println("ISBN: " + isbn);
        System.out.println("Disponibilidade: " + (disponibilidade ? "Disponível" : "Emprestado"));
    }
}
