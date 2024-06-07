import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {
	ArrayList<String> listaProducto;
	ArrayList<String> listaCantidad;
	ArrayList<String> listaInventario;

    public Principal() {
    	listaProducto= new ArrayList<>();
    	listaCantidad= new ArrayList<>();
    	listaInventario= new ArrayList<>();
    }
    
    public void inicio() {
    	int opcionMenu;
    
	 do { opcionMenu=mostrarMenu();
	   
	 switch (opcionMenu) {
	 case 1:
		 agregarProducto();
	         break;
	 case 2: 
		 buscarProductoPornombre();
		   break;
	 case 3:
		 actualizarCantidadDeProducto();
		 break;
		 
	 case 4:
		 eliminarProducto();
		 break;
	 case 5:
		 mostrarInventario();
		 break;
	 case 0:	 
		 JOptionPane.showMessageDialog(null, "Saliendo del programa...");
         break;
	 default:
         JOptionPane.showMessageDialog(null, "Opción no válida, por favor ingrese nuevamente.");
         break;}
         }while (opcionMenu !=0);
}
	 
	 private int mostrarMenu() {
	               String menu= "Menu\n\n";
			        menu+= "1.Agregar producto\\n";
					menu+="2.Buscar producto por nombre\n";
			        menu+="3. Actualizar cantidad de producto\\n";
			        menu+="4. eLIMINAR PRODUCTO\n";
			        menu+="5. Mostrar inventario\\n";
			        menu+="6. Salir\n";
			        
			     String opcionST=JOptionPane.showInputDialog(menu);
			     int opcion=Integer.parseInt(opcionST);
			     return opcion;
		}
		private void agregarProducto() {
			System.out.println("\n<<<< Agregar Producto >>>>");
			int cant=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos"));
			   for  (int i = 0; i< cant; i++) {
				   String nombreProducto=JOptionPane.showInputDialog("nombre producto"+ (i+1));
				   listaProducto.add(nombreProducto);
		} System.out.println("Registro de producto Exitoso!\n");
		}
    		private void buscarProductoPornombre() {
    			System.out.println("\n<<<< Buscar Producto por Nombre >>>>");
    			 String nombre=JOptionPane.showInputDialog("Ingrese el nombre del producto");
    			 
    			 if(listaProducto.contains(nombre)) {
    		        	int posicion=listaProducto.indexOf(nombre);
    		        	ArrayList<String> listaTemporal=listaInventario.get(posicion);
    		        	
    		        	System.out.print("Producto: "+nombre+" = ");
    		        	System.out.print("[");
    		        	
    		        	for (int j=0; j< listaTemporal.size();j++) {
    		        		System.out.print(listaTemporal.get(j));
    		        		if(j< listaTemporal.size()-1) {
    		        			System.out.print(",");
    		        		}
    		        	}
    		        		System.out.print("]\n");
    		        	}else {
    		        		System.out.println("No se encuenta el producto"+nombre+"\n");
    		        			
    		        		}
    		        	}
    		private void actualizarCantidadDeProducto() {
    		   	   System.out.println("\n<<<< Actializar cantidad de productos >>>>");
    		        
    		   	   for (int i=0; i < listaProducto.size(); i++) {
    		   	         JOptionPane.showConfirmDialog(null, "Ingrese los productos"+ "para el profesor"+listaProducto.get(i));
    		   	       
    		   	          listaProducto=new ArrayList<String>();
    		   	       
    		   	          int cant=Integer.parseInt(JOptionPane.showInputDialog("Cantidad de productos"));
    		   	          for (int j=0; j<cant; j++) {
    		   	    	   String nombreEst=JOptionPane.showInputDialog("nombre producto"+ (j+1));
    		   	    	   listaProducto.add(nombreEst);
    		   	       }
    		   	           listaInventario.addAll(listaProducto);
    		      }
    		          System.out.println("Registro de productos Exitoso!\n");
    		} 
    		private void eliminarProducto() {
    			String nombreProducto=JOptionPane.showInputDialog("Ingrese el nombre de producto que desea eliminar");
    			listaProducto=new ArrayList<String>();
    			if(listaProducto.contains(nombreProducto)) {
    				JOptionPane.showInputDialog(null,"Producto eliminado");
    			}else {
    				JOptionPane.showInputDialog(null,"No se puede eliminar el Producto ");
    			}
    		private void mostrarInventario() {
    			String listaTemporal;
    			for(int i=0; i< listaInventario.size(); i++) {
                	listaTemporal=listaInventario.get(i);
                	System.out.print("Producto:"+ listaProducto.get(i)+" - ");
                	System.out.print("[");
                	
                	for (int j=0; j< listaTemporal.size(); j++) {
                	System.out.print(listaTemporal.get(j));
                	System.out.print(",");
                	}
                	System.out.print("]\n");
                }
    			else {
    				System.out.println("No se encuentra el producto "+listaProducto.get(i));
    			}
    			public static void main(String[]args) {
    		    	  Principal procesos= new Principal();
    		    	  procesos.inicio();
}
}
