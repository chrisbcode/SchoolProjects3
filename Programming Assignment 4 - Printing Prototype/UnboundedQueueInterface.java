public interface UnboundedQueueInterface<E> extends QueueInterface<E>
{
    @Override
    public abstract void enqueue(E item);

    public abstract int size();

    @Override
    public abstract String toString();
}
