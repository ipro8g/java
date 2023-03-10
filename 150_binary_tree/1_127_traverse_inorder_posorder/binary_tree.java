
    
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
            tree.postorder_traverse_tree();   
        }
        
        //traverse tree
        public void traverse_tree(node n){
        
            if(n != null){
            
                System.out.print(" " + n.key);
                traverse_tree(n.left);
                traverse_tree(n.right);
            }
        }
        
        //inorder traverse tree
        public void inorder_traverse_tree(node n){
        
            if(n != null){
 
                inorder_traverse_tree(n.left);
                
                System.out.print(n.key + " ");
 
                inorder_traverse_tree(n.right);
                
            }else{
            
                return;
            }
        }
        
        public void inorder_traverse_tree(){
 
            inorder_traverse_tree(root);
        }
        
        //postorder traverse tree
        public void postorder_traverse_tree(node n){
        
            if(n != null){
            
                postorder_traverse_tree(n.left);
                
                postorder_traverse_tree(n.right);
                
                System.out.print(n.key + " ");
            }else{
            
                return;
            }
        }
        
        public void postorder_traverse_tree(){
        
            postorder_traverse_tree(root);
        }
}
