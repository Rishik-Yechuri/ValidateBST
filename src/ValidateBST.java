public class ValidateBST {
    public static void main(String[] args) {
        try{
            ValidateBST obj = new ValidateBST();
            obj.run(args);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void run(String[] args){
        //Creating dataset(Tree)
        Node node = new Node(14);
        node.leftNode = new Node(6);
        node.leftNode.leftNode = new Node(3);
        node.leftNode.leftNode.leftNode = new Node(1);
        node.leftNode.leftNode.rightNode = new Node(5);
        node.leftNode.rightNode = new Node(8);
        node.leftNode.rightNode.leftNode = new Node(7);
        node.leftNode.rightNode.rightNode = new Node(11);
        node.rightNode = new Node(21);
        node.rightNode.leftNode = new Node(18);
        node.rightNode.rightNode = new Node(25);
        node.rightNode.leftNode.leftNode = new Node(15);
        node.rightNode.leftNode.rightNode = new Node(19);
        node.rightNode.rightNode.leftNode = new Node(24);
        node.rightNode.rightNode.rightNode = new Node(27);
        //Prints value
        System.out.println(checkIfBST(node,Integer.MIN_VALUE,Integer.MAX_VALUE));
        node.rightNode.leftNode.leftNode = new Node(12);
        System.out.println(checkIfBST(node,Integer.MIN_VALUE,Integer.MAX_VALUE));
    }
    public boolean checkIfBST(Node curr,int lowLimit,int highLimit){
        if(curr.num < lowLimit || curr.num > highLimit){
            return false;
        }
        boolean isBST = true;
        if(curr.leftNode != null){
            if(!checkIfBST(curr.leftNode,lowLimit,curr.num)){
                return false;
            }
        }
        if(curr.rightNode != null){
            if(!checkIfBST(curr.rightNode,curr.num,highLimit)){
                return false;
            }
        }
        return true;
    }
}
class Node {
    public int num;
    public Node leftNode;
    public Node rightNode;
    public Node(){}
    public Node(int num){
        this.num = num;
    }
    public Node(int num,Node leftNode,Node rightNode){
        this.num = num;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }
}