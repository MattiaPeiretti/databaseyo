package database.data.binaryTree;

public class NodeValueInt implements NodeValueInterface {
    int value;

    NodeValueInt(int value) {
        this.value = value;
    }

    @Override
    public boolean isMore(NodeValueInterface node) {
        return this.value < node.value;
    }

    @Override
    public boolean isLess(NodeValueInterface node) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isLess'");
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'display'");
    }

    @Override
    public Object getValue() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getValue'");
    }

}
