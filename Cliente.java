public class Cliente extends Persona{
    
    static int contatore_cliente;
    
    String camera;
    
    Cliente(String nome, String cognome, String camera){
        super(nome, cognome);
        this.camera=camera;
        
        contatore_cliente++;
        System.out.println("cliente creato numero " + contatore_cliente);
        
         System.out.println("cliente creato " + this.nome + " " + this.cognome + " "+this.camera);
        
    }
    
     @Override
    void getInfo(){
         System.out.println(this.nome + " " + this.cognome + " " + this.camera);
    }
    
    @Override
    int getContatore(){
        return contatore_cliente;
    }
    
    String getCamera(){
        return this.camera;
    }
    
    void setCamera(String camera){
        this.camera=camera;
        System.out.println("cliente modificato " + this.nome + " " + this.cognome + " "+this.camera);
    }
}