public class BibliotecaMain {
    public static void main(String[] args) {
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954, "1234567890");

        // Mostra as infos
        livro1.exibirInformacoes();
        System.out.println();

        // Testa regras de empréstimo/devolução
        livro1.emprestar(); // empresta
        livro1.emprestar(); // tenta emprestar de novo (bloqueado)
        livro1.devolver();  // devolve
        livro1.devolver();  // tenta devolver de novo (bloqueado)
    }
}
