package ObjectAndClasses;

import java.util.Scanner;

public class Articles_02 {

    public static class Article{
        private String title;
        private String content;
        private String author;

        Article(String title,String content,String author){
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public void edit(String content){
            this.content = content;
        }

        public void changeAuthor(String author){
            this.author = author;
        }

        public void rename(String title){
            this.title = title;
        }

        @Override
        public String toString(){
            return this.title + " - " + this.content + ": " + this.author;
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] articleInput = scanner.nextLine().split(", ");
        Article article = new Article(articleInput[0], articleInput[1], articleInput[2]);

        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        for(int i = 1; i <= numberOfCommands; i++){
            String command = scanner.nextLine();

            if(command.contains("Edit")){
                String newContent = command.split(": ")[1];
                article.edit(newContent);
            }else if(command.contains("ChangeAuthor")){
                String newAuthor = command.split(": ")[1];
                article.changeAuthor(newAuthor);
            }else if(command.contains("Rename")){
                String newName = command.split(": ")[1];
                article.rename(newName);
            }
        }

        System.out.println(article.toString());
    }
}
