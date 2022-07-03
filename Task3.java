//Написать программу, показывающую последовательность действий для игры “Ханойская башня”

public class Task3 {
    public static void move(int disks, int first, int second, int third)
    {
        if (disks > 0)
        {
            // перемещаем `n-1` дисков c первой на вторую, используя третью башню как промежуточную
           
            move(disks - 1, first, third, second);
 
            // перемещаем один диск с первой на третью
            System.out.println("Перемещаем диск " + disks + " с " + first + " башни на " +third);
             
            // перемещаем `n-1` дисков со второй на третью, используя первую башню как промежуточную
           
            move(disks - 1, second, first, third);
        }
    }
 
    // Задача о Ханойской башне
    public static void main(String[] args)
    {
        int n = 3;
        move(n, 1, 2, 3);
    }
}