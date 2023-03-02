import java.util.ArrayList;
import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("programma per gestione di una struttura alberghiera");
        int i;
        
        ArrayList <Personale> arr_personale;
        ArrayList <Cliente> arr_cliente;
        ArrayList <Persona> arr_persona;
        
        do{
        
        System.out.println("premi 1 per inserire il personale, 2 per inserire un cliente, 3 per una persona generica");
       
        i= scanner.nextInt();
        
        arr_personale = new ArrayList<Personale>();
        arr_cliente = new ArrayList<Cliente>();
        arr_persona = new ArrayList<Persona>();
        
            {
            
                String nome;
                String cognome;
            
                switch (i){
                    case (1):
                    System.out.println("inserire nome cognome e mansione personale");
                    scanner.nextLine();
                    nome=scanner.nextLine();
                    cognome=scanner.nextLine();
                    String mansione=scanner.nextLine();
                    
                    Personale personale = new Personale(nome,cognome,mansione);
                    arr_personale.add(personale) ;
            
                    break;
                    
                    case (2):
                    System.out.println("inserire nome cognome e camera del cliente");
                    scanner.nextLine();
                    nome=scanner.nextLine();
                    cognome=scanner.nextLine();
                    String camera=scanner.nextLine();
                    
                    Cliente cliente = new Cliente(nome,cognome,camera);
                    arr_cliente.add(cliente) ;
            
                    break;
                    
                    case (3):
                    System.out.println("inserire nome cognome di una persona generica");
                    scanner.nextLine();
                    nome=scanner.nextLine();
                    cognome=scanner.nextLine();
                    
                    Persona persona = new Persona(nome,cognome);
                    arr_persona.add(persona) ;
            
                    break;
                    
                    case (4):
                        break;
                }
            
            }
        }
        while(i!=4);
        
        arr_persona.get(0).setNome("aaa");
        arr_personale.get(0).setMansione("bbb");
        arr_cliente.get(0).setCamera("ccc");
        
        ArrayList<Persona> array = new ArrayList<Persona>();
        array.add(arr_persona);
        array.add(arr_personale);
        array.add(arr_cliente);
        
        array.get(0).get(0).getInfo();
        
        /*for (int i;i<3;i++){
            
            for (int j;j<array[i].size() ;j++ ){
                array[i].get(j).getInfo;
            } 
            
        }*/
        
        
    }
}