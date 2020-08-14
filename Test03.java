package day05;

import day03.Emp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary,hiredate;name,age,gender,salary,hiredate;....
 * 例如:
 * 张三,25,男,5000,2006-02-15;李四,26,女,6000,2007-12-24;...
 * 然后将每个员工信息解析成Emp对象。并存入到一个List集合中。
 * 并对集合排序，然后输出每个员工信息。
 * 
 * 再根据员工的入职时间排序，入职晚的在前，早的在后并
 * 输出每个员工的信息。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) throws ParseException {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        StringBuilder str = new StringBuilder();
        List<Emp> col = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            String name = console.next();
            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
            String str1 = str.toString();
            if((str1.contains(name))) {
                System.out.println("该用户已输入");
            }else{
                col.add(new Emp(name, console.nextInt(), console.next(), console.nextInt(), sf.parse(console.next())));
                str.append(name); }
        }
        Collections.sort(col, new Comparator<Emp>() {
            @Override
            public int compare(Emp o1, Emp o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(col.toString());

        Collections.sort(col, new Comparator<Emp>() {
            @Override
            public int compare(Emp o1, Emp o2) {
                return o2.getHiredate().compareTo(o1.getHiredate());
            }
        });

    }
}
