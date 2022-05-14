/*
 * Honestidade em pequenas coisas não é uma coisa pequena
 */
package clean.code;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Guilherme
 */
public class CleanCode {
    
    int d;
    
    int elapsedTimeInDays;
    int daysSinceCreation;
    int daysSinceModifacation;
    int fileAgeInDays;

    public static void main(String[] args) {
        System.out.print("Exemplos de um codigo ruim e um bom codigo\n");
    }
    
    public List<int[]> getThem() {
        List<int[]> lis1 = new ArrayList<int[]>();
        for(int [] x : theList){
            if (x[0]==4)
                lis1.add(x);
        }
        return lis1;
    }
    
}
