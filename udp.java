import java.util.*;

class udp{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Hex Dump : ");
        String hex = sc.next();
        System.out.println("SOURCE PORT NUMBER : "+Integer.parseInt(hex.substring(0,4),16));
        System.out.println("DESTINATION PORT NUMBER : "+Integer.parseInt(hex.substring(4,8),16));
        System.out.println("LENGTH : "+Integer.parseInt(hex.substring(8,12),16));
        System.out.println("CHECKSUM : "+Integer.parseInt(hex.substring(12,16),16));
    }
}

Enter Hex Dump :
BC82000D002B001D
SOURCE PORT NUMBER : 48258
DESTINATION PORT NUMBER : 13
LENGTH : 43
CHECKSUM : 29
