public class BugApp {
    public static void main(String[] args) {
        Bug myBug = new Bug("błąd testowy", "macio@test.pl", 5);
        myBug.showAllInformation();
        myBug.showPersonCreatedBug();
        myBug.showBugStatus();
        int bugPriority = myBug.getPriority();
        System.out.println(bugPriority);


    }
}
