package org.if_unpas.kpl.kode;

/**
 * Hello world!
 *
 */
public class TimMain 
{
    public static void main( String[] args )
    {
		/* System.out.println( "Hello World!" ); */
    	Tim tim = new Tim("Persib");
    	
    	Pemain pemain1 = new Pemain("I Made", 1);
    	Pemain pemain2 = new Pemain("Atep", 7);
    	Pemain pemain3 = new Pemain("Essien", 5);
    	
    	tim.tambahPemainInti(pemain1);
    	tim.tambahPemainInti(pemain2);
    	tim.tambahPemainInti(pemain3);
    	tim.tambahPemainInti(new Pemain("Febrry", 22));
    	
    	tim.tampilPemainInti();
    }
}
