
public class Administracion{
    private double[] notas;
    private int contador;
    public Administracion(int num){
        notas = new double [num];
    }

    public String registrar(int nota){
        String respuesta = "nota no registrada";
        
        if(nota >= 0 && nota <=100){
            respuesta = respuesta + ", lista llena";
            if(contador < notas.length){
                notas[contador] = nota;
                contador++;
                respuesta = "nota registrada, aun puede registrar " + (notas.length - contador);
            }
        }else{
            respuesta = respuesta + ", la nota debe estar en el rango '0-100'";
        }
        
        return respuesta;
    }

    public double promedio(){
        double promedio;
        double sumatoria = 0;
        
        for(int i= 0; i < contador; i++){
            sumatoria = sumatoria + notas[i];
        }
        
        promedio = sumatoria / contador;
        
        return promedio;
    }

    public double promedioAprobados(){
        double promedio;
        double sumatoria = 0;
        int aux = 0;

        for(int i= 0; i< contador; i++){
            if(notas[i]>51){
                sumatoria = sumatoria + notas[i];
                aux++;
            }
        }
        
        promedio = sumatoria / aux;

        return promedio;
    }

    public int reprobados(){
        int reprobados = 0;

        for(int i = 0; i< contador;i++){
            if(!(notas[i]>51)){
                reprobados++;
            }
        }

        return reprobados;
    }

    public int aprobados(){
        int aprobados = 0;

        for(int i= 0; i <contador; i++){
            if(notas[i]>51){
                aprobados++;
            }
        }
        return aprobados;
    }

    public double notaMax(){
        double maximo = notas[0];

        for(int i = 1; i<contador; i++){
            if(maximo<notas[i]){
                maximo = notas[i];
            }
        }

        return maximo;
    }
}
