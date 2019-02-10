
package negocio;

public class Pc {
    private String descripcion;
    private int tipoDisco;//1 Significara disco duro y 2 disco solido.
    private int tamañoDisco;//Cantidad enterade GB de capacidad de disco.
    private int memoriaRam;//Cantidad entera de GB de memoria RAM
    private float precioBase;//Precio segun procesador demás componentes que tenga, sin incluir disco, memoria RAM, ni mouse.
    private Mouse mouse;
    
    public Pc(String desc, int td, int tamD, int cantMR, float pb)
    {
        descripcion=desc;
        tipoDisco=td;
        tamañoDisco=tamD;
        memoriaRam=cantMR;
        precioBase=pb;
        mouse=null;
    }
    public Pc(String desc, int td, int tamD, int cantMR, float pb, Mouse m)
    {
        descripcion=desc;
        tipoDisco=td;
        tamañoDisco=tamD;
        memoriaRam=cantMR;
        precioBase=pb;
        mouse=m;
    }
    public void setDescripcion(String d)
    {
        descripcion=d;
    }
    public void setTipoDisco(int td)
    {
        if(td==1||td==2)
            tipoDisco=td;            
    }
    public void setTamañoDisco(int t)
    {
        tamañoDisco=t;
    }
    public void setMemoriaRam(int mr)
    {
        memoriaRam=mr;
    }
    public void setPrecioBase(float p)
    {
        precioBase=p;
    }
    public void setMouse(Mouse m)
    {
        mouse=m;
    }
    public String getDescripcion()
    {
        return descripcion;
    }
    public int getTipoDisco()
    {
        return tipoDisco;
    }
    public int getTamañoDisco()
    {
        return tamañoDisco;
    }
    public int getMemoriaRam()
    {
        return memoriaRam;
    }
    public float getPrecioBase()
    {
        return precioBase;
    }
    public String tipoDisco()
    {
        String aux;//="Error carga tipo de disco";
        /*if(tipoDisco==1)
            aux="Disco duro";
        else
            if(tipoDisco==2)
            aux="Disco solido";*/

        switch(tipoDisco)
        {
            case 1: aux="Disco duro"; break;
            case 2: aux="Disco solido"; break;
            default: aux="Disco solido";break;
        }
        return aux;   
    }
    public boolean tieneMouse()
    {
        if(mouse!=null)
            return true;
        else
            return false;
    }
    public String descripMouse()
    {
        if(mouse!=null)
            return mouse.toString();
        else
            return "No tiene mouse";
    }
    public String toString()
    {
        return "\nDescripcion PC:\n"+descripcion+"\n"+tipoDisco()+" "+tamañoDisco+"GB, Memoria RAM "+memoriaRam+"GB, Precio Base: $"+precioBase+"\nMouse: "+descripMouse();
    }
    public float precioAdicionalPorDisco()
    {
        if(tipoDisco==1)
            return 10f*tamañoDisco;
        if(tipoDisco==2)
            return 25f*tamañoDisco;
        else
            return 0f;
    }
    public float precioAdicionalPorRam()
    {
        return 15f*memoriaRam;
    }
    public float precioAdicionalPorMouse()
    {
        if(mouse!=null)
            return mouse.precioTotal();
        else
            return 0;
    }
    public float precioFinal()
    {
        return precioBase+precioAdicionalPorDisco()+precioAdicionalPorRam()+precioAdicionalPorMouse();
    }
    public String todosLosDatos()
    {
        return "\n"+toString()+"\nPrecio final de la PC: $"+precioFinal();
    }
            
   
    
    
}
