public class Aluno {
    private String nome;
    private Integer matricula;
    private Integer cpf; //validar cpf
    private String curso;

    public Aluno(String nome, Integer matricula, Integer cpf, String curso){
        this.nome =nome;
        this.matricula = matricula;
        this.cpf = cpf;
        this.curso = curso;
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

    public void setCurso(String curso){
        this.curso = curso;
    }
    public static void salvarAluno( Aluno aluno, String nomeArquivo){

        try {
            FileWriter writer = new FileWriter(nomeArquivo, true);
            writer.write(aluno.toCSV() + "\n");
            writer.close();

        }catch (IOException e){
            System.out.println("Erro ao salvar aluno" + e.getMessage());
        }
    }

}
