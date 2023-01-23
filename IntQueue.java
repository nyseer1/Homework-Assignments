/**
 * IntQueue
 */
import java.util.ArrayList;
public class IntQueue {

    private ArrayList<Integer> list;

    public IntQueue(){
        list = new ArrayList<>();
    }
    public int getSize(){
        return list.size();
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }
    public void enqueue(int e){
        list.add(e);
    }
    public int dequeue(){
        int temp = list.get(0);
        list.remove(0);
        return temp;
    }
    public int peek(){
        return list.get(0);
    }

    public String toString(){
        // StringBuilder sb = new StringBuilder("[");
        // for(int i = 0; i < list.size(); i++){
        //     sb.append(list.get(i) + ", "); 
        // }
        // sb.delete(sb.length() - 2, sb.length());
        return list.toString();
    }
    public boolean equals(Object o){
        if(!(o instanceof IntQueue)){
            return false;
        }
        IntQueue temp = (IntQueue)o;
        return this.list.equals(temp.list);
    }

    

}