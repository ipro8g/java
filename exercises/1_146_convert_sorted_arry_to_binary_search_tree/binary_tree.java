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
        
            int[] arr = {1,2,3,4,5,6};
            
            tree1.root = tree1.sortedArrayToBST(arr, 0, arr.length-1);
            
            System.out.println("\n\ntraverse\n");
            
            tree1.traverse_tree(tree1.root);
            
            System.out.println("\n\ninorder\n");
            
            tree1.inorder_traverse_tree(tree1.root);
            
            System.out.println("\n\nposorder\n");
            
            tree1.postorder_traverse_tree(tree1.root);
        }
        
        public node sortedArrayToBST(int arr[], int start, int end) {
 
            /* Base Case */
            if (start > end) {
                return null;
            }
 
            /* Get the middle element and make it root */
            int mid = (start + end) / 2;
            node n = new node(arr[mid]);
 
            /* Recursively construct the left subtree and make it
            left child of root */
            n.left = sortedArrayToBST(arr, start, mid - 1);
 
            /* Recursively construct the right subtree and make it
            right child of root */
            n.right = sortedArrayToBST(arr, mid + 1, end);
             
            return n;
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
