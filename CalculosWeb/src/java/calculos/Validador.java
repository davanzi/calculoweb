/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculos;

/**
 *
 * @author daniel
 */
public class Validador {

    public boolean isNumerico(String a, String b, String c) {
        try {
            Double.parseDouble(a);
            Double.parseDouble(b);
            Integer.parseInt(c);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    public boolean isPreenchido(String a, String b, String c) {
        if (a.equals("")||b.equals("")||c.equals("")){
            return false;
        }else return true;
    }

    public boolean isValido(String a) {
        if (a.contains(",")){
            return false;
        }else return true;
    }
}
