package yyf.java.util.Map.model;

/**
 * Map的仿造
 * 
 * @author yuyufeng
 *
 * @param <K>
 * @param <V>
 */
public class MyMap<K, V> {
	static final int ARRAYMAX = 10;

	/**
	 * 构造函数初始化数组
	 */
	public MyMap() {
		table = new Node[ARRAYMAX];
	}

	/**
	 * 数组
	 */
	Node<K, V>[] table;

	/**
	 * 获取key的hash值
	 * 
	 * @param key
	 * @return
	 */
	static final int hash(Object key) {
		int h;
		return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
	}

	/**
	 * 根据key获取value
	 * 
	 * @param key
	 * @return
	 */
	public V get(Object key) {
		int index = hash(key) % ARRAYMAX;
		Node<K, V> p = table[index];
		while (p != null) {
			if (p.key.equals(key)) {
				break;
			}
			p = p.next;
		}
		if (p == null) {
			return null;
		}
		return p.value;
	}

	/**
	 * put key-vlaue
	 * 
	 * @param key
	 * @param value
	 */
	public void put(K key, V value) {
		Node<K, V> p, q;
		int index = hash(key) % ARRAYMAX;
		if (table[index] == null) {
			table[index] = new Node(hash(key), key, value, null);
		} else {
			q = table[index];
			p = q.next;
			boolean flag = true;
			while (p != null) {
				// 如果已经存在，则覆盖
				if (key.equals(p.key)) {
					flag = false;
					p.value = value;
					break;
				}
				q = p;
				p = p.next;
			}

			if (flag) {
				p = new Node(hash(key), key, value, null);
				q.next = p;
			}

		}
	}

	/**
	 * 打印所有key-value
	 */
	public void printKVs() {
		Node<K, V> p;
		for (int i = 0; i < ARRAYMAX; i++) {
			p = table[i];
			System.out.println("[table] " + i + " ->");
			while (p != null) {
				System.out.println(p.key + " " + p.value);
				p = p.next;
			}
		}
	}

	/**
	 * 删除key-value
	 * 
	 * @param key
	 * @return
	 */
	public V remove(Object key) {
		return null;
	}

}

class Node<K, V> {
	int hash;
	K key;
	V value;
	Node<K, V> next;

	public Node() {

	}

	public Node(int hash, K key, V value, Node<K, V> next) {
		this.hash = hash;
		this.key = key;
		this.value = value;
		this.next = next;
	}

}