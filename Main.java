/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Candidato{
       private int Id;
       private String Nombre;
       private String Partido;
       private Queue<Voto> VotosRecibidos;

       Candidato(int Id,String Nombre,String Partido,Queue<Voto> VotosRecibidos) {
       this.Id = Id;
       this.Nombre = Nombre;
       this.Partido = Partido;
       this.VotosRecibidos = VotosRecibidos;
       }

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

       public void PrintWeas() {
       System.out.println("Id : " + Id);
       System.out.println("Nombre : " + Nombre);
       System.out.println("Partido : " + Partido);
       System.out.println("VotosRecibidos : " + VotosRecibidos);
       }};
       
class Voto{
       private int id;
       private int votanteId;
       private int candidatoId;
       private String TimeStamp;


       public Voto(int id,int votanteId,int candidatoId,String TimeStamp) {
       this. id = id;
       this. votanteId = votanteId;
       this. candidatoId = candidatoId;
       this. TimeStamp = TimeStamp;
       }

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

       public void PrintWeas() {

       System.out.println("id : " +id);
       System.out.println("votanteId : " +votanteId);
       System.out.println("candidatoId : " +candidatoId);
       System.out.println("TimeStamp : " +TimeStamp);
       }};

class Votante{
       private int Id;
       private String Nombre;
       private boolean yaVoto;
       
       Votante(int Id,String Nombre,boolean yaVoto) {
       this.Id = Id;
       this.Nombre = Nombre;
       this.yaVoto = yaVoto;
       }

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

       public void PrintWeas() {
       System.out.println("Id : " + Id);
       System.out.println("Nombre : " + Nombre);
       System.out.println("yaVoto : " + yaVoto);
       }};


public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}
