
package negocio;

public class Mouse {
    private int tipoMouse;//Representa en forma numérica el tipo de mouse, 1: mouse óptico, 2: mouse inalámbrico.
    private boolean importado;//true si lo es o false si NO lo es.
    private float importeBase;//precio base del mouse
    
    public Mouse(float ib)
    {
    tipoMouse=1;
    importado=false;
    importeBase=ib;  
    }
    public Mouse(int tipo, boolean imp, float ib)
    {
        if(tipo!=1 && tipo!=2)
            tipoMouse=1;
        else 
            tipoMouse=tipo;
        importado=imp;
        importeBase=ib;
    }
    public int getTipoMouse() 
    {
        return tipoMouse;
    }
    public boolean isImportado() 
    {
        return importado;
    }
    public float getImporteBase() 
    {
        return importeBase;
    }
    public void setTipoMouse(int tm) 
    {
        if(tm!=1 && tm!=2)
            tipoMouse=1;
        else 
            tipoMouse=tm;
    }
    public void setImportado(boolean imp) 
    {
        importado=imp;
    }
    public void setImporteBase(float ib) 
    {
        importeBase=ib;
    }
    public String detalleTipoMouse()
    {
    String tm="NO DECLARADO";
        if(tipoMouse==1)
            tm="Optico";
            else
                tm="Inalambrico";
        return tm;
    }
    public String detalleImportado()
    {
        String imp="no importado";
        if(importado)
            imp="importado";
        return imp;
    }
    public String toString()
    {
        return "Tipo de mouse: "+detalleTipoMouse()+", Origen: "+detalleImportado()+", Importe base: $ "+importeBase;
    }
    public float adicionalTipoMouse()
    {
        float extraTm=150f;
        if(tipoMouse==2)
            extraTm=250f;
        return extraTm;
    }
    public float adicionalImportado()
    {
        float extraImp=0f;
        if(importado)
            extraImp=(importeBase+adicionalTipoMouse())*0.10f;
        return extraImp;
    }
    public float precioTotal()
    {
        return importeBase+adicionalTipoMouse()+adicionalImportado();
    }
    public String todosLosDatos()
    {
        return toString()+", Precio Final mouse: $ "+precioTotal();
    }
    
    
}
