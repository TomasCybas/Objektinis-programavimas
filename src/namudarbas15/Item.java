package namudarbas15;

public class Item {
    public Integer data;
    Item left = null;
    Item right = null;
    int count = 1;

    public Item(Integer data){
        this.data = data;
    }
}
