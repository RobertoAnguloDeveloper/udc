/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.awt.Toolkit;

/**
 *
 * @author TECNOLOGIA GC
 */
public class ValidaEntrada {
    
    public void validaNumeros(java.awt.event.KeyEvent evt){
        char key = evt.getKeyChar();
        int k = Integer.valueOf(key);
        
        if((k < 48 && k != 8 && k == 44)  || k > 57 || (k > 31 && k < 46 && k != 47)){
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }else if((k == 8))
            evt.consume();
    }
}
