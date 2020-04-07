public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insertToBst(10);
        bst.insertToBst(1);
        bst.insertToBst(6);
        bst.insertToBst(8);
        bst.insertToBst(13);
        bst.insertToBst(4);
        bst.insertToBst(20);
        bst.insertToBst(2);
        bst.insertToBst(7);
        bst.insertToBst(5);

        bst.findValueInBst(bst.getRoot(),50);
        bst.displayResult();
    }

}
