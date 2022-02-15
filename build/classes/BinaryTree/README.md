#Binary Trees:

- Use recursion to calculate/solve the following: 

1. Calculate height of a binary tree

    **return 1 + Math.max(heightOfBinaryTree(root.left), heightOfBinaryTree(root.right))**

2. Calculate sum of all nodes of binary tree

    **return root.data + sumOfAllNodes(root.left) + sumOfAllNodes(root.right)**
    
3. Invert a binary tree


    Node left = invertABinaryTree(root.left)
    Node right = invertABinaryTree(root.right)
    
    root.left = right;
    root.right = left
    
    return root;
