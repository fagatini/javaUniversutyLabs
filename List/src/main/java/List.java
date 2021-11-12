public class List<T> {
     /** 
     * класс шаблон списка, типа Т
     */
    private Node<T> head;
    private int size;

    public List() {
        head = null;
        size = 0;
    }

    
    /** 
     * @param data продвигаемая в конец переменная
     */
    public void pushBack(T data) {
        var h = head;
        var temp = new Node<>(data);
        temp.next = null;
        if (h == null) {
            head = temp;
        } else {
            while (h.next != null) {
                h = h.next;
            }
            h.next = temp;
        }
        size++;
    }

    
    /** 
     * @param data продвигаемая в начало переменная
     */
    public void pushFront(T data) {
        var temp = new Node<>(data);
        temp.next = head;
        head = temp;
        size++;
    }
    /** 
     * удаление из начала списка
     */
    public void popFront() {
        if (head == null) return;
        head = head.next;
        size--;
    }
    /** 
     * удаление из конца списка
     */
    public void popBack() {
        if (size == 0) return;
        if (size == 1) {
            head = null;
            size = 0;
            return;
        }
        var h = head;
        while (h.next.next != null) {
            h = h.next;
        }
        h.next = null;
        size--;
    }

    
    /** 
     * @param position номер места, от куда удалится переменная
     */
    public void delete(int position) {
        if (position < 0 || position > size - 1) return;
        else if (position == 0) popFront();
        else if (position == size - 1) popBack();
        else {
            var currPos = 0;
            var h = head;
            while (position - 1 != currPos) {
                h = h.next;
                currPos++;
            }
            if (h.next != null && h.next.next != null)
                h.next = h.next.next;
        }
    }

    
    /** 
     * @param position номер места, куда добавится переменная
     * @param data продвигаемая в {@link position} переменная
     */
    public void insert(int position, T data) {
        if (position < 0 || position > size) return;
        if (position == 0) pushFront(data);
        else if (position == size) pushBack(data);
        else {
            var currPos = 0;
            var h = head;
            while (position - 1 != currPos) {
                h = h.next;
                currPos++;
            }
            var temp = new Node<>(data);
            temp.next = h.next;
            h.next = temp;
        }
    }

    
    /** 
     * @param position номер места, где будет просмотрен элемент
     * @return T элемент на {@link position}
     */
    public T get(int position) {
        if (position < 0 || position > size - 1) throw new IndexOutOfBoundsException();
        var currPos = 0;
        var h = head;
        while (position != currPos) {
            h = h.next;
            currPos++;
        }
        return h.data;
    }

    /** 
     * вывод всего листа 
     */
    public void printList() {
        if (size == 0) {
            System.out.println("Empty list");
            return;
        }
        var h = head;
        System.out.println("List: ");
        while (h != null) {
            System.out.print(h.data + " ");
            h = h.next;
        }
        System.out.println();
    }

    
    /** 
     * @return int вывод размера всего списка
     */
    public int getSize() {
        return size;
    }

    
 
    @Override
    public String toString() {
        var strbuilder = new StringBuilder("");
        var h = head;
        while (h != null) {
            strbuilder.append(h.data).append(" ");
            h = h.next;
        }
        return strbuilder.toString();
    }
}