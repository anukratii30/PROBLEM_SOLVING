package TRIES_1;

public class Implement_Trie_Prefix_Tree {
	
	class Trie {
		Node root;

		public Trie() {
			root = new Node();
		}

		public void insert(String word) {
			Node curr = root;
			int n = word.length();
			for (int i = 0; i < n; i++) {
				int index = word.charAt(i) - 'a';
				if (curr.children[index] == null) {
					curr.children[index] = new Node();
				}
				if (i == n - 1) {
					curr.children[index].eow = true;
				}
				curr = curr.children[index];
			}

		}

		public boolean search(String word) {
			Node curr = root;
			int n = word.length();
			for (int i = 0; i < n; i++) {
				int index = word.charAt(i) - 'a';
				if (curr.children[index] == null) {
					return false;
				}

				if (i == n - 1) {
					return curr.children[index].eow;
				}
				curr = curr.children[index];
			}
			return false;
		}

		public boolean startsWith(String prefix) {
			Node curr = root;
			int n = prefix.length();
			for (int i = 0; i < n; i++) {
				int index = prefix.charAt(i) - 'a';
				if (curr.children[index] == null) {
					return false;
				}

				curr = curr.children[index];
			}
			return true;
		}
	}

	class Node {
		Node children[];
		boolean eow;

		Node() {
			children = new Node[26];
			for (Node e : children) {
				e = null;
			}
			eow = false;
		}

	}
}
