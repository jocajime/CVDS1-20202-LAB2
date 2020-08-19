package edu.eci.cvds.patterns;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
     {
	for (int i=0; i<args.length;i++){
		if (i==args.length-1){
			System.out.print(args[i]+"!");
		}else{
			System.out.print(args[i]+" ");
		}
	}
    }
}
