

public class Test{

    enum TipoLavado { 
        BASICO(3),
        NORMAL(5),
        SUPER(8);

        private int tiempo;

        TipoLavado(int tiempo){
            this.tiempo = tiempo;
        }

        public int tiempo(){
            return tiempo;
        }
    }

    public static void main(String[] args){
        TipoLavado lavadoSuper = TipoLavado.SUPER;
        System.out.println("El lavado " + lavadoSuper + " tarda " + lavadoSuper.tiempo());
    }

    
}
