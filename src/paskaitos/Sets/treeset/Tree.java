package paskaitos.Sets.treeset;

public class Tree {
    Item root = null;


    public Item add(Integer data, Item root){
       if (root == null){
           return new Item(data);
       }
       if (root.data > data){
           root.left = add(data, root.left);
       }else {
           root.right = add(data, root.right);
       }
       return root;
    }

    public void add (Integer data){
        this.root = this.add(data, this.root);
    }
}
