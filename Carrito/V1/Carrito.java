public class Carrito{
    String articulo;
    float precio;
    
    public Carrito(String articulo, float precio){
        this.articulo = articulo;
        this.precio = precio;
    }

    public void contenido(){
        System.out.println(articulo+" "+precio+"$");
    }

}