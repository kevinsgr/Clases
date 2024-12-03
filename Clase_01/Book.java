package Clase_01;

public class Book {
    
    String title;      //Los atributos son las caracteristicas
    String author;   
    int year;
    String gender;
    boolean isbusy; //esta ocupado

    public Book(){
        title = "Sin titulo";
        author = "N/A";
        year = 0;
        gender = "";
        isbusy = false;         
    }

    public Book(String title, String author, int year, String gender, boolean isbusy){  //parametros
        this.title = title; //this es para asignar el atributo al parametro
        this.author = author;
        this.year = year;
        this.gender = gender;                   
        this.isbusy = isbusy;
    }
    public Book(String title, String author, int year, String gender){
        this.title = title;                                                         //constructores
        this.author = author;
        this.year = year;
        this.gender = gender;
        this.isbusy = false;    
    }
    public void showInfo(){
        System.out.println("Title: " + title);              //METODOS
        System.out.println("Author: " + author);
        System.out.println("Year: " + year );
        System.out.println("Gender: " + gender);
        System.out.println("Is busy: " + isbusy);
    }

    public void getBook(){
            
            if(!isbusy){
                isbusy = true;
               
                System.out.println("El libro: " + title + " ha sido prestado");
                
            }

                else{
                
                System.out.println("El libro: " + title + " ya esta prestado");
            }
    }

    public void returnBook(){
       
        if(isbusy){
            isbusy = false;
            
            System.out.println("El libro: " + title + " ha sido devuelto");
        }
        else{
           
            System.out.println("El libro: " + title + " no está prestado");
        }
}



}
