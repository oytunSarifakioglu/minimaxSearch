import java.util.ArrayList;

public class GameBot {
    private int score;

    public GameBot(){
        this.score = 0;
    }

    public Node move(Node node){
        int choosenNode = -1;
        int  maxValue = 0;
        ArrayList<Integer> childList = node.getChilds();
        for (int i = 0; i<5; i++){
            if (childList.get(i) > maxValue){
                maxValue = childList.get(i);
                choosenNode = i;
            }
        }
        score += maxValue;
        return node.getChild(choosenNode);
    }

    public int getScore(){
        return this.score;
    }
}
