import count.Enrich;
import dto.MyDto;

public class Started {
    public static void main(String[] args) {
        MyDto one = new MyDto();
        one.setId(1);

        MyDto two = new MyDto();
        two.setName("Ronaldo");
        two.setCountry("BRA");
        two.setActive(true);

        Enrich<MyDto> enrich = (val1, val2) -> {
            MyDto object = new MyDto();
            object.setId(val1.getId());
            object.setName(val2.getName());
            object.setCountry(val2.getCountry());
            object.setActive(val2.getActive());
            return object;
        };

        System.out.println(enrich.action(one, two));
    }
}