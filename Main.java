/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
import java.io.*;
import java.time.LocalTime;//libreria que me deja usar el "localtime" para asi darle una fecha a los votos que seingresen


class Node{ //Clase nodo prar utilizarlo en la urna, como se pide

private Candidato candidato;
private Node next;

public Node(Candidato candidato) { 
this.candidato = candidato;
this.next = null;
}
public Candidato getCandidato(){ //getter de "Candidato"
return candidato;
}

public Node getNext(){ //getter del nodo que sigue
return next;
}

public void setSiguiente(Node next){
this.next = next;
}


}

class Voto{
       private int id;
       private int votanteId;
       private int candidatoId;
       private String TimeStamp;

       public Voto(int id,int votanteId,int candidatoId,String TimeStamp) {//constructor
       this.id = id;
       this.votanteId = votanteId;
       this.candidatoId = candidatoId;
       this.TimeStamp = TimeStamp;
       }
        //setters y getters
       public void Setid (int Newid) {
       id = Newid;
       }
       public void SetvotanteId (int NewvotanteId) {
       votanteId = NewvotanteId;
       }
       public void SetcandidatoId (int NewcandidatoId) {
       candidatoId = NewcandidatoId;
       }
       public void SetTimeStamp (String NewTimeStamp) {
       TimeStamp = NewTimeStamp;
       }

       public int Getid() {
       return id;
       }
       public int GetvotanteId() {
       return votanteId;
       }
       public int GetcandidatoId() {
       return candidatoId;
       }
       public String GetTimeStamp() {
       return TimeStamp;
       }
       
       public void Printvoto() {

       System.out.println("id : " +id);
       System.out.println("votanteId : " +votanteId);
       System.out.println("candidatoId : " +candidatoId);
       System.out.println("TimeStamp : " +TimeStamp);
       }};

class Candidato{
       private int Id;
       private String Nombre;
       private String Partido;
       private Queue<Voto> VotosRecibidos;
       
       Candidato(int Id,String Nombre,String Partido,Queue<Voto> VotosRecibidos) { //constructor
       this.Id = Id;
       this.Nombre = Nombre;
       this.Partido = Partido;
       this.VotosRecibidos = VotosRecibidos;
       }
        //setter y getters
       public void SetId (int NewId) {
       Id = NewId;
       }
       public void SetNombre (String NewNombre) {
       Nombre = NewNombre;
       }
       public void SetPartido (String NewPartido) {
       Partido = NewPartido;
       }
       public void SetVotosRecibidos (Queue<Voto> NewVotosRecibidos) {
       VotosRecibidos = NewVotosRecibidos;
       }

       public int GetId() {
       return Id;
       }
       public String GetNombre() {
       return Nombre;
       }
       public String GetPartido() {
       return Partido;
       }
       public Queue<Voto> GetVotosRecibidos() {
       return VotosRecibidos;
       }

        public void agregarVoto(Voto v){ //agrega unvoto
        VotosRecibidos.add(v);
       }

       public void Printcandidatos() {
       System.out.println("Id : " + Id);
       System.out.println("Nombre : " + Nombre);
       System.out.println("Partido : " + Partido);
       System.out.println("VotosRecibidos : " + VotosRecibidos);
       }};
       
class Votante{
       private int Id;
       private String Nombre;
       private boolean yaVoto;
       
       Votante(int Id,String Nombre,boolean yaVoto) {//constructor
       this.Id = Id;
       this.Nombre = Nombre;
       this.yaVoto = yaVoto;
       }
        //setters y getters
       public void SetId (int NewId) {
       Id = NewId;
       }
       public void SetNombre (String NewNombre) {
       Nombre = NewNombre;
       }
       public void SetyaVoto (boolean NewyaVoto) {
       yaVoto = NewyaVoto;
       }

       public int GetId() {
       return Id;
       }
       public String GetNombre() {
       return Nombre;
       }
       public boolean GetyaVoto() {
       return yaVoto;
       }
        
        public void marcarComoVotado() { //para marcar si alguien ya voto
        yaVoto = true;
        }

       public void PrintVotante() {
       System.out.println("Id : " + Id);
       System.out.println("Nombre : " + Nombre);
       System.out.println("yaVoto : " + yaVoto);
       }};
       
class UrnalElectoral{
    
    private Node listaCandidatos;
    private Stack<Voto> historialVotos;
    private Queue<Voto>  votosReportados;
    private int idCounter;
    
    public UrnalElectoral() {//constructor
    historialVotos = new Stack<>();
    votosReportados = new LinkedList<>(); 
    idCounter = 0;
    listaCandidatos = null; 
}

    
    public boolean verificarVotante(Votante votante){
        if(votante.GetyaVoto() == false){
        return false;   
        }
        else{
        return true;
        }
        
    }
    public void registrarVoto(Votante votante,int id){
	    if(verificarVotante(votante) == true){
            return false;
        }
        
        
        
        
        
    }
    public void reportarVoto(Candidato candidato, int a){}//recordatorio : boolean
    public void obtenerResultado(){}//recordatorio : string
}
       

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}
