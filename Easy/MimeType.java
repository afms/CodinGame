import java.util.*;

class MimeType {
    
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        
        int n = in.nextInt();
        int q = in.nextInt();
        Hashtable<String, String> extensions = new Hashtable<String, String>();
        
        for (int i=0; i<n; i++) {
            String nameExtension = in.next();
            nameExtension = nameExtension.toLowerCase();
            extensions.put(nameExtension, in.next());
            in.nextLine();
        }
        
        for (int i=0; i<q; i++) {
            String fileName = in.next();
            String extension;
            
            fileName = fileName.toLowerCase();
            if (!fileName.contains(".")) {
                System.out.println("UNKNOWN");
                continue;
            }
            
            extension = fileName.substring(fileName.lastIndexOf('.') + 1);
            
            if (extensions.containsKey(extension)) {
                System.out.println(extensions.get(extension));
            } else {
                System.out.println("UNKNOWN");
            }
            
            in.nextLine();
        }
    }     
}