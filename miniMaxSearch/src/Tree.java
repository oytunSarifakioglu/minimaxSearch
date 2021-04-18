public class Tree {
    Node root;
    int layerNumber;


    public Tree() {
        this.root = new Node();
        this.layerNumber = 0;
    }

    public void addLayer(int layer) {
        addLayer(this.root, layer);
        this.layerNumber = layer;
    }

    private void addLayer(Node node, int counter) {
        node.addLayer();
        counter -= 1;

        if (counter > 0) {
            addLayer(node.firstNode, counter);
            addLayer(node.secondNode, counter);
            addLayer(node.thirdNode, counter);
            addLayer(node.fourthNode, counter);
            addLayer(node.fifthNode, counter);
        }

    }

    private void fill(Node node, int counter) {
        while (counter < layerNumber) {
            node.fillChildren();
            counter += 1;
            fill(node.firstNode, counter);
            fill(node.secondNode, counter);
            fill(node.thirdNode, counter);
            fill(node.fourthNode, counter);
            fill(node.fifthNode, counter);
        }

    }

    public void fill() {
        this.fill(root, 0);
    }

    public String getNode() {
        System.out.println("geldi");
        return getDetails("DETAILS:\n", this.root);

    }

    public String getDetails(String msg, Node node) {
        if (node != null) {
            msg += getAllChilds("", root);
        }
        return msg;
    }

    private String getAllChilds(String msg, Node node) {
        if (node != null) {
            msg += node.getData();
            if (node.hasChild()) {
                msg += getAllChilds("", node.firstNode);
                msg += getAllChilds("", node.secondNode);
                msg += getAllChilds("", node.thirdNode);
                msg += getAllChilds("", node.fourthNode);
                msg += getAllChilds("", node.fifthNode);
            }
        }

        return msg;
    }

}
