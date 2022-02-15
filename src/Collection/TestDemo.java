package Collection;

// Collection : The Collection in Java is a framework that provides an architecture to store and manipulate
// the group of objects.

import java.util.ArrayList;
import java.util.Iterator;
    public class TestDemo {
        public static void main(String args[]){
            ArrayList<String> List1 = new ArrayList<String>();
            ArrayList List2 = new ArrayList();
            List1.add("Abhi");
            List1.add("Crystal");
            List1.add("Nayana");
            List2.add("Lucky");
            List2.add("Pooja");
            List2.add("Siya");
            List2.add(567);
            System.out.println("List1 is "+List1);
            System.out.println("List2 is "+List2);
            String name = List1.get(2);
            System.out.println("name is "+ name);
            List2.remove(3);
            System.out.println("List2 is "+ List2);
            if(List1.contains("Crystal")){
                System.out.println("Crystal is in the list");
            }
            for(String str:List1)
            {
                System.out.println(str);
            }
            Iterator<String> itr = List1.iterator();
            // System.out.println(itr.next());
            while (itr.hasNext()){
                String str = itr.next();
                System.out.println(str);
                if(str.equals("Nayana"))
                {
                    itr.remove();
                }
            }
            System.out.println("now List1 is "+List1);
        }
    }

