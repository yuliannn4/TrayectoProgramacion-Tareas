
package juego.vaso;

import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class JUEGOVASO {

   
    public static void main(String[] args) {
        
//        //VARIABLES ***
//        Random RD= new Random();
//        int pelotita=RD.nextInt(3);
//        
//        ImageIcon Icono= new ImageIcon("src/imagenes/juego.png");
//        ImageIcon Bien= new ImageIcon("src/imagenes/bien.png");
//        ImageIcon Mal= new ImageIcon("src/imagenes/mal.png");
//        
//        int seleccion=JOptionPane.showOptionDialog(null,
//                "Encuentra la pelotita en los vasos!",
//                "Juego del Vaso",
//                JOptionPane.YES_NO_CANCEL_OPTION,
//                JOptionPane.INFORMATION_MESSAGE,Icono,
//                new Object[]{"VASO 1", "VASO 2","VASO 3"}, "VASO1");
//        
//        if(pelotita == seleccion){
//             JOptionPane.showMessageDialog(null,"MUY BIEN","Juego del Vaso",JOptionPane.INFORMATION_MESSAGE,Bien);
//        }else{
//             JOptionPane.showMessageDialog(null,"MUY MAL","Juego del Vaso",JOptionPane.INFORMATION_MESSAGE,Mal);        
//        }
        
        
        
        //VARIABLES ***
        Random RD = new Random();
        int pelotita = RD.nextInt(3);
        String jugadores[]= new String[2];
        int jugadasJugador1[]= new int[3];        
        int jugadasJugador2[]= new int[3];        

        ImageIcon Icono = new ImageIcon("src/imagenes/juego.png");
        ImageIcon Bien = new ImageIcon("src/imagenes/bien.png");
        ImageIcon Mal = new ImageIcon("src/imagenes/mal.png");
        
        jugadores[0]= JOptionPane.showInputDialog(null,"JUGADOR Nª1","Juego del Vaso",JOptionPane.QUESTION_MESSAGE);
        jugadores[1]= JOptionPane.showInputDialog(null,"JUGADOR Nª1","Juego del Vaso",JOptionPane.QUESTION_MESSAGE);
        //System.out.println(jugadores[0] + jugadores[1]);
        
        JOptionPane.showMessageDialog(null, "JUGUEMOS!", "Juego del Vaso", JOptionPane.INFORMATION_MESSAGE, Icono);
        
        for(int i=0; i<jugadasJugador1.length; i++ ){
        int seleccion = JOptionPane.showOptionDialog(null,
                "Encuentra la pelotita en los vasos!",
                "Juego del Vaso",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE, Icono,
                new Object[]{"VASO 1", "VASO 2", "VASO 3"}, "VASO1");
           }   
//        if (pelotita == seleccion) {
//            JOptionPane.showMessageDialog(null, "MUY BIEN", "Juego del Vaso", JOptionPane.INFORMATION_MESSAGE, Bien);
//        } else {
//            JOptionPane.showMessageDialog(null, "MUY MAL", "Juego del Vaso", JOptionPane.INFORMATION_MESSAGE, Mal);
//        }      
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
