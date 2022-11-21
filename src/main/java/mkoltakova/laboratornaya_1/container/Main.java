

package mkoltakova.laboratornaya_1.container;

/**
 *
 * @author admin
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        // Создаём список 
        Container cont = new Container();
       
        // Заполняем список в цикле
        for(int i = 1; i <= 10; i++) {
            cont.append(i);
        }
        // Печатаем весь cписок
        cont.print();
        // Получаем и печатаем элемент с индексом 4
       
        System.out.println("cont[4] = " + cont.get(0));
        
        // Удаляем элемент с индексом 4
        cont.remove(4);
        cont.print();
    }
}
