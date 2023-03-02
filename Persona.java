public class Persona implements Provenienza{
    
    String nome;
    String cognome;
    
    static int contatore_persona;
    
    
    
    Persona(String nome, String cognome){
        this.nome=nome;
        this.cognome=cognome;
        
        contatore_persona++;
        System.out.println("persona creata numero " + contatore_persona);
        
        System.out.println("persona creata " + this.nome +" " + this.cognome);
        
    }
    
    void getInfo(){
         System.out.println(this.nome + " " + this.cognome);
    }
    
    int getContatore(){
        return contatore_persona;
    }
    
    
    //getter e setter
    
    String getNome(){
        return this.nome;
    }
    
    void setNome(String nome){
        this.nome=nome;
        System.out.println("persona modificata " + this.nome +" " + this.cognome);
    }
    
    String getCognome(){
        return this.cognome;
    }
    
    void setCognome(String cognome){
        this.cognome=cognome;
        System.out.println("persona modificata " + this.nome +" " + this.cognome);
    }
}