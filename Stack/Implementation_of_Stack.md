# Array Implementation

```java
int[] stack;
int top;

public static void main(String[] args){
    stack = new int[Integer.MAX_SIZE];
    top = -1;
}

static void pust(int x){
    if(!top==Integer.MAX_SIZE){
        top++;
        stack[top] = x;
    }
}

static int pop(int x){
    if(!top==-1){
        int res = stack[top];
        top--;
    }
    return res;
}

static int peek(){
    if(!top==-1) return stack[top];
    return 0;
}

static boolean inEmpty(){
    return top==-1;
}

static boolean size(){
    return top+1;
}
```

# Linked List Implementation

```java
static Node head;

staic class Node{
    int data;
    Node next;
}

static void push(int x){
    Node temp = new Node(x);
    temp.next = head;
    head = temp;
}

static int pop(){
    if(head!=null){
        int res = head.data;
        head = head.next;
        return res;
    }
}
```
