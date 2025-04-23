import java.io.*;
public class FileNotFoundException {
        public static void main(String[] args) throws IOException {
              try {
                BufferedReader br = new BufferedReader(new FileReader("C://Users//Lab//Desktop//cse24319//Playable.java"));
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
                br.close();
            } catch (FileNotFoundException e) {
                System.out.println("File not found: " + e.getMessage());
            } catch (IOException e) {
                System.out.println("Error reading file: " + e.getMessage());
            }
        }
    }   
