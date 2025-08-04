public class BinaryTree {
  private char info;
  private BinaryTree left;  //default value = null
  private BinaryTree right;   // --> private BinaryTree link = null;

  public BinaryTree(char value, BinaryTree left, BinaryTree right) {
    info = value;
    this.left = left;
    this.right = right;
  }

  public char getInfo(){return info;}

  public BinaryTree getLeft(){return left;}

  public BinaryTree getRight(){return right;}

  public void insertSort(BinaryTree... nodes) {
      for (BinaryTree node : nodes) {
          insertSort(node);
      }
  }
  
  public void insertSort(BinaryTree bt) {
    if (bt.getInfo() < this.getInfo()) {
        if (this.left != null) {
            this.left.insertSort(bt);
        } else {
            this.left = bt;
        }
    } else if (bt.getInfo() > this.getInfo()) {
        if (this.right != null) {
            this.right.insertSort(bt);
        } else {
            this.right = bt;
        }
    }
  }
  
  public void delete(BinaryTree bt) {
    if (bt == null) {
        return;
    }

    if (bt.info < this.info) {
        if (this.left != null) {
            if (this.left.info == bt.info) {
                this.left = null;
                return;
            }
            this.left.delete(bt);
        }
    } else if (bt.info > this.info) {
        if (this.right != null) {
            if (this.right.info == bt.info) {
                this.right = null;
                return;
            }
            this.right.delete(bt);
        }
    }
  }
  
  public void inorder(){

    System.out.print('(');

    if(this.left != null)
      this.left.inorder();

    System.out.print(this.getInfo());

    if(this.right != null)
      this.right.inorder();

    System.out.print(')');
  }
    
}