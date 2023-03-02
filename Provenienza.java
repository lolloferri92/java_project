interface Provenienza{
    
    String citta;
    String regione;
    String nazione;
    
    public void getLocationInfo(){
        System.out.println("provenienza " + this.citta + " " + this.regione + " "+this.nazione);
    }
    
    
}