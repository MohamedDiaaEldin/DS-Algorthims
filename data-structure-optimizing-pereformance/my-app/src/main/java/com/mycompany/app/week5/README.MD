# Trees

- root node : node without parents 
- child node : node with a parent 
- leaf node : node without childrens 

## Tree facts
- single root 
- each node can have only one parent 
- no cycles in a tree

### Binary tree
- any node can have at most two children

### Binary search tree 
- is a binary tree
- left subtrees values less than right 

#### traversals
- postOrder  (depth first traversal) 
     - visit all your left subtree
     - visit all your right subtree
     - visit yourself 
     
- inOrder:  (depth first traversal) 
     - visit all you left subtree
     - visit your self
     - visit all your right subtree   
       
- preorder :  (depth first traversal) 
     - visit yourself 
     - then visit all your left subtree
     - then visit all your right subtree

- level order (breadth first traversal) 
     