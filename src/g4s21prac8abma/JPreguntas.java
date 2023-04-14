
package g4s21prac8abma;


public class JPreguntas {
    
    String[] preguntas = {
        "¿Cuál es el río más largo del mundo?", "¿Qué tipo de animal es la ballena?", "¿Dónde está Transilvania?    ",
        "¿Cuántos años duró la Primera Guerra Mundial?", "¿Cuál es el océano más grande del mundo?"
    };
    
   public String getPregunta(int posicion){
        return preguntas[posicion];
    }
    
}
