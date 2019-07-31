package namudarbas14;

public class Stack <T> {
    public Item<T> item = null;

    public void push(T data){
        if(item == null){
            item = new Item<>(data);
        }else {
            Item<T> tmp = new Item<>(data);
            tmp.next = this.item;
            this.item = tmp;
        }
    }
}
