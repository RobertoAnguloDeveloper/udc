/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.awt.Toolkit;
import java.text.DecimalFormat;

/**
 *
 * @author TECNOLOGIA GC
 */
public class ValidaEntrada {
    
    public void validaNumerosDouble(java.awt.event.KeyEvent evt){
        char key = evt.getKeyChar();
        int k = Integer.valueOf(key);
        
        if((k < 48 && k != 8 && k == 44)  || k > 57 || (k > 31 && k < 46 && k != 47)){
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }else if((k == 8))
            evt.consume();
    }
    
    public void validaNumerosInt(java.awt.event.KeyEvent evt){
        char key = evt.getKeyChar();
        int k = Integer.valueOf(key);
        
        if((k > 31  && k < 48) || k > 57){
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }else if((k == 8))
            evt.consume();
    }
    
    public String separadorDeMiles(int numero) {
        DecimalFormat df = new DecimalFormat("#,###.###");
            String numeroSeparado = df.format(numero);
            return numeroSeparado;
    }
}
