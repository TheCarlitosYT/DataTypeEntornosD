import java.util.List;
import java.util.Arrays;

public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println(covid(38.5f, false, false, false,
                false, false, false, false, false,
                "prueba"));
    }
    
    public static String covid(float bodyTemperature, boolean difficultyBreathing, boolean diabetes, boolean cancer, boolean isPregnant, boolean isOver60yearsold, boolean hepatic, boolean kidnevDisease, boolean respiratoryDisease, String provincia) {
        List<Boolean> Enfermedades = Arrays.asList(difficultyBreathing, diabetes, cancer, isPregnant, isOver60yearsold, hepatic, kidnevDisease, respiratoryDisease);
        
        if (bodyTemperature >= 38) {
            if (Enfermedades.contains(true)) {
                return "/diagnostico/" + provincia;
            }
            return "/cuarentena/";
        }
        return "/diagnostico_bueno/";
    }
}

