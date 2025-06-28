import java.util.Scanner;

public class Quiz {
    Scanner sc = new Scanner(System.in);
    String storeun;
    String storepass;

    void create_acc() {
        System.out.println("CREATE ACCOUNT");
        System.out.print("Enter UserName: ");
        storeun = sc.nextLine();
        System.out.print("Set Password: ");
        storepass = sc.nextLine();
        System.out.println("Account Created Successfully\n");
    }

    void login() {
        System.out.println("LOGIN");
        while (true) {
            System.out.print("Enter UserName: ");
            String u = sc.nextLine();
            System.out.print("Enter Password: ");
            String p = sc.nextLine();

            if (u.equals(storeun) && p.equals(storepass)) {
                System.out.println("Login Successful\n");
                break;
            } else {
                System.out.println("Wrong username or password. Try again.\n");
            }
        }
    }

    void selectSubjects() {
        System.out.println("Choose Subject:");
        System.out.println("1. English");
        System.out.println("2. Science");
        System.out.println("3. Computer");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine(); // clear input buffer

        int marks = 0;

        if (choice == 1) {
            marks = englishQuiz();
            System.out.println("English Marks: " + marks + "/5");
        } else if (choice == 2) {
            marks = scienceQuiz();
            System.out.println("Science Marks: " + marks + "/5");
        } else if (choice == 3) {
            marks = computerQuiz();
            System.out.println("Computer Marks: " + marks + "/5");
        } else {
            System.out.println("Invalid Choice");
        }

        System.out.println("Total Marks: " + marks + "/5");
    }

    int englishQuiz() {
        int marks = 0;
        String ans;

        System.out.println("\n--- English Quiz ---");

        System.out.println("1. Opposite of 'Cold'? A) Hot B) Ice C) Warm D) Freeze");
        ans = sc.next().toUpperCase();
        if (ans.equals("A")) marks++;

        System.out.println("2. Synonym of 'Happy'? A) Angry B) Joyful C) Sad D) Cry");
        ans = sc.next().toUpperCase();
        if (ans.equals("B")) marks++;

        System.out.println("3. Plural of 'Child'? A) Childs B) Childes C) Children D) Kid");
        ans = sc.next().toUpperCase();
        if (ans.equals("C")) marks++;

        System.out.println("4. 'She is a teacher.' What is the verb? A) She B) Teacher C) Is D) A");
        ans = sc.next().toUpperCase();
        if (ans.equals("C")) marks++;

        System.out.println("5. Opposite of 'Begin'? A) Continue B) Start C) Run D) End");
        ans = sc.next().toUpperCase();
        if (ans.equals("D")) marks++;

        return marks;
    }

    int scienceQuiz() {
        int marks = 0;
        String ans;

        System.out.println("\n--- Science Quiz ---");

        System.out.println("1. Water boils at? A) 90°C B) 100°C C) 80°C D) 110°C");
        ans = sc.next().toUpperCase();
        if (ans.equals("B")) marks++;

        System.out.println("2. Red Planet is? A) Earth B) Mars C) Jupiter D) Venus");
        ans = sc.next().toUpperCase();
        if (ans.equals("B")) marks++;

        System.out.println("3. Humans breathe in? A) CO2 B) Hydrogen C) Oxygen D) Helium");
        ans = sc.next().toUpperCase();
        if (ans.equals("C")) marks++;

        System.out.println("4. Blood color? A) Blue B) Yellow C) Green D) Red");
        ans = sc.next().toUpperCase();
        if (ans.equals("D")) marks++;

        System.out.println("5. Plants make food by? A) Digestion B) Photosynthesis C) Breathing D) Respiration");
        ans = sc.next().toUpperCase();
        if (ans.equals("B")) marks++;

        return marks;
    }

    int computerQuiz() {
        int marks = 0;
        String ans;

        System.out.println("\n--- Computer Quiz ---");

        System.out.println("1. CPU stands for? A) Central Unit B) Control Panel C) Central Processing Unit D) Computer Unit");
        ans = sc.next().toUpperCase();
        if (ans.equals("C")) marks++;

        System.out.println("2. Monitor is a? A) Input B) Output C) Memory D) Storage");
        ans = sc.next().toUpperCase();
        if (ans.equals("B")) marks++;

        System.out.println("3. Shortcut for copy? A) Ctrl+V B) Ctrl+C C) Ctrl+X D) Ctrl+Z");
        ans = sc.next().toUpperCase();
        if (ans.equals("B")) marks++;

        System.out.println("4. Brain of computer? A) RAM B) CPU C) Hard disk D) Monitor");
        ans = sc.next().toUpperCase();
        if (ans.equals("B")) marks++;

        System.out.println("5. Word file extension? A) .docx B) .pdf C) .xls D) .exe");
        ans = sc.next().toUpperCase();
        if (ans.equals("A")) marks++;

        return marks;
    }

    public static void main(String[] args) {
        Quiz q = new Quiz();
        q.create_acc();
        q.login();
        q.selectSubjects();
    }
}
