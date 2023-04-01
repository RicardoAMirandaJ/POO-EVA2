/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_23_polimorfismo_vehiculos;

/**
 *
 * @author ricar
 */
public class EVA2_23_POLIMORFISMO_VEHICULOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Automovil auto = new Automovil ("Tesla", 0, "X", 2020);
        cambiarVelocidad(auto, 20);
        Bicicleta bici = new Bicicleta("Montaña", "XXX", "Harley Davidson",0);
        cambiarVelocidad(bici, 50);
    }
    
    public static void cambiarVelocidad(DatosVehiculo vehi, int vel){
        vehi.acelerar(vel);
        vehi.tablero();
    }
    
    interface DatosVehiculo{
        public abstract void acelerar(int cambio);
        void tablero();
    }
    class Vehiculo{
        private String marca;
        protected int velocidad;

        public Vehiculo() {
            marca = "--------";
            velocidad = 0;
        }

        public Vehiculo(String marca, int velocidad) {
            this.marca = marca;
            this.velocidad = velocidad;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public int getVelocidad() {
            return velocidad;
        }
        
    }
    
    class Automovil extends Vehiculo implements DatosVehiculo {
        private String modelo;
        private int ano;

        public Automovil() {
            super();
            modelo = "--------";
            ano = 0;
        }

        public Automovil(String modelo, int ano, String marca, int velocidad) {
            super(marca, velocidad);
            this.modelo = modelo;
            this.ano = ano;
        }
        
        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public int getAno() {
            return ano;
        }

        public void setAno(int ano) {
            this.ano = ano;
        }
        @Override
        public void acelerar(int cambio) {
            int cambioVel = velocidad + cambio;
            if((velocidad += cambio) >= 0)//aceptar solo velocidades positivas o cero
                velocidad += cambio;//velocidad = velocidad + cambio <-- acumulador
        }
        @Override
        public void tablero(){
            System.out.println("Velocidad del automovil: " + getVelocidad());
        }
    }
    
    class Bicicleta extends Vehiculo implements DatosVehiculo {
        private String tipo; //montaña, pista, etc
        private String rodada; //tipo de llanta

        public Bicicleta() {
            tipo = "--------";
            rodada = "--------";
        }

        public Bicicleta(String tipo, String rodada, String marca, int velocidad) {
            super(marca, velocidad);
            this.tipo = tipo;
            this.rodada = rodada;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public String getRodada() {
            return rodada;
        }

        public void setRodada(String rodada) {
            this.rodada = rodada;
        }
        @Override
        public void acelerar(int cambio) {
            int cambioVel = velocidad + cambio;
            if((velocidad += cambio) >= 0)//aceptar solo velocidades positivas o cero
                velocidad += cambio;//velocidad = velocidad + cambio <-- acumulador
        }
        @Override
        public void tablero(){
            System.out.println("Velocidad de la bicicleta: " + getVelocidad());
        }
    }
}
