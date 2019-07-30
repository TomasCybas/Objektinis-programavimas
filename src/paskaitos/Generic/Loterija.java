package paskaitos.Generic;

public class Loterija<T extends ID> {

    T [] data;

    public Loterija (){

    }

    public T getWinner(){
       int id = (int)(Math.random())*4;
       return data[id];
    }

    public int getWinnerId() {
        int index = (int)(Math.random()*4);
        return data[index].getId();
    }
}
