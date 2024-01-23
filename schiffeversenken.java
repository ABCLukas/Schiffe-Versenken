/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrix;
import javax.swing.JOptionPane;

/**
 *
 * @author LukasSchneiderINF2A
 */
public class schiffeversenken {
    public static void main(String[] args) {
        
    char[][] feld = {
                {' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' '}
    };
    char[][] visual = {
                {' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' '}
    };
    int uebrig = 10;
    boolean wiederholen = true;
    
    for(int i = 0; i<10;i++){
        int ran1 = (int)(Math.random()*(8)-1);
        int ran2 = (int)(Math.random()*(8)-1);
        feld[ran1][ran2] = 'S';
        
    }
    System.out.println("--------------------------------");
    System.out.println("----------Neues Spiel-----------");
    System.out.println("--------------------------------");

    do{

    System.out.println(" |1|2|3|4|5|6|7|8|");
    for (int i = 0; i < visual.length; i++) {
        System.out.print(i+1);
            for (int j = 0; j < visual.length; j++) {
                System.out.print("|"+visual[i][j] );
            }
            System.out.println();
        }
    
    String eingabex = JOptionPane.showInputDialog("X Position von einem schiff");
    String eingabey = JOptionPane.showInputDialog("Y Position von einem schiff");
    int eingposx = Integer.parseInt(eingabex)-1;
    int eingposy = Integer.parseInt(eingabey)-1;
    
            if(feld[eingposy][eingposx] == 'S'&&feld[eingposy][eingposx] != 'X'){
                    visual[eingposy][eingposx]= 'S';
                    feld  [eingposy][eingposx]= 'X';
                uebrig--;
                System.out.println("Schiff getroffen "+uebrig+" Sind noch übrig");
            }else if(feld[eingposy][eingposx] != 'S'){
                    visual[eingposy][eingposx]= 'X';
                    System.out.println("Sie haben Nicht getroffen");
            }else if(feld[eingposy][eingposx] == 'X'){
                    System.out.println("Sie haben dort schon geschossen");
            }else{
                    System.out.println("Geben sie eine Zahl in dem feld an");
            }
            
    
            if(uebrig<=0){
                wiederholen = false;
            }else{
            System.out.println("--------------------------------");
            System.out.println("-----------Neue Runde-----------");
            System.out.println("--------------------------------");
            }
        }while(wiederholen);
        System.out.println("Sie haben Gewonnen");
    }
}
