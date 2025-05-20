package app;

public class Main {
    public static void main(String[] args) {
        String fileName = "contentFile.txt";
        FileHandler fileHandler = new FileHandler();

        String outputWritten = "RESULT: " + fileHandler.writeFile(fileName,"I didn't know what to write here, so you're seeing this text instead.");
        String outputRead = "FILE CONTENT: " + fileHandler.readFile(fileName);

        getOutput(outputWritten);
        getOutput(outputRead);
    }


    private static void getOutput(String output) {
        System.out.println(output);
    }
}
