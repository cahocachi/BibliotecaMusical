/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecamusical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author DM3-1-15
 */
public class Canciones {
    private String nombre;
    private String album;
    private String artista;
    private String genero;
    private int longitud;
    private int numero;

  

    
    public String getNombre()
    {
	return nombre;
    }

    public void setNombre()
    {
	System.out.println("Inserte el nombre de la canción: ");
        nombre=Auxiliar.lector();
    }
    
    public void setNombre(String nombre)
    {
	if(nombre.length()==0)
	{
	    nombre="";
	    System.out.println("Nombre se inicializa vacío.");
	}
	else
	    this.nombre=nombre;
    }
    
    public String getAlbum()
    {
	return album;
    }
    
    public void setAlbum()
    {
	System.out.println("Inserte el album de la canción: ");
        album=Auxiliar.lector();
    }
    
    public void setAlbum(String album)
    {
	if(album.length()==0)
	{
	    album="";
	    System.out.println("Album se inicializa vacío.");
	}
	else
	    this.album=album;
    }
    
    public String getArtista()
    {
	return artista;
    }
    
    public void setArtista()
    {
	System.out.println("Inserte el artista de la canción: ");
        artista=Auxiliar.lector();
    }
    
    public void setArtista(String artista)
    {
	if(artista.length()==0)
	{
	    album="";
	    System.out.println("Artista se inicializa vacío.");
	}
	else
	    this.artista=artista;
    }
    
    public String getGenero()
    {
	return genero;
    }
    
    public void setGenero()
    {
	System.out.println("Inserte el genero de la canción: ");
        genero=Auxiliar.lector();
    }
    
    public void setGenero(String genero) 
    {
	if(genero.length()==0)
	{
	    album="";
	    System.out.println("Genero se inicializa vacío.");
	}
	else
	    this.genero=genero;
    }
    
    public int getLongitud()
    {
	return longitud;
    }
    
    public void setLongitud()
    {
	System.out.println("Inserte la longitud de la canción en segundos: ");
        longitud=Integer.parseInt(Auxiliar.lector());
	
    }
    
    public void setLongitud(int longitud) 
    {
        this.longitud=longitud;
    }
    
    public int getNumero()
    {
	return numero;
    }
    
    public void setNumero()
    {
	System.out.println("Inserte el numero de la canción: ");
        numero=Integer.parseInt(Auxiliar.lector());
    }
    
    public void setNumero(int numero) 
    {
	this.numero=numero;
    }
}

