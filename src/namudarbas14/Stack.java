package namudarbas14;

public class Stack <T> {
    public Item<T> item = null;

    @Override
    public String toString() {
        Item <T> tmp = this.item;
        String result = "";
        while (tmp != null){
            result += tmp.data + " ";
            tmp = tmp.next;
        }
        return result;
    }

    public void push(T data){
        if(item == null){
            item = new Item<>(data);
        }else {
            Item<T> tmp = new Item<>(data);
            tmp.next = this.item;
            this.item = tmp;
        }
    }
    public T pop() {
        T data=item.data;
        item=item.next;
        return data;
    }
    public void remove (Integer index){
        if (index == 0){
            this.item = this.item.next;
        }else {
            Item <T> tmp = this.item;
            for (int i = 0; i < index - 1; i++){
                tmp = tmp.next;
            }
            System.out.println(tmp.data);

            tmp.next = tmp.next.next;
        }
    }

    public void add (Integer index, T data){
        if (index == 0) {
            this.push(data);
        }else {
            Item <T> tmp = this.item;
            for (int i = 0; i < index - 1; i++){
                tmp = tmp.next;
            }
            Item<T> newItem = new Item<>(data);

            newItem.next = tmp.next;
            tmp.next = newItem;

        }


    }
}
