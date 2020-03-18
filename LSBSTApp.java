import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class LSBSTApp{
    public static Scanner file;
    public static String fileName = "files/Load_Shedding_All_Areas_Schedule_and_Map.clean.final.txt";
    public static BinarySearchTree<String> tree;
    
    // This constructor reads a data from the 'loadShedding.file.txt'
    public LSBSTApp(String filename){
        try{
            this.file = new Scanner(new FileInputStream(filename));
        }catch(FileNotFoundException e){
            System.out.println("Could not open the file");
            System.out.println("or File not Found");
        }
        tree = new BinarySearchTree<String>();
        
       // This method gets the line from the file and returns it and cut it into key and areas
       while(file.hasNext()){
            String line = file.nextLine();
            int index_s = line.indexOf(" ");
            String k = line.substring(0, index_s);
            String a = line.substring(index_s + 1);
            tree.insert(k,a);
       }
    }
    
    // This is the main method to run the LSBSTApp
    public static void main(String[] args){
        LSBSTApp test = new LSBSTApp(fileName);
        //tree.find("8_16_22");
        // This method search for the given key and returns every place that is affected
        // By load shedding with their corresponding stage, date and startTime
        if( args.length == 3){
            // Do something
            String query = args[0] + "_" + args[1] + "_" + args[2];
            System.out.println(tree.find(query));
            System.out.println("The number of comparison made before finding the key is: " + tree.getCount());
        }else if( args.length == 0){
            tree.inOrder();
        }
         
    }
} 
