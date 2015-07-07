class ListIndexOutOfBoundsException extends IndexOutOfBoundsException {
    public ListIndexOutOfBoundsException(){ }
    public ListIndexOutOfBoundsException(String msg){ super(msg); }
}

class Cell {
    private Object value;
    private Cell link;

    Cell(Object obj, Cell next){
        value = obj;
        link = next;
    }

    Object get_value(){ return value; }
    Cell get_link(){ return link; }
    void set_value(Object obj){ value = obj; }
    void set_link(Cell next){ link = next; }
}

class MyList {

    private Cell head;
    private int  size;

    MyList(){
        head = new Cell(null, null);
        size = 0;
    }

    private Cell count(int n){
        int i = -1;
        Cell next = head;
        while(next != null){
            if(n == i) return next;
            i++;
            next = next.get_link();
        }
        throw new ListIndexOutOfBoundsException("Linked_List");
    }

    public Object get(int n){
        Cell next = count(n);
        return next.get_value();
    }

    public void add(Object obj){
        this.add(size, obj);;
    }

    public void add(int n, Object obj){
        Cell next = count(n-1);
        Cell next1 = new Cell(obj, next.get_link());
        next.set_link(next1);
        size++;
    }

    public int size(){
        return size;
    }

}

public class list {
    public static void main(String[] args){
        MyList ls = new MyList();
        ls.add("aaa");
        ls.add(111);
        ls.add(222);
        ls.add(333);
        ls.add(1234);
        for(int i = 0; i < 5; i++){
            System.out.print(ls.get(i) + " ");
        }
        System.out.println(ls.size());
    }
}