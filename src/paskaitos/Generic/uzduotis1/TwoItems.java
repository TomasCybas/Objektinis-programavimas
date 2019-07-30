package paskaitos.Generic.uzduotis1;

public class TwoItems<T, N> {

    T firstItem;
    N secondItem;

    public TwoItems(T firstItem, N secondItem) {
        this.firstItem = firstItem;
        this.secondItem = secondItem;
    }

    public T getFirstItem() {
        return firstItem;
    }

    public void setFirstItem(T firstItem) {
        this.firstItem = firstItem;
    }

    public N getSecondItem() {
        return secondItem;
    }

    public void setSecondItem(N secondItem) {
        this.secondItem = secondItem;
    }
}
