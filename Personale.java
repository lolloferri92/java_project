public class Personale extends Persona{
    
    static int contatore_personale;
    
    String mansione;
    
    Personale(String nome, String cognome, String mansione){
        super(nome, cognome);
        this.mansione=mansione;
        
        contatore_personale++;
        System.out.println("personale creato numero " + contatore_personale);
        
         System.out.println("persona creata " + this.nome + " " + this.cognome + " "+this.mansione);
        
    }
    
    @Override
    void getInfo(){
         System.out.println(this.nome + " " + this.cognome + " " + this.mansione);
    }
    
    @Override
    int getContatore(){
        return contatore_personale;
    }
    
    String getMansione(){
        return this.mansione;
        
    }
    
    void setMansione(String mansione){
        this.mansione=mansione;
        System.out.println("personale modificata " + this.nome + " " + this.cognome + " "+this.mansione);
    }
}