//Написать метод, который проверяет валидность логина и пароля (где нибудь в переменных сохраните)
//и при помощи конструкции try-catch рекурсивно принимайте данные
//(нужно ограничить колиичество попыток до 6 и после 3 попытки должно быть сообщение, мол вы привысили количество попыток,
import java.util.Scanner;

public class Task2 {
    //private static final String Sasha = null;

    public static void main(String[] args) {
        String log="Sasha";
        Integer pass=8888;
        try{
        Scanner sc = new Scanner(System.in);     
        System.out.println("Login: ");
        String login = sc.nextLine();
        System.out.println("Password: ");
        Integer password = sc.nextInt();
        sc.close();
        
        int count=0;
        
        if (login.equals(log) && password.equals(pass)){
            System.out.println("You are in!");
        }
            
        else {
            System.out.println("Wrong login or password, try again");
            count+=1;
            
            if(count==3) {//эта часть кода не работает, почему?
                System.out.print("3 attemps left");
                if (count==6) {
                    System.out.print("Attemps are over");
                    System.exit(0);
                }
            }         
        }
        
        }
        catch(Exception ex){
         
            System.out.println(ex.getMessage());
        }
        finally {
        System.out.println("finally");
        }
    
        
        
    }

    
}
