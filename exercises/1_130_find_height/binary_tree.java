
    
    class node{
    
        int key;
        public static int created_nodes = 0;
        node left, right;
        
        public node(int item){
        
            key = item;
            left = right = null;
            created_nodes++;
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
            
            System.out.println("height: " + tree.find_height(tree.root));
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
        
        public int find_height(node temp){ 
         
            //Check whether tree is empty  
            if(root == null) {  
        
                System.out.println("Tree is empty");  
                return 0;  
            }else{  
                int left_height = 0, right_height = 0;  
  
                //Calculate the height of left subtree  
                if(temp.left != null){
              
                    left_height = find_height(temp.left);  
                }
            
                //Calculate the height of right subtree  
                if(temp.right != null){
              
                    right_height = find_height(temp.right);  
                } 
            
                //Compare height of left subtree and right subtree  
                //and store maximum of two in variable max  
                int max = (left_height > right_height) ? left_height : right_height;  
  
                //Calculate the total height of tree by adding height of root  
                return (max + 1);  
            }  
        }
}
