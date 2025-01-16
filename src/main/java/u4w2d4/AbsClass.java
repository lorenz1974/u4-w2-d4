package u4w2d4;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

public abstract class AbsClass {

    final private int id;

    // Formattatore decimale configurato per il formato italiano
    public static final DecimalFormat df = new DecimalFormat("###,###,###.00", new DecimalFormatSymbols(Locale.ITALY));

    // ObjectMapper statico e configurato
    private static final ObjectMapper objectMapper;

    static {
        objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule()); // Configurazione per Java 8 Date/Time API
    }

    // Costruttore
    public AbsClass(int id) {
        this.id = id;
    }

    // Getter per l'id
    public int getId() {
        return id;
    }

    // Metodo toString con conversione JSON
    @Override
    public String toString() {
        try {
            return objectMapper.writeValueAsString(this); // Serializza l'oggetto in formato JSON
        } catch (JsonProcessingException e) {
            return "Errore durante la conversione in JSON: " + e.getMessage();
        }
    }
}
