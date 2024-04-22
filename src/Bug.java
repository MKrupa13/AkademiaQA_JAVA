public class Bug {
    String bugDescription;
    String email;
    int priority;
    boolean status;

    Bug(String bugDescription, String email, int priority) {
        this.bugDescription = bugDescription;
        this.email = email;
        this.priority = priority;
        this.status = true;


    }

    void showAllInformation() {
        System.out.println(bugDescription + " " + email + " " + priority + " " + status);
    }

    void showPersonCreatedBug() {
        System.out.println(email);
    }

    void showBugStatus() {
        System.out.println(status);
    }

    int getPriority() {
        return priority;
    }


}
