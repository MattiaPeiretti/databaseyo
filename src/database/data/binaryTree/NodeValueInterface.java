package database.data.binaryTree;

public interface NodeValueInterface<T> {
    public T getValue();

    public boolean isMore(NodeValueInterface node);

    public boolean isLess(NodeValueInterface node);

    public void display();
}
