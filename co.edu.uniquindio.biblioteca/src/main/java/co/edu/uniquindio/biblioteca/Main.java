package co.edu.uniquindio.biblioteca;

import co.edu.uniquindio.biblioteca.Libro;
public class Main{
    public static void main(String[] args) {
        //Creación de 5 libros

        Libro libro1 = new Libro();
        libro1.setTitulo("cien años de soledad");
        libro1.setAutor("Gabriel Garcia Marquez");
        libro1.setGenero("Narración");
        libro1.setNumeroPaginas(471);
        libro1.setFechaPublicacion(1967);
        libro1.setEditorial("Sudamericana");

        Libro libro2 = new Libro();
        libro2.setTitulo("sombras de nadie");
        libro2.setAutor("Alfredo Ruiz Islas");
        libro2.setGenero("Novela");
        libro2.setNumeroPaginas(245);
        libro2.setFechaPublicacion(2014);
        libro2.setEditorial("Norma");

        Libro libro3 = new Libro();
        libro3.setTitulo("odisea");
        libro3.setAutor("Homero");
        libro3.setGenero("Poema epico");
        libro3.setNumeroPaginas(160);
        libro3.setFechaPublicacion(1906);
        libro3.setEditorial("Club internacional del libro");

        Libro libro4 = new Libro();
        libro4.setTitulo("el principito");
        libro4.setAutor("Antoine de Saint-Exupéry");
        libro4.setGenero("Novela");
        libro4.setNumeroPaginas(109);
        libro4.setFechaPublicacion(1953);
        libro4.setEditorial("Salamandra");

        Libro libro5 = new Libro();
        libro5.setTitulo("el señor de los anillos");
        libro5.setAutor("J.R.R Tolkien");
        libro5.setGenero("Fantasia");
        libro5.setNumeroPaginas(576);
        libro5.setFechaPublicacion(1954);
        libro5.setEditorial("Booket");

        //Funcion que obtenga la cantidad de libros donde el titulo empiece por una vocal y consonante

        int contadorVocales = 0;
        int contadorConsonante = 0;

        if(libro1.getTitulo().charAt(0) == 'a' || libro1.getTitulo().charAt(0) == 'e'|| libro1.getTitulo().charAt(0) == 'i' || libro1.getTitulo().charAt(0) == 'o'|| libro1.getTitulo().charAt(0) == 'u'){
            contadorVocales = contadorVocales + 1;

        }else{
            contadorConsonante = contadorConsonante + 1;
        }
        if(libro2.getTitulo().charAt(0) == 'a' || libro2.getTitulo().charAt(0) == 'e'|| libro2.getTitulo().charAt(0) == 'i' || libro2.getTitulo().charAt(0) == 'o'|| libro2.getTitulo().charAt(0) == 'u'){
            contadorVocales = contadorVocales + 1;

        }else{
            contadorConsonante = contadorConsonante + 1;
        }
        if(libro3.getTitulo().charAt(0) == 'a' || libro3.getTitulo().charAt(0) == 'e'|| libro3.getTitulo().charAt(0) == 'i' || libro3.getTitulo().charAt(0) == 'o'|| libro3.getTitulo().charAt(0) == 'u'){
            contadorVocales = contadorVocales + 1;

        }else{
            contadorConsonante = contadorConsonante + 1;
        }
        if(libro4.getTitulo().charAt(0) == 'a' || libro4.getTitulo().charAt(0) == 'e'|| libro4.getTitulo().charAt(0) == 'i' || libro4.getTitulo().charAt(0) == 'o'|| libro4.getTitulo().charAt(0) == 'u'){
            contadorVocales = contadorVocales + 1;

        }else{
            contadorConsonante = contadorConsonante + 1;
        }
        if(libro5.getTitulo().charAt(0) == 'a' || libro5.getTitulo().charAt(0) == 'e'|| libro5.getTitulo().charAt(0) == 'i' || libro5.getTitulo().charAt(0) == 'o'|| libro5.getTitulo().charAt(0) == 'u'){
            contadorVocales = contadorVocales + 1;

        }else{
            contadorConsonante = contadorConsonante + 1;
        }
        System.out.println("La cantidad de vocales son: " + contadorVocales);
        System.out.println("La cantidad de consonantes son: " + contadorConsonante);

        //Obtener la cantidad de libros que se hayan publicado despues del año 2000

        int contadorLibrosPublicacion = 0;

        if(libro1.getFechaPublicacion() >= 2000){
            contadorLibrosPublicacion = contadorLibrosPublicacion + 1;
        }else{
            contadorLibrosPublicacion = contadorLibrosPublicacion;
        }
        if(libro2.getFechaPublicacion() >= 2000){
            contadorLibrosPublicacion = contadorLibrosPublicacion + 1;
        }else{
            contadorLibrosPublicacion = contadorLibrosPublicacion;
        }
        if(libro3.getFechaPublicacion() >= 2000){
            contadorLibrosPublicacion = contadorLibrosPublicacion + 1;
        }else{
            contadorLibrosPublicacion = contadorLibrosPublicacion;
        }
        if(libro4.getFechaPublicacion() >= 2000){
            contadorLibrosPublicacion = contadorLibrosPublicacion + 1;
        }else{
            contadorLibrosPublicacion = contadorLibrosPublicacion;
        }
        if(libro5.getFechaPublicacion() >= 2000){
            contadorLibrosPublicacion = contadorLibrosPublicacion + 1;
        }else{
            contadorLibrosPublicacion = contadorLibrosPublicacion;
        }
        System.out.println("La cantidad de libros con año de publicación mayor a 2000 son: " + contadorLibrosPublicacion);

        // Obtener la cantidad de libros que tengan menos de 200 paginas

        int contadorPaginasLibro = 0;

        if(libro1.getNumeroPaginas() <= 200){
            contadorPaginasLibro = contadorPaginasLibro + 1;
        }else{
            contadorPaginasLibro = contadorPaginasLibro;
        }
        if(libro2.getNumeroPaginas() <= 200){
            contadorPaginasLibro = contadorPaginasLibro + 1;
        }else{
            contadorPaginasLibro = contadorPaginasLibro;
        }
        if(libro3.getNumeroPaginas() <= 200){
            contadorPaginasLibro = contadorPaginasLibro + 1;
        }else{
            contadorPaginasLibro = contadorPaginasLibro;
        }
        if(libro4.getNumeroPaginas() <= 200){
            contadorPaginasLibro = contadorPaginasLibro + 1;
        }else{
            contadorPaginasLibro = contadorPaginasLibro;
        }
        if(libro5.getNumeroPaginas() <= 200){
            contadorPaginasLibro = contadorPaginasLibro + 1;
        }else{
            contadorPaginasLibro = contadorPaginasLibro;
        }
        System.out.println("La cantidad de libros con paginas menores a 200 son: " + contadorPaginasLibro);

    }

}