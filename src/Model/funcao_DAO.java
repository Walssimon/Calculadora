
package Model;


public class funcao_DAO {
   
    public static int rest = 3;
   
    public static void soma (){
        String teste = View.TelaCalc_GUI.V1_INT.getText();
        int val1 = Integer.parseInt(teste);
        
        teste = View.TelaCalc_GUI.V2_INT.getText();
        int val2 = Integer.parseInt(teste);
        
        rest = val1 + val2;
        
    }
    public static void sub (){
        String teste = View.TelaCalc_GUI.V1_INT.getText();
        int val1 = Integer.parseInt(teste);
        
        teste = View.TelaCalc_GUI.V2_INT.getText();
        int val2 = Integer.parseInt(teste);
        
        rest = val1 - val2;
    }
    public static void div (){
        String teste = View.TelaCalc_GUI.V1_INT.getText();
        int val1 = Integer.parseInt(teste);
        
        teste = View.TelaCalc_GUI.V2_INT.getText();
        int val2 = Integer.parseInt(teste);
        
        rest = val1 / val2;
    }
    public static void multi (){
        String teste = View.TelaCalc_GUI.V1_INT.getText();
        int val1 = Integer.parseInt(teste);
        
        teste = View.TelaCalc_GUI.V2_INT.getText();
        int val2 = Integer.parseInt(teste);
        
       rest = val1 * val2;
    }
}
