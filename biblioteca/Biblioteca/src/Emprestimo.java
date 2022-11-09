public class Emprestimo {
    private String dataEmprestimo;
    private String horaEmprestimo;
    private Usuario usuario;
    private Livro livro;

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }
    public String getDataEmprestimo() {
        return dataEmprestimo;
    }


    public void setHoraEmprestimo(String horaEmprestimo) {
        this.horaEmprestimo = horaEmprestimo;
    }
    public String getHoraEmprestimo() {
        return horaEmprestimo;
    }


    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public Usuario getUsuario() {
        return usuario;
    }


    public void setLivro(Livro livro) {
        this.livro = livro;
    }
    public Livro getLivro() {
        return livro;
    }

    
    public void devolverLivro() {
        livro.setEmprestimo(true);
        System.out.println("LIVRO DEVOLVIDO");
    }

    public Emprestimo() {

    }
    public Emprestimo(String dataEmprestimo, String horaEmprestimo, Usuario nomeUsuario, Livro tituloLivro){
        this.dataEmprestimo = dataEmprestimo;
        this.horaEmprestimo = horaEmprestimo;
        this.usuario = nomeUsuario;
        this.livro = tituloLivro;
    }
}
