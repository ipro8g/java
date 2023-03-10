import java.util.ArrayList;
import java.util.Collection;
    
    class node{
    
        int key;
        node left, right;
        
        public node(int item){
        
            key = item;
            left = right = null;
        }
    }
    
public class binary_tree{
    
        node root;
        
        public static void main(String[] args){
 
            //create a binary tree object
            binary_tree tree1 = new binary_tree();
        
            //create nodes on tree
            tree1.root = new node(1);
            tree1.root.left = new node(2);
            tree1.root.right = new node(3);
            tree1.root.left.left = new node(4);
            tree1.root.left.right = new node(5);
            
            ArrayList<Integer> tree_arr1 = new ArrayList<>();
            
            tree1.traverse_tree(tree1.root, tree_arr1);
            
            
            
            binary_tree tree2 = new binary_tree();
            
            tree2.root = new node(2);
            tree2.root.left = new node(4);
            tree2.root.right = new node(5);
            
            ArrayList<Integer> tree_arr2 = new ArrayList<>();
            tree2.traverse_tree(tree2.root, tree_arr2); 
            
            if(tree_arr1.containsAll(tree_arr2)){
            
                System.out.println("tree2 is subtree of tree1");
            }else{
            
                System.out.println("tree2 is not a subtree of tree1");
            }
        }
        
        //traverse tree
        public ArrayList<Integer> traverse_tree(node n, ArrayList<Integer> tree_arr1){
        
            if(n != null){
            
                tree_arr1.add(n.key);
                traverse_tree(n.left, tree_arr1);
                traverse_tree(n.right, tree_arr1);
            }
            
            return tree_arr1;
        }
}
