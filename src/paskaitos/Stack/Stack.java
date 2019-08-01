package paskaitos.Stack;

public class Stack<T> {
    Item <T> d = null;

    public void push(T data){
        if(d == null){
            d = new Item<>(data);
        }else {
            Item<T> tmp = new Item<>(data);
            tmp.next = this.d;
            this.d = tmp;
}
    }
    public String toString() {
        Item <T> tmp = this.d;
        String result = "";
        while (tmp != null){
            result += " " + tmp.data;
            tmp = tmp.next;
        }
        return result;
    }



}
