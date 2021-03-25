
import java.util.*;
public class multiple_emails{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the name of person whom you want to send the mail : ");
        String nameofperson = sc.nextLine();
        String mail = "Dear <|name|>, Thanks a lot!";
        mail = mail.replace("<|name|>",nameofperson);
        System.out.println(mail);
        sc.close();
    }
}
