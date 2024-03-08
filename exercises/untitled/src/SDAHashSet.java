import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SDAHashSet<E> implements Set<E> {
    //Implement the SDAHashSet<E> class that will implement the HashSet<E> logic.
    // It should support methods:
    //• add
    //• remove
    //• size
    //• contains
    //• clear
    private final HashSet<E> hashSet;

    public SDAHashSet(HashSet<E> hashSet) {
        this.hashSet = hashSet;
    }


    @Override
    public int size() {
        return hashSet.size();
    }

    @Override
    public boolean isEmpty() {
        return hashSet.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return hashSet.contains(o);
    }

    @Override
    public Iterator<E> iterator() {
        return hashSet.iterator();
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return hashSet.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return hashSet.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }
}
