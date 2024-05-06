import javafx.stage.Stage;
import javafx.event.Event;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

/**
 * Controla os dados do modelo e a interação com a interface (visão)
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class ConversionController
{
    ConversionView view;
    Stage stage;
    Conversion conversion;
    public TextField textFieldMetros;
    public Label labelResultadoHectare;
    public Label labelResultadoAlqueire;
    
    /**
     * Construtor para objetos da classe ConversionController
     */
    public ConversionController()
    {
        this.stage = new Stage();
        this.view = new ConversionView();
        this.view.setController(this);
    }
    
    public void iniciar() throws Exception {
        this.view.start(this.stage);
        this.stage.show();
    }
    
    public void botaoCalcularClicado(Event e) {
        try {
            double metros = Double.parseDouble(textFieldMetros.getText());
            Conversion conversion = new Conversion(metros);
            this.labelResultadoHectare.setText(String.format("%.2f",conversion.metrosParaHectares()));
            this.labelResultadoAlqueire.setText(String.format("%.2f", conversion.metrosParaAlqueires()));
        } catch (NumberFormatException exception) {
            labelResultadoHectare.setText("Dados de entrada incompletos ou inválidos");
            labelResultadoAlqueire.setText("");
        }
    }
    
    public void botaoLimparClicado(Event e) {
        textFieldMetros.setText("");
        labelResultadoHectare.setText("");
        labelResultadoAlqueire.setText("");
    }    
}
