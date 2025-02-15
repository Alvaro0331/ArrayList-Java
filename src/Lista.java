
import java.util.ArrayList;

public class Lista {
    private ArrayList<Nodo> list;
    
    /*Constructor*/
    public Lista(ArrayList<Nodo> list){
        this.list=list;
    }
    
    public void agregarLista(Nodo nodo){
        this.list.add(nodo);
    }
    
    public ArrayList<Nodo> getActualizar(){
        return this.list;
    }
    
    public Nodo Buscar(Nodo nodo){
        Nodo aux=null;
        
        /*Recorrer la lista*/
        for(Nodo n:this.list){
            if(nodo.getID()==n.getID()){
                aux=new Nodo();
                aux.setID((n.getID()));
                aux.setNombre(n.getNombre());
            }
        }
        return aux;
    }
    
    public void editar(){
        
    }
    public void remover(){
        
    }
    
    public int getNuevoId(){
        return this.list.size()+1;
    }
}
