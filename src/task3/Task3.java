package task3;

public class Task3 {
    public static void main(String[] args) {
        String s = "Java — строго типизированный объектно-ориентированный язык программирования общего" +
                " назначения, разработанный компанией Sun Microsystems (в последующем приобретённой компанией" +
                " Oracle). Разработка ведётся сообществом, организованным через Java Community Process; язык и" +
                " основные реализующие его технологии распространяются по лицензии GPL. Права на торговую марку" +
                " принадлежат корпорации Oracle.";

        String [] ss = new String[2];
        ss[0] = s.substring(0, s.length()/2);
        ss[1] = s.substring(s.length()/2+1);
        System.out.println(ss[0]+"\n"+ss[1]);
        System.out.println("***********************************");

        printArr(ss[0]);
        printArr(ss[1]);

    }
    static void printArr(String ss){
        String [] ssArr = ss.split("\\.");
        for (String str: ssArr) {
            System.out.println(str);
        }
    }
}
