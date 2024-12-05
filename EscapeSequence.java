class EscapeSequence{
    public static void main(String[] args){
        
        //Insert Single Quote
        String str = "Shaba\'eesh";
        
        //Insert a Tab
        String str1 = "Shaba\treesh";

        //Carriage Return
        String str2 = "Shaba\r reesh";
        
        //Insert New Tab
        String str3 = "Shaba\nreesh";
        
        //Insert Double Quote
        String str4 = "Shaba\"reesh";
        
        //Insert BackSlash
        String str5 = "Shaba\\reesh";
        
        //Form Feed
        String str6 = "Shaba\freesh";
        
        //BackSpace Character
        String str7 = "Shaba\breesh";
        
        System.out.println(str);
        System.out.println("\n"+str1);
        System.out.println("\n"+str2);
        System.out.println("\n"+str3);                
        System.out.println("\n"+str4);
        System.out.println("\n"+str5);
        System.out.println("\n"+str6);
        System.out.println("\n"+str7);
    }
}