import java.util.ArrayList;
import java.util.Iterator;

public class MyArrayList<E> implements MyList<E> {

	private int size;
	private E[] myArray;
	private static final int SC = 10;

	public MyArrayList() {
		myArray = (E[]) new Object[SC];
		size = 0;
	}

	@Override
	public int size() {

		return size;
	}

	@Override
	public boolean isEmpty() {

		return size == 0;
	}

	@Override
	public E get(int index) throws IndexOutOfBoundsException {
		if(index < 0 || index > size)
			throw new IndexOutOfBoundsException("Invalid index: " + index);

		return myArray[index];
	}

	@Override
	public void removeAllKey(E key) {
		if(this.contains(key)){
			for (int i = 0; i < myArray.length; i++) {
				if(myArray[i] == key){
					for (int j = i; j < myArray.length -1; j++) {
						myArray[j] = myArray[j + 1];
					}
					myArray[myArray.length - 1] = null;
					size--;
				}
			}
		}		
	}

	@Override
	public void add(E e) {
		if(size == myArray.length){
			changeThisCapacity(5);
		}
		myArray[size] = e;
		size++;
	}

	public boolean contains(E e){
		for (E x : myArray){
			if(x.equals(e))
				return true;
		}
		return false;
	}

	private void changeThisCapacity(int delta){
		E[] elements = (E[]) new Object[myArray.length + delta];

		for (int i = 0; i < size; i++) {
			elements[i] = myArray[i];
			myArray[i] = null;
		}

		myArray = elements;
	}

	public void printSize(){

		System.out.println(size);

	}
}
