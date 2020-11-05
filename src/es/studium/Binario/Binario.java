package es.studium.Binario;

import java.util.Scanner;

public class Binario
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		byte a,b,c,d,e;
		do {
			System.out.println( "Escriba la primera cifra del binario 1 o 0" );
			a=(byte) teclado.nextInt();
		}
		while (a!=0 && a!=1);{}
		do {
			System.out.println( "Escriba la segunda cifra del binario 1 o 0" );
			b=(byte) teclado.nextInt();
		}
		while (b!=0 && b!=1);{}
		do{
			System.out.println( "Escriba la tercera cifra del binario 1 o 0" );
			c=(byte) teclado.nextInt();
		}
		while (c!=0 && c!=1);{}
		do{
			System.out.println( "Escriba la cuarta cifra del binario 1 o 0" );
			d=(byte) teclado.nextInt();
		}
		while (d!=0 && d!=1);{}
		do{
			System.out.println( "Escriba la cuarta cifra del binario 1 o 0" );
			e=(byte) teclado.nextInt();
		}
		while (e!=0 && e!=1);{}
		teclado.close();
		System.out.println( "El numero en decimal es " + funDecimal(a,b,c,d,e));
	}
	public static int funDecimal(byte a, byte b, byte c,byte d,byte e)
    {
        int resultado;
        resultado=(1*e)+(2*d)+(4*c)+(8*b)+(16*a);
        return(resultado);
    }
}


/*Programa ejercicio22

VARIABLES
    ENTERO a,b,c,d,e
INICIO
	HACER
	    ESCRIBIR "Escriba primer cifra del binario 1 o 0 "
    	Leer a,
    MIENTRAS a <> 0 Y a <> 1
    HACER	
    	ESCRIBIR "Escriba segudo cifra del binario 1 o 0 "
    	Leer b
    MIENTRAS b <> 0 Y b <> 1
    HACER	
    	ESCRIBIR "Escriba tercer cifra del binario 1 o 0 "
    	Leer c
    MIENTRAS c <> 0 Y c <> 1
    HACER	
    	ESCRIBIR "Escriba cuarta cifra del binario 1 o 0 "
    	Leer d
    MIENTRAS d <> 0 Y d <> 1
    HACER	
    	ESCRIBIR "Escriba quinta cifra del binario 1 o 0 "
    	Leer e
    MIENTRAS e <> 0 Y e <> 1	
    	ESCRIBIR "El numero en decimal es "+ funDecimal(a,b,c,d,e)
    
    	
FIN

FUNCION funDecimal (ENTERO a,ENTERO b,ENTERO c,ENTERO d,ENTERO e) DEVUELVE ENTERO

VARIABLES
	ENTERO r
INICIO
	r=(1*e)+(2*d)+(4*c)+(8*b)+(16*a)
DEVOLVER r
FIN*/