package exprofessorgen;

public class Teste {

    public static void main(String[] args) {
        
        //Objetos
        VetorGenerics <Professor> func = new VetorGenerics <> (3);
        
        Professor professor0 = new Professor ("Patrícia Palladino", "Doutorado", "123456", 7500.00);
        Professor professor1 = new Professor ("José Otávio", "Doutorado", "12345", 8000.00);
        Professor professor2 = new Professor ("Érico Veríssimo", "Mestrado", "123", 9000.00);
        Professor professor3 = new Professor ("Carlos Maçaranduba", "Mestrado", "223", 9000.00);
        Professor professor4 = new Professor ("Wilson Montanha", "Mestrado", "323", 9000.00);
        Professor professor5 = new Professor ("Luk Cho Man", "Doutorado", "423456", 7500.00);
        Professor professor6 = new Professor ("Ángel Romero", "Doutorado", "52345", 8000.00);
        Professor professor7 = new Professor ("Paulo Skaf", "Mestrado", "623", 9000.00);
        Professor professor8 = new Professor ("William Bonner", "Mestrado", "723", 9000.00);
        Professor professor9 = new Professor ("Serginho Groisman", "Mestrado", "823", 9000.00);
        
        //Adição 
        System.out.println("Antes de adicionar os 10 professores: "+func.tamanho());

        func.addProfessor(professor0);
        func.addProfessor(professor1);
        func.addProfessor(2, professor2);
        func.addProfessor(3, professor3);
        func.addProfessor(professor4);
        func.addProfessor(professor5);
        func.addProfessor(6, professor6);
        func.addProfessor(7, professor7);
        func.addProfessor(professor8);
        func.addProfessor(professor9);
        System.out.println("...");
        
        System.out.println("Depois de adicionar os 10 professores: "+func.tamanho());
        System.out.println("");
        
        //Remoção
        System.out.println("Antes de remover os 10 primeiros professores: " +func.tamanho());
        
        for(int i = 0; i<10; i++){
            func.removeProfessor(0);
        }
        System.out.println("...");
       
        System.out.println("Depois de remover os  5 primeiros professores: " + func.tamanho());
        System.out.println("");

        //Busca por Indice
        Professor busca = null;

        System.out.println("Retorna as informações de todos os professores do array logo abaixo:");
        System.out.println("");
        
        for(int i = 0; i<func.tamanho();i++){
            busca = func.busca(i);
            System.out.println("Indice "+i+": "+busca.toString());
        }
        System.out.println("");
        
        //Busca por Professor
        System.out.println("Retorna o indice dos professores professor5 e professor9 logo abaixo:");
        System.out.println("");
        
        System.out.println("Indice do professor5: "+func.busca(professor5));
        System.out.println("Indice do professor9: "+func.busca(professor9));
        
    }
    
}
