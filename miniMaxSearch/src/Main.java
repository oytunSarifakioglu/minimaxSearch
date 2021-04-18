import java.util.Scanner;

public class Main {
    public static void main(String[]args) {


        Tree tree = new Tree();

        tree.addLayer(4);
        tree.fill();
        System.out.println(tree.getNode());
        System.out.println("--------");

        int user = 0;
        int program = 0;
        int toplamhamlemiktari = 0;
        GameBot gameBot = new GameBot();
        Scanner input=new Scanner(System.in);
        Node currentNode = tree.root;
        while ( toplamhamlemiktari < 4 ) {
            currentNode = gameBot.move(currentNode);

            System.out.println("Yapılan hamlenin puanı : " + currentNode.value);
            toplamhamlemiktari ++;

            System.out.println(currentNode.getData());
            System.out.println("Hamlenizi yapınız: ");
            int hamle = input.nextInt()-1;
            currentNode = currentNode.getChild(hamle);
            System.out.println("Yapılan hamlenin puanı : " + currentNode.value);
            user = user + currentNode.value;
            toplamhamlemiktari ++;

        }
        System.out.println("Programın puanı : " + gameBot.getScore());
        System.out.println("Kullanıcının puanı : " + user);

        if (gameBot.getScore() <user){
            System.out.println("!!!KAZANDINIZ!!!");
        }
        else if (user<gameBot.getScore()){
            System.out.println("kaybettiniz.");

        }
        else{
            System.out.println("Sonuç berabere.");
        }


    }



}