
package exprofessorgen;

public class VetorGenerics <T> implements VetorInterface <T>{
            
        private T vetor [];
        private int qtdVetor; 
	
	public VetorGenerics(int tamanho) 
	{
           vetor = (T[]) new Object[tamanho];
           qtdVetor = 0; 
	}
    
    //Métodos privados
    private void garanteEspaco() {

        if(this.qtdVetor == vetor.length){
            T novoVetor [];
            novoVetor = (T[]) new Object [(vetor.length*2)];
            
            for(int i = 0; i<vetor.length;i++){
                novoVetor[i] = vetor[i];
            }
            this.vetor = novoVetor;
        } 
    }
    
    private boolean posicaoValida (int pos){
        boolean status = false;
        if(pos>this.qtdVetor || pos<0){
            throw new IllegalArgumentException("Posição inválida");          
        }else status = true;
        return status;
    }
    
     private boolean posicaoOcupada (int pos){
        boolean status = false;
        if(pos>=qtdVetor || pos<0){
            throw new IllegalArgumentException("Posição não ocupada");          
        }else status = true;
        return status;
    }
     
    private void deslocaDireita (int pos){
        for(int i = qtdVetor-1; i>=pos; i--){
            vetor[i+1] = vetor[i];
        }
    }
    
    private void deslocaEsquerda (int pos){
       for(int i = pos; i<this.qtdVetor-1;i++){
           vetor[i] = vetor[i+1];
       }   
    }
    
    //Métodos implementados  
    @Override
    public void addProfessor(T object) {
        garanteEspaco();
        vetor[qtdVetor] = object;
        this.qtdVetor++;
    }
    
    @Override
    public void addProfessor(int pos, T object){
        if(posicaoValida(pos)){
            this.garanteEspaco();
            deslocaDireita(pos);
            vetor[pos] = object;
            qtdVetor++;
        }
    }
 
    @Override
    public void removeProfessor(int pos){
        if(posicaoOcupada(pos)){
            deslocaEsquerda(pos);
            this.qtdVetor--;  
        }
    } 
    
    @Override
    public T busca (int pos){
        if(posicaoOcupada(pos)){
            return vetor[pos];
        }else return null;
    }

    @Override
    public int busca(T object) {
         int i = 0;
         int resultado = -1;
         for(i = 0; i<this.qtdVetor; i++){
             if(vetor[i].equals(object)){
                 resultado = i;
                 break;
             }                
         }        
         return resultado;
    }
    
    @Override
    public int tamanho() {
        return qtdVetor;
    }
    
}
