import java.util.Objects;

class Node<T> {
    T data;
    Node<T> next;
   /** 
     * один элемент из списка, ключ и ссылка на следующий
     */
    public Node(T key) {
        data = key;
        next = null;
    }
   
    
    /** 
     * @return String вывод значений в виде string
     */
    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }

    
    /** 
     * @param o  обьект с которым будет проведенно сравнение
     * @return boolean результат сравнения
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node<?> node = (Node<?>) o;
        return Objects.equals(data, node.data) && Objects.equals(next, node.next);
    }

    

    @Override
    public int hashCode() {
        return Objects.hash(data, next);
    }
}