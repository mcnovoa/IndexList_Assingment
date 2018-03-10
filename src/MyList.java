
public interface MyList<E> {
	int size(); 
	boolean isEmpty();
	E get(int index) throws IndexOutOfBoundsException;
	void removeAllKey(E key) throws IndexOutOfBoundsException;
	void add(E e);
}
