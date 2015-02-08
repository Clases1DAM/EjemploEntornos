/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenev1;

/**
 *
 * @author Felix
 */
public class CronometroHilo extends Thread{
    
    private JCronometro cr;
    private int hora = 0;//unidades de medida
    private int min = 0;//unidades de medida
    private int seg = 0;//unidades de medida
    private int ds = 0;//unidades de medida
    
    public CronometroHilo(JCronometro c)
    {
        cr=c;
    }
    public void run() {
            try {
                while (true) {//ciclo infinito
                    if (getDs() == 99) {//si los decisegundos son iguales a 99
                        setDs(0);//decisegundo vuelve a empezar en cero
                        setSeg(getSeg() + 1);//y aumenta un segundo
                    }
                    if (getSeg() == 59) {//si los segundos son iguales a 59
                        setSeg(0);//segundo vuelve a empezar en cero
                        setMin(getMin() + 1);//y aumenta un minuto
                    }
                    if (getMin() == 59) {//si los minutos son iguales a 59
                        setMin(0);//minuto vuelve a empezar en cero
                        setHora(getHora() + 1);//y aumenta una hora
                    }
                    setDs(getDs() + 1);//aumentan las decimas de segundo
                    String tiempo = (getHora()<=9?"0":"")+getHora()+":"+(getMin()<=9?"0":"")+getMin()+":"+(getSeg()<=9?"0":"")+getSeg()+":"+(getDs()<=9?"0":"")+getDs();
                    cr.getjDisplay().setText(tiempo);
                    Thread.sleep(10);//que duerma una decima de segundo
                    System.out.println(tiempo);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    /**
     * @return the hora
     */
    public int getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(int hora) {
        this.hora = hora;
    }

    /**
     * @return the min
     */
    public int getMin() {
        return min;
    }

    /**
     * @param min the min to set
     */
    public void setMin(int min) {
        this.min = min;
    }

    /**
     * @return the seg
     */
    public int getSeg() {
        return seg;
    }

    /**
     * @param seg the seg to set
     */
    public void setSeg(int seg) {
        this.seg = seg;
    }

    /**
     * @return the ds
     */
    public int getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(int ds) {
        this.ds = ds;
    }
    
}
