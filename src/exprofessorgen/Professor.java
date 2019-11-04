
package exprofessorgen;

public class Professor {
        private String nome;
	private String formacao;
	private String registro;
	private double salario;
	
	public Professor(String nome, String formacao, String registro, double salario) 
	{
		this.nome = nome;
		this.formacao = formacao;
		this.registro = registro;
		this.salario = salario;
	}

        @Override
        public String toString(){
            String texto = this.nome+", " +this.formacao+", "+this.registro+", "+this.salario;
            return texto;
        }
        
        @Override
        public boolean equals(Object professor){
            if (this.registro == ((Professor) professor).registro){
                return true;
            } return false;
        }
}
