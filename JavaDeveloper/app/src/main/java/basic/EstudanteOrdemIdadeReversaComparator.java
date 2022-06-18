
package basic;

import java.util.Comparator;

/**
 *
 * @author VAIO
 */
public class EstudanteOrdemIdadeReversaComparator implements Comparator{

    public int compare(Estudante o1, Estudante o2) {
       return o2.getIdade() - o1.getIdade();
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
        
    }

    
    
}
