import java.util.Scanner;

public class Main {
    
    /** 
     * @author Сидоров Олег 8 группа
     * простой интерфейс для демонстрации возможностей
     */
    public static void main(String[] args) {
        var list = new List<Integer>();
        var action = 1;
        do {
            var in = new Scanner(System.in);
            System.out.println("Input command:");
            System.out.print("1: pushBack,  ");
            System.out.print("2: pushFront,  ");
            System.out.println("3: popFront");
            System.out.print("4: popBack,   ");
            System.out.print("5: insert,     ");
            System.out.println("6: delete  ");
            System.out.print("7: get,       ");
            System.out.print("8: print,      ");
            System.out.println("0: exit  ");

            action = in.nextInt();

            switch (action) {
                case 1: {
                    System.out.println("Input value");
                    var i = in.nextInt();
                    list.pushBack(i);
                    break;
                }
                case 2: {
                    System.out.println("Input value");
                    var i = in.nextInt();
                    list.pushFront(i);
                    break;
                }
                case 3: {
                    list.popFront();
                    break;
                }
                case 4: {
                    list.popBack();
                    break;
                }
                case 5: {
                    System.out.println("Input position");
                    var position = in.nextInt();
                    System.out.println("Input value");
                    var value = in.nextInt();
                    list.insert(position, value);
                    break;
                }
                case 6: {
                    System.out.println("Input position");
                    var position = in.nextInt();
                    list.delete(position);
                    break;
                }
                case 7: {
                    System.out.println("Input position");
                    var position = in.nextInt();
                    System.out.println(list.get(position));
                    break;
                }
                case 8: {
                    list.printList();
                    break;
                }
                default: {
                }
            }

        } while (action != 0);
    }
}
