
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
        for(Nodo n:list){
            if(nodo.getID()==n.getID()){
                aux=new Nodo();
                aux.setID((n.getID()));
                aux.setNombre(n.getNombre());
                aux.setPeso(n.getPeso());
                break;
            }
        }
        return aux;
    }
    
    public void editar(int id,String nNombre,double peso){
        for(Nodo n : list){
            if(n.getID()==id){
                n.setNombre(nNombre);
                n.setPeso(peso);
                return;
            }
        }
    }
    public void remover(){
        
    }
    
    public int getNuevoId(){
        return this.list.size()+1;
    }
}
