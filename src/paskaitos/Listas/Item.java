package paskaitos.Listas;

public class Item<T>{
    public T data;

    public Item<T> next = null;

    public Item(T data){
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
