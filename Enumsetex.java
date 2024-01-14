import java.util.EnumSet;
import java.util.Iterator;

public class Enumsetex {
    enum Size{
        SMALL,MEDIUM,LARGE,EXTRALARGE
    }

    public static void main(String[] args) {
        EnumSet<Size> sizes=EnumSet.allOf(Size.class);
        System.out.println(sizes);

        EnumSet<Size> size1 = EnumSet.noneOf(Size.class);
        System.out.println(size1);

        EnumSet<Size> size2 = EnumSet.range(Size.MEDIUM, Size.EXTRALARGE);
        System.out.println(size2);

        EnumSet<Size> size3 = EnumSet.of(Size.SMALL,Size.LARGE);
        System.out.println(size3);

        Iterator<Size> iterator=sizes.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
              }
        
        System.out.println(sizes.remove(Size.MEDIUM));
        System.out.println(sizes.removeAll(sizes));

    }
}
