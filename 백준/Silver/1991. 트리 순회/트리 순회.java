import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

// 트리 순회
public class Main {
    static class Node{
        char node;
        Node left;
        Node right;

        Node(char node, Node left, Node right){
            this.node = node;
            this.left = left;
            this.right = right;
        }
    }

    // 전위 순회 -> (루트) (왼쪽 자식) (오른쪽 자식)
    public static void preOrder(Node node){
        if(node != null){
            System.out.print(node.node);
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    // 중위 순회 -> (왼쪽 자식) (루트) (오른쪽 자식)
    public static void inOrder(Node node){
        if(node != null){
            inOrder(node.left);
            System.out.print(node.node);
            inOrder(node.right);
        }
    }

    // 후위 순회 -> (왼쪽 자식) (오른쪽 자식) (루트)
    public static void postOrder(Node node){
        if(node != null){
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.node);
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Map<Character,Node> tree = new HashMap<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer token = new StringTokenizer(br.readLine());

            // 루트
            char parents = token.nextToken().charAt(0);

            // 왼쪽 자식
            char left = token.nextToken().charAt(0);

            // 오른쪽 자식
            char right = token.nextToken().charAt(0);

            if(!tree.containsKey(parents)){
                tree.put(parents,new Node(parents,null,null));
            }

            // 부모 노드가 없으면 생성
            if(!tree.containsKey(parents)){
                tree.put(parents, new Node(parents, null, null));
            }

            // 왼쪽 자식 노드가 없으면 생성
            if(left != '.' && !tree.containsKey(left)){
                tree.put(left, new Node(left, null, null));
            }

            // 오른쪽 자식 노드가 없으면 생성
            if(right != '.' && !tree.containsKey(right)){
                tree.put(right, new Node(right, null, null));
            }

            // 노드 연결
            Node parentNode = tree.get(parents);
            parentNode.left = left == '.' ? null : tree.get(left);
            parentNode.right = right == '.' ? null : tree.get(right);

        }

        Node root = tree.get('A'); // 항상 A가 루트

        preOrder(root); // 전위
        System.out.println();
        inOrder(root); // 중위
        System.out.println();
        postOrder(root); // 후위
    }
}
