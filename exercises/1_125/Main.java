
    
    class node{
    
        int key;
        
        public node(int item){
        
            key = item;
            left = right = null;
        }
    }
    
public class binary_tree{
    
        node root;
        
        public static void main(String[] args){
 
        //create a binary tree object
        binary_tree tree = new binary_tree();
        
        //create nodes on tree
        tree.root = new node(1);
        tree.root.left = new node(2);
        tree.root.right = new node(3);
        tree.root.left.left = new node(4);
        
        System.out.print("\nbinary tree: ");
        tree.traverse_tree(tree.root);   
    }
        
        //traverse tree
        public void traverse_tree(node n){
        
            if(n != null){
            
                traverse_tree(n.left);
                System.out.print(" " + n.key);
            }
        }
    }
}
