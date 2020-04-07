public class BinarySearchTree {
    private BstNode root;

    public boolean isEmpty() {
        return (this.root == null);
    }

    public BstNode getRoot() {
        return root;
    }

    public void insertToBst(Integer value) {
        if (isEmpty()) {
            this.root = new BstNode(value);
        } else {
            insertNode(this.root, value);
        }
        System.out.println("Insert successfully!");
    }

    public BstNode insertNode(BstNode root, Integer value) {
        BstNode temp;
        Integer rootValue = root.getValue();

        if (value <= rootValue) {
            if (root.getLeft() == null) {
                root.setLeft(new BstNode(value));
                return root.getLeft();
            } else {
                temp = root.getLeft();
            }
        } else {
            if (root.getRight() == null) {
                root.setRight(new BstNode(value));
                return root.getRight();
            } else {
                temp = root.getRight();
            }
        }
        return insertNode(temp, value);
    }

    private int levelOfNeedFindValue = 0;
    private boolean isExistInBst = false;

    public void findValueInBst(BstNode root, Integer value) {
        if (isEmpty()) {
            System.out.println("Empty Tree");
        } else if (root.getValue().equals(value)) {
            isExistInBst = true;
        } else if (value < root.getValue()) {
            levelOfNeedFindValue++;
            findValueInBst(root.getLeft(), value);
        } else {
            levelOfNeedFindValue++;
            findValueInBst(root.getRight(), value);
        }
    }

    public void displayResult() {
        if (!isEmpty()) {
            if (isExistInBst) {
                System.out.println("Gia tri can tim co trong Cay, " +
                        "level : " + levelOfNeedFindValue);
            } else {
                System.out.println("Gia tri can tim khong co");
            }
        }
    }
}
