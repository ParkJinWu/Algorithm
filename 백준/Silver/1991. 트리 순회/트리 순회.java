import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

// 트리 순회
// 루트는 항상 A
public class Main {

    static class Node{
        char value;
        Node left;
        Node right;

        Node(char value){
            this.value = value;
        }
    }

    // 전위 순회 root -> left -> right
    public static void preOrder(Node node){
        if(node != null){
            System.out.print(node.value);
            preOrder(node.left);
            preOrder(node.right);
        }

    }
    // 중위 순회 left -> root -> right
    public static void inOrder(Node node){
        if(node != null){
            inOrder(node.left);
            System.out.print(node.value);
            inOrder(node.right);
        }
    }
    // 후위 순회 left -> right -> root
    public static void postOrder(Node node){
        if(node != null){
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.value);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Map<Character,Node> tree = new HashMap<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer token = new StringTokenizer(br.readLine());

            // 부모
            char parents = token.nextToken().charAt(0);
            // 왼쪽 자식 노드
            char left = token.nextToken().charAt(0);
            // 오른쪽 자식 노드
            char right = token.nextToken().charAt(0);

            // 노드 생성 및 연결
            tree.putIfAbsent(parents,new Node(parents));

            if(left != '.'){
                tree.putIfAbsent(left, new Node(left));
                tree.get(parents).left = tree.get(left);
            }

            if(right != '.'){
                tree.putIfAbsent(right,new Node(right));
                tree.get(parents).right = tree.get(right);
            }
        }

        Node root = tree.get('A'); // 루트는 항상 A
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
    }
}
