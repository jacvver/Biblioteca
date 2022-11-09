public class Main {
    public static void main(String[] args) {

        Usuario usuario = new Usuario("Jhuliano", "Masculino", "(31)99726-2599", 20);
        Livro livro = new Livro("As Cronicas de Gelo e Fogo", "George R.R. Martin", "Fantasia", "Leya", "A Guerra dos Tronos", 2010, 250, false);
        Emprestimo emprestimo = new Emprestimo("5/11/2022", "14:26", usuario, livro);

        System.out.println(
                        "-----USUÁRIO-----"
                        + "\nNome: " + usuario.getNome()
                        + "\nSexo: " + usuario.getSexo()
                        + "\nTelefone: " + usuario.getTelefone()
                        + "\nIdade: " + usuario.getIdade()
                        + "\n"

        );
        System.out.println(
                        "-----LIVRO-----"
                        + "\nTítulo: " + livro.getTitulo()
                        + "\nAutor(es): " + livro.getAutores()
                        + "\nArea: " + livro.getArea()
                        + "\nEditora: " + livro.getEditora()
                        + "\nEdição: " + livro.getEdicao()
                        + "\nAno: " + livro.getAno()
                        + "\nNúmero de Folhas: " + livro.getNumFolhas()
                        + "\n"
        );

        System.out.println(
                        "-----EMPRESTIMO-----"
                        + "\nUsuario: " + emprestimo.getUsuario().getNome()
                        + "\nLivro: " + emprestimo.getLivro().getTitulo() + " - " + emprestimo.getLivro().getEdicao()
                        + "\nData do Emprestimo: " + emprestimo.getDataEmprestimo()
                        + "\nHora do Emprestimo: " + emprestimo.getHoraEmprestimo()
        );
        livro.abrirLivro();
        usuario.lerLivro();
        livro.fecharLivro();
        emprestimo.devolverLivro();
    }
}
