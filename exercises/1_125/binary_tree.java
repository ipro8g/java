
    
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
            binary_tree tree = new binary_tree();
        
            //create nodes on tree
            tree.root = new node(1);
            tree.root.left = new node(2);
            tree.root.right = new node(3);
            tree.root.left.left = new node(4);
            tree.root.left.right = new node(5);
        
            System.out.print("\nbinary tree: ");
            tree.traverse_tree(tree.root);   
        }
        
        //traverse tree
        public void traverse_tree(node n){
        
            if(n != null){
            
                System.out.print(" " + n.key);
                traverse_tree(n.left);
                traverse_tree(n.right);
            }
        }
}
