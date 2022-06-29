
package javaModular.operacao;

import javaModular.operacao.internal.DivHelper;
import javaModular.operacao.internal.MultHelper;
import javaModular.operacao.internal.SubHelper;
import javaModular.operacao.internal.SumHelper;

/**
 *
 * @author Geisy
 */
public class Calculadora {
    
    private DivHelper divHelper;
    private MultHelper multHelper;
    private SubHelper subHelper;
    private SumHelper sumHelper;
    
    public Calculadora(){
        this.divHelper = new DivHelper();
        this.multHelper = new MultHelper();
        this.sumHelper = new SumHelper();
        this.subHelper = new SubHelper();
        
    }
    
    public int sum(int a, int b){
        return sumHelper.execute(a, b);
    }
    
    public int sub(int a, int b){
        return subHelper.execute(a, b);
    }

    public int mult(int a, int b){
        return multHelper.execute(a, b);
    }
    
    public int div(int a, int b){
        return divHelper.execute(a, b);
    }
}
