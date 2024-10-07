package mx.ipn.alumno.jsanchezm1704.IngenieraDeSoftware.controller;

public class CerraduraKleene 
{
    private final int numero;
    private final int tipo;

    public CerraduraKleene(int numero, int tipo)
    {
        this.tipo=tipo;
        this.numero=numero;
    }

    public String generarCadena()
    {
        String cadena;
        if (this.numero<=0)
        {
            return " ";
        }
        else
        {
            cadena = switch (this.tipo) {
                case 0 -> estrella();
                case 1 -> positiva();
                default -> "Error: Tipo de cerradura no reconocido";
            };
        }
        return cadena;
    }

    private  String estrella()
    {
        String cadena = generarBinarios(this.numero, " ");
        cadena = cadena.substring(0, cadena.length() - 1); // Elimina el último carácter
        return "λ," + cadena;
    }

    private String  positiva()
    {
        String cadena = generarBinarios(this.numero, " ");
        cadena = cadena.substring(0, cadena.length() - 1); // Elimina el último carácter
        return cadena;
    }

    private  String generarBinarios(int numero, String binarios)
    {
        if (numero == 0) 
        {
            return binarios + ",";
        }
        return generarBinarios(numero - 1, binarios + "0") + generarBinarios(numero - 1, binarios + "1");
    }
}
