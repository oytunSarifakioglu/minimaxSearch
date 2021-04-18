import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Node {
    int value;
    Node firstNode;
    Node secondNode;
    Node thirdNode;
    Node fourthNode;
    Node fifthNode;
    Random random = new Random();
    private Object Integer;

    public boolean hasChild() {
        return this.firstNode != null && this.secondNode != null &&
                this.thirdNode != null && this.fourthNode != null && this.fifthNode != null;
    }

    public void addLayer() {
        value = 0;
        this.firstNode = new Node();
        this.secondNode = new Node();
        this.thirdNode = new Node();
        this.fourthNode = new Node();
        this.fifthNode = new Node();
    }

    public void fillChildren() {
        this.firstNode.value = random.nextInt(1000) + 1;
        this.secondNode.value = random.nextInt(1000) + 1;
        this.thirdNode.value = random.nextInt(1000) + 1;
        this.fourthNode.value = random.nextInt(1000) + 1;
        this.fifthNode.value = random.nextInt(1000) + 1;
    }

    public ArrayList<Integer> getChilds(){
        if(hasChild()) {
            ArrayList<Integer> listOfChild = new ArrayList<>();
            listOfChild.add(this.firstNode.value);
            listOfChild.add(this.secondNode.value);
            listOfChild.add(this.thirdNode.value);
            listOfChild.add(this.fourthNode.value);
            listOfChild.add(this.fifthNode.value);
            return listOfChild;
        }
        else{
            return new ArrayList<>();
        }
    }

    public Node getChild(int index){
        switch(index){
            case 0: return firstNode;
            case 1: return secondNode;
            case 2: return thirdNode;
            case 3: return fourthNode;
            case 4: return fifthNode;
            default: return new Node();
   }
    }

    public String getData(){
        if(hasChild()) {
            return String.format("this : %d ::::1.:%d 2.:%d 3.:%d 4.:%d 5.:%d\n", value, firstNode.value, secondNode.value,
                    thirdNode.value, fourthNode.value, fifthNode.value);
        }
        else {
            return String.format("this: %d :::: 1.: null 2.:null 3.:null 4.:null 5.:null\n", value);
        }
    }
}
