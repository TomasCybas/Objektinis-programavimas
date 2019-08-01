package namudarbas15;

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

    public void print(Item root) {
        if (root!=null) {
            print(root.right);
            System.out.print(root.data+" ");
            print(root.left);
        }
    }

    public void print() {
        this.print(root);
    }

    public Item remove (Integer value, Item root) {
        if (root == null) return null;
        if (value < root.data){
            root.left = remove(value, root.left);
        }else {
            if(value > root.data){
                root.right = remove(value, root.right);
            } else {
                if (root.left == null){
                    return root.right;
                }else {
                    if(root.right == null){
                        return root.left;
                    }
                }
            }
            root.data = getMinValue(root.right);
            root.right = remove(root.data, root.right);
        }
        return root;
    }

    public int getMinValue (Item root){
        int minValue = root.data;
        while (root.left != null ){
            minValue = root.left.data;
            root = root.left;
        }
        return minValue;

    }


    public void remove (Integer value){
        root = remove(value, root);
        }

    }


