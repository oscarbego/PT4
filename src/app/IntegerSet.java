
package app;
/*
* PRUEBA TÉCNICA
* PROYECTO 4: Descripción Completa en Archivo de Word (Prueba Técnica JAVA)
*
* CLASE IntegerSet
* 
* Elaborado por: NORMA JUDITH ORTEGA RODRIGUEZ
* Fecha: 13 de marzo 2022
*/

public class IntegerSet {
    
    private static int tamMax = 5; //Este numero se puede modificar segun necesidad
    private final boolean[] arregloBooleano = new boolean[ tamMax ];
       
    
    public static void main( String[] args )
    {
        IntegerSet arreglo1 = new IntegerSet();
        IntegerSet arreglo2 = new IntegerSet();
        
        int pos;
        
        
        //Realizar UNION de arreglo1 con arreglo2 y dejarlo en arreglo UNION
            System.out.println("UNION Arreglo1 con Arreglo2:  " + union( arreglo1, arreglo2 ));
            
                   
        //Realizar UNION de arreglo1 con arreglo2 y dejarlo en arreglo UNION
            System.out.println("INTERSECCION Arreglo1 con Arreglo2:  " + interseccion( arreglo1, arreglo2 ));
            
        
            
        // INSERTAR un elemento en el arreglo (poner en true), la posicion 
        // se va a determinar con un numero aleatorio
            pos=(int)(Math.random()*tamMax);  //genera una posición aleatoria entre 0 y tamMax
            System.out.println("INSERTAR un elemento en Arreglo1" + insertarElemento( arreglo1, pos));
            
            
            
        // BORRAR un elemento en el arreglo (poner en false), la posicion 
        // se va a determinar con un numero aleatorio
            pos=(int)(Math.random()*tamMax);  //genera una posición aleatoria entre 0 y tamMax
            System.out.println("BORRAR un elemento en Arreglo1" + borrarElemento( arreglo1, pos));
        
            
 
        // COMPARA si dos conjuntos son IGUALES
            System.out.println("COMPARA si arreglo1 es igual a Arreglo2: " + arreglo1.isEqual( arreglo2 ) );
            
        
    }// Cierra void main
     
    
    // ---------------------- METODOS DE LA CLASE -----------------------------------
    
    public IntegerSet()
    {
            for ( int i = 0; i < tamMax; i++  )
            arregloBooleano[ i ] = false;    
    }
    
    public static IntegerSet union( IntegerSet set1, IntegerSet set2 )
      {
          IntegerSet union = new IntegerSet();
          for ( int i = 0; i < tamMax; i++ )
          {
             System.out.println(union.arregloBooleano[ i ] = set1.arregloBooleano[ i ] || set2.arregloBooleano[ i ]);
          }
 
        return union;
      }
    
    
    public static IntegerSet interseccion( IntegerSet set1, IntegerSet set2 )
      {
        IntegerSet interseccion = new IntegerSet();
          for ( int i = 0; i < tamMax; i++ )
          {
             System.out.println(interseccion.arregloBooleano[ i ] = set1.arregloBooleano[ i ] && set2.arregloBooleano[ i ]);
          }
 
        return interseccion;
      }
    
    
    public static IntegerSet insertarElemento( IntegerSet set1, int pos )
    {   
        IntegerSet insertarElemento = new IntegerSet();
        set1.arregloBooleano[pos] = true;
        return insertarElemento;
    }
      
    
    
    public static IntegerSet borrarElemento( IntegerSet set1, int pos )
    {   
        IntegerSet borrarElemento = new IntegerSet();
        set1.arregloBooleano[pos] = true;
        return borrarElemento;
    }
    
    
    
    public String toString()
    {
        boolean isEmpty = true;
        StringBuilder string = new StringBuilder();
        string.append( "{ " );
        for ( int i = 0; i < tamMax; i++ )
        {
            if ( arregloBooleano[ i ] )
            {
                isEmpty = false;
                string.append( i ).append( ' ' );
            }
        }
        return isEmpty ? "---" : string.append( '}').toString();
    }
      
    
    public boolean isEqual( IntegerSet set )
    {
        for ( int i = 0; i < tamMax; i++ )
        {
            if ( arregloBooleano[ i ] != set.arregloBooleano[ i ] )
            {
                return false;
            }
        }
        return true;
    }
    
    
}// cierra class IntegerSet


