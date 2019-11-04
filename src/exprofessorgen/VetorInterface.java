
package exprofessorgen;

public interface VetorInterface <T> {
    
    public void addProfessor(T object);
    
    public void addProfessor (int pos, T object);
    
    public void removeProfessor(int pos);
       
    public T busca (int pos);
    
    public int busca (T object);
            
    public int tamanho(); 
}
