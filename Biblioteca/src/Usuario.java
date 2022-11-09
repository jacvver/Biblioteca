public class Usuario {
    private String nome;
    private String sexo;
    private String telefone;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getSexo() {
        return sexo;
    }


    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getTelefone() {
        return telefone;
    }
    
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }


    public void lerLivro() {
        System.out.println("USUÁRIO ESTÁ LENDO O LIVRO");
    }


    public Usuario() {

    }
    public Usuario(String nome, String sexo, String telefone, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.telefone = telefone;
        this.idade = idade;
    }
}
