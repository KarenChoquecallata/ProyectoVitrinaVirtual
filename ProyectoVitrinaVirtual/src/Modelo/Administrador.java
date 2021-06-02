package Modelo;

public class Administrador {
    private String nameuser;
    private String psswrd;
    public Administrador(String nameuser, String psswrd){
     this.nameuser=nameuser;
     this.psswrd=psswrd;
    }
    public String getNombre(){
    return nameuser;
    }
    public String getContraseña(){
    return psswrd;
    }
}