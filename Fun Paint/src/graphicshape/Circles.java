package graphicshape;

/**
 * Created by Avi on 27.7.2016.
 */
public class Circles {
    void getArea(){
        Circle cirfle=new Circle(7);
        //call to public methodes within packege

        double a=cirfle.area();
        //call defulta method

        //access protected field within package
        System.out.println(cirfle.color);


        //System.out.println(cirfle.radius);


    }
}
