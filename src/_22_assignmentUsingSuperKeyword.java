//Develop a Java program to show how super can be used to access a superclass variable.
class Movie {
    String name = "Kill bill";
}

class Copy extends Movie {
    String name = "Kill Dil";

    public String showName() {
        return "This was a copied movie: " + name;
    }

    public String showSuperName() {
        return "Copied from: " + super.name;
    }
}

public class _22_assignmentUsingSuperKeyword {
    public static void main(String[] args) {
        Copy copy = new Copy();
        System.out.println(copy.showName());
        System.out.println(copy.showSuperName());
    }
}
