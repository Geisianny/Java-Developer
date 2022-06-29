
package javaModular.operacao.internal;

import javaModular.operacao.IOperacao;

/**
 *
 * @author Geisy
 */
public class SubHelper implements IOperacao {

    @Override
    public int execute(int a, int b) {
        return a - b;
    }
    
}
