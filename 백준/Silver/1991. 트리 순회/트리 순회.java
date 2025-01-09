import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

// 트리 순회
public class Main {
    public static class Node{
        char value;
        Node left;
        Node right;

        Node(char value){
            this.value = value;
        }
    }

    // 전위 순회 : root > left > right
    public static void preOrder(Node node){
        if(node == null) return;
        System.out.print(node.value);
        preOrder(node.left);
        preOrder(node.right);
    }
    // 중위 순회 : left > root > right
    public static void inOrder(Node node){
        if(node == null) return;
        inOrder(node.left);
        System.out.print(node.value);
        inOrder(node.right);
    }
    // 후위 순회 : left > right > root
    public static void postOrder(Node node){
        if(node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value);
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token;
        Map<Character,Node> tree = new HashMap<>(); // 노드 저장용
        
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            token = new StringTokenizer(br.readLine());

            char parents = token.nextToken().charAt(0); // 부모 노드
            char left = token.nextToken().charAt(0); // 왼쪽 자식 노드
            char right = token.nextToken().charAt(0); // 오른쪽 자식 노드

            // 루트 노드 생성
            tree.putIfAbsent(parents, new Node(parents));

            // 왼쪽 자식 노드가 있다면 생성 후 연결
            if(left != '.'){
                tree.putIfAbsent(left,new Node(left));
                tree.get(parents).left = tree.get(left);
            }

            // 오른쪽 자식 노드가 있다면 생성 후 연결
            if(right != '.'){
                tree.putIfAbsent(right,new Node(right));
                tree.get(parents).right = tree.get(right);
            }
        }

        Node A = tree.get('A'); // 노드의 시작은 항상 A
        preOrder(A);
        System.out.println();
        inOrder(A);
        System.out.println();
        postOrder(A);



    }
}
