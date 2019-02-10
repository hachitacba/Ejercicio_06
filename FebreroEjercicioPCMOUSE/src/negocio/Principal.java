
package negocio;

public class Principal {

    public static void main(String[] args) {
        
        Mouse m1,m2,m3;
        m1=new Mouse(1,true,100);
        m2=new Mouse(2,true,150);
        m3=new Mouse(2,false,120);
        
        System.out.println(m1.todosLosDatos());
        System.out.println(m2.todosLosDatos());
        System.out.println(m3.todosLosDatos());
        
        Pc p1,p2,p3,p4,p5;
        p1=new Pc("PC escritorio Acer blanca",1,500,4,7900,m1);
        p2=new Pc("Notebook Bangho negra",1,1024,4,12000);
        p3=new Pc("PC escritorio compacta negra",1,1024,6,11000,m2);
        p4=new Pc("PC escritorio basica blanca",1,500,2,6000,m3);
        p5=new Pc("Notebook HP i7 para diseño",2,2048,8,24000);
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(p5.toString());
        
        System.out.println(p1.todosLosDatos());
        System.out.println(p2.todosLosDatos());
        System.out.println(p3.todosLosDatos());
        System.out.println(p4.todosLosDatos());
        System.out.println(p5.todosLosDatos());
    }
    
}
