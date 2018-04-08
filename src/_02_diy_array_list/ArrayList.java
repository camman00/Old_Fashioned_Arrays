package _02_diy_array_list;

public class ArrayList<T> {
	private T[] list;
	@SuppressWarnings("unchecked")
	public ArrayList() {
		list = (T[]) new Object[0];
	}
	@SuppressWarnings("unchecked")
	public void add(T t) {
		T[] tmp = (T[]) new Object[list.length + 1];
		for (int i = 0; i < list.length; i++) {
			tmp[i] = list[i];
		}
		tmp[tmp.length - 1] = t;
		list = tmp;
	}
	public T get(int index) {
		return list[index];
	}
	public void set(int index,T t) {
		list[index] = t;
	}
	@SuppressWarnings("unchecked")
	public void remove(int index) {
		T[] tmp = (T[]) new Object[list.length - 1];
		boolean passed = false;
		for (int i = 0; i < list.length; i++) {
			if(i != index && !passed) {
				tmp[i] = list[i];
			}
			else {
				if(i == index)
					passed = !passed;
				else {
					tmp[i - 1] = list[i];
				}
			}
		}
		list = tmp;
	}
	public boolean contains(T t) {
		for (T t2 : list) {
			if(t2 == t) {
				return true;
			}
		}
		return false;
	}
	@SuppressWarnings("unchecked")
	public void addAt(int index,T t) {
		T[] tmp = (T[]) new Object[list.length + 1];
		boolean passed = false;
		for (int i = 0; i < tmp.length; i++) {
			if(!passed && i != index) {
				tmp[i] = list[i];
			}
			else {
				if(i == index) {
					tmp[i] = t;
					passed = !passed;
				}
				else {
					tmp[i] = list[i - 1];
				}
			}
		}
		list = tmp;
	}
}
