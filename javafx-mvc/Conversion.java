
/**
 * Transformação de m² em alqueire e hectare
 * 
 * @author mariadutra 
 * @version 0.01
 */
public class Conversion
{
    double metrosQuadrados;
    
    
    public Conversion() {
        this.metrosQuadrados = 0;
    }
    
    /**
     * Construtor para objetos da classe CalculadoraIMC
     */
    public Conversion(double metrosQuadrados)
    {
        this.metrosQuadrados = metrosQuadrados;  
    }

    /**
     * Calcula o m² em hectare
     */
    public double metrosParaHectares()
    {
        return metrosQuadrados / 10000;
    }
    
    //Alqueires paulistas o mineiro divide por 48400
    public double metrosParaAlqueires()
    {
        return metrosQuadrados / 24200;
    }
}
