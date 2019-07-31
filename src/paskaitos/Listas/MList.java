package paskaitos.Listas;

public class MList<T>{
    Item <T> p = null; //pradzia
    Item <T> q = null; //pabaiga


    public void add (T data){
        if (q == null){
            q = new Item<>(data);
            if (p == null) p = q;
        }else {
            q.next = new Item<>(data);
            q = q.next;
        }
    }

    public T get (){
        if (p == null) return null;
        T tmp = p.data;
        p = p.next;
        if(p == null) q = null;
        return tmp;
    }

    public T get(int index) {
        if (p == null) return null;
        Item<T> tmp = p;
        for(int i = 0; i < index; i++){
            tmp = tmp.next;
            if(tmp == null) return null;

        }
        return tmp.data;
    }

    public void remove (int index) {
        if (index == 0) {
            p = p.next;
            if(p == null) q = null;

        } else {
            Item<T> tmp = p;
            for (int i = 0; i < index - 1; i++) {
                tmp = tmp.next;
            }
            if (tmp.next.next == null){
                q = tmp;
            }
            tmp.next = tmp.next.next;
        }
    }

}
