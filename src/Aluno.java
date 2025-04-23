public class Aluno {
    private String nome;
    private Integer matricula;
    private Integer cpf; //validar cpf

    public void Aluno(){

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setMatricula(Integer matricula){
        this.matricula = matricula;
    }

    public Integer getMatricula(){
        return this.matricula;
    }

    public void setCpf(Integer cpf){
        this.cpf = cpf;
    }

    public Integer getCpf(){
        return this.cpf;
    }
}
