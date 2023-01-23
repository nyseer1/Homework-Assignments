import java.util.ArrayList;
public class UniqueIntegerList extends ArrayList<Integer>{

    public UniqueIntegerList(){
    }

    @Override
    public boolean add(Integer e){
        for(int i = 0; i < super.size(); i++){
            if(super.get(i) == e){
                return false;
            }
        }
        super.add(e);
        return true;
    }
    @Override
    public void add(int index, Integer e){
        boolean found = false;
        for(int i = 0; i < super.size(); i++){
            if(super.get(i) == e){
                found = true;
            }
        }
        if(!(found)){
            super.add(index, e);}
    }
    @Override
    public Integer set(int index, Integer e){
        boolean found = false;
        for(int i = 0; i < super.size(); i++){
            if(super.get(i) == e){
                found = true;
            }
        }
        if(!(found)){
            int temp = super.get(index);
            super.set(index, e);
            return temp;
        }
        return super.get(index);
    }
    public double average(){
        double sum = 0.0;
        for(int i = 0; i < super.size(); i++){
            sum+= super.get(i);
        }
        return sum / super.size();
    }
}
