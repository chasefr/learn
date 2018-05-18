import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Chase on 2018/1/28.
 */
public class Test {
    String name;
    List<String> stringList;

    public Test(String name, List<String> stringList){
        this.name = name;
        this.stringList = stringList;
    }

    @Override
    public boolean equals(Object object){
        if(object instanceof Test){
            Test that = (Test) object;
            if(this.name.equals(that.name)){
                if(this.stringList.equals(that.stringList)){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        List<Test> testList = new ArrayList<>();
        Test test = new Test("我", Arrays.asList("1","2"));
        testList.add(test);
        boolean is = testList.contains(test);
        System.out.println(is);
    }
}
