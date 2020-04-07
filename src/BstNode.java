public class BstNode {
    private BstNode left;
    private BstNode right;
    private Integer value;

    public BstNode(Integer value) {
        this.value = value;
    }

    public BstNode getLeft() {
        return left;
    }

    public void setLeft(BstNode left) {
        this.left = left;
    }

    public BstNode getRight() {
        return right;
    }

    public void setRight(BstNode right) {
        this.right = right;
    }

    public Integer getValue() {
        return value;
    }

}
