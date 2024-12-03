package Clase_01;

public class main {
    

        public static void main(String[] args) {
            Book libro = new Book();                    
            Book libro2 = new Book("Cien años de soledad", "Gabriel Garcua Marquez", 1968, "Narrativa");   
            Book libro3 = new Book("Don Quijote de la mancha", "Miguel de Cervantes", 1605, "Novela", false);
            libro3.getBook();
            libro3.getBook();


            System.out.println("***********************************");
            libro.showInfo();
            System.out.println("***********************************");
            libro2.showInfo();
            System.out.println("***********************************");
            libro3.showInfo();
            System.out.println("***********************************");

        }
}