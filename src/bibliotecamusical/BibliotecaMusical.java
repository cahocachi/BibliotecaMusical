/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecamusical;

/**
 *
 * @author DM3-1-15
 */
public class BibliotecaMusical {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Canciones cancion1 = new  Canciones();
	
	int aukera=0;
        boolean error, again;
        do{
            error=false;
            again=true;
            System.out.println("1. Nueva canción");
            System.out.println("2. Ver datos de canción");
            System.out.println("3. Cambiar datos de canción");
            System.out.println("4. Salir");
            try {
                aukera=Integer.parseInt(Auxiliar.lector());
            } catch (NumberFormatException e) {
                System.out.println("Escoge un numero");
            }
            switch (aukera) {
           
                case 1:
                    cancion1.setNombre();
		    cancion1.setArtista();
		    cancion1.setAlbum();
		    cancion1.setNumero();
		    cancion1.setGenero();		    
                    break;
                case 2:
                    System.out.println("\"" + cancion1.getNombre() + "\",");
		    System.out.println("de \"" + cancion1.getArtista()+ "\",");
		    System.out.println("Canción número " + cancion1.getNumero() + " del album \"" + cancion1.getAlbum() + "\"");
		    System.out.println("Género: \"" + cancion1.getGenero()+ "\"");
                    break;
                case 3:
                    cancion1.setNombre();
		    cancion1.setNumero();
		    cancion1.setGenero();
                    break;
                case 4:
                    again=false;
                    break;
                default:
                    error=true;
                    System.out.println("Error.");
            }    
        }
        while(error||again);
    }
    
}
