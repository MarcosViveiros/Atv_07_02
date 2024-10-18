import java.util.Stack;

public class Pilha<T> {
    private Stack<T> stack;

    public Pilha(){
        this.stack = new Stack<>();
    }

    public void push(T item){
        stack.push(item);
    }

    public boolean empty(){
        return stack.isEmpty();
    }

    public T pop(){
        if(!empty()){
            return stack.pop();
        }
        return null;
    }
    public T top(){
        if(!empty()){
            return stack.peek();
        }
        return null;
    }

    public int size(){
        return stack.size();
    }

}

