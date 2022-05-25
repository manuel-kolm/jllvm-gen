package com.jllvm.gen.misc;

import java.util.ArrayList;
import java.util.List;

public class KeyValueList<K, V> {
	private List<K> keys;
	private List<V> values;
	private int count = 0;

	public KeyValueList() {
		keys = new ArrayList<>();
		values = new ArrayList<>();
	}

	public KeyValueList(int initialCapacity) {
		keys = new ArrayList<>(initialCapacity);
		values = new ArrayList<>(initialCapacity);
	}

	public boolean add(K key, V value) {
		if (key == null || value == null) {
			return false;
		}

		if (!keys.add(key) || !values.add(value)) {
			return false;
		}

		++count;

		return true;
	}

	public boolean removeAt(int index) {
		if (index < 0 || index > count) {
			throw new IndexOutOfBoundsException();
		}

		return (keys.remove(index) == null || values.remove(index) == null);
	}

	public int count() {
		return count;
	}

	public K keyAt(int index) {
		return keys.get(index);
	}

	public V valueAt(int index) {
		return values.get(index);
	}
}
