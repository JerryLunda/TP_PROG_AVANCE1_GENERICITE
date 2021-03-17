import java.util.HashMap;
import java.util.Map;
public class GENERICITE {
    public static void main(String[] args) {
        Map<String, String> client = new HashMap<>();

        client.put("NSENGA NSENGA INGRID", "+243 975567483");
        client.put("LUNDA KASONGO JERRY", "+243 975567483");
        client.put("KABANDA MUDYA DAMBU FLOVIS", "+243 973897429");
        client.put("MUKEMBE BANZA GLOIRE", "+243 855907553");
        client.put("NGALULA MONGA SARAH", "+243 817837489");
        client.put("KAYEMBE MISENGA GLORIA", "+243 975567483");
        client.put("MATONDO KAYEMBE ELIEL", "+243 975679683");
        client.put("CISHIBANJI MUYAGA VIANNEY", "+243 855566603");
        client.put("KAMB KAMB HENCOCK", "+243 975477085");
        client.put("BANZA KAFUKA BIENVENUE", "++243 975375013");
        client.put("KALUME MATATA PAUL", "+243 815567601");
        client.put("KABENGELE MULYA SYNTICHE", "+234 973247948");
// …
        for(Map.Entry entry: client.entrySet()){
            System.out.println("**********************************************************************");
            System.out.println("Le client: "+entry.getKey()+" a pour cellulaire: "+entry.getValue());
        }
    }

}
