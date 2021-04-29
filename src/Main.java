import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args)
    {

//    Optional<String> a = Optional.ofNullable(null);
//    Optional<String> b = a.map(record -> getNewString(record));
//    if(b.isPresent()){
//
//        System.out.println(b.get());
//    }
//
//    else{
//        System.out.println("bye");
//    }

//        String str = "   Hello Geeks  .  Welcome ,    Do you love Geeks , Geeks  ? ";
//        System.out.println(str.replaceAll("\\s+"," ").replaceAll("[\\s]([.,?])","$1").trim());

        List<Float> list1 = new ArrayList<Float>();

//        String a = (String) null;
//        Optional<String> b = Optional.ofNullable(a);
//        System.out.println(b.orElse("EMPTY"));

//        list1.add(7.89f);
//        list1.add(8.876f);
//        list1.add(null);
//        list1.add(null);
////
////        //for(String a : list1) System.out.println(a);
////
////
////
////        List<Optional<Float>> list2  = list1.stream()
////             .map(val -> Optional.ofNullable((Float)val))
////             .collect(Collectors.toList());
//
//        //list2.stream().forEach(val -> System.out.println(val.orElse(0.0f)));
//
//        Map<String,Float> map = list1.stream()
//                                               .filter(Objects::nonNull)
//                                               .collect(Collectors.toMap(t-> String.valueOf(t), t-> t));
//
//
//        Optional<Float>  a = Optional.ofNullable(map.get("7.09"));
//        System.out.println(a.orElse(0.0f));


        //map.values().stream().forEach(val -> System.out.println(val.get()));
        //list3.stream().forEach(val -> System.out.println(val));

//        Integer roq = 150;
////        Double price = 4.0;
//        Double futureOpportunity = 170.43;
//        Double leftfactor = 600.0;
//        Double opportunity = leftfactor + futureOpportunity;
//
//        Double answer = Optional.ofNullable(opportunity)
//                .map(val -> BigDecimal.valueOf(val))
//                .map(val -> val.setScale(3, RoundingMode.HALF_DOWN))
//                .map(val -> val.doubleValue()).orElse(null);
        //BigDecimal bdUp=new BigDecimal(opportunity).setScale(3, RoundingMode.HALF_DOWN);
        //Double scale = Math.pow(10, 3);
       // System.out.println(Math.round(opportunity*scale)/scale);
       // System.out.println(answer);
        //System.out.println(futureOpportunity);


        Student a= Student.builder().name("Tanay").height(20).build();
        System.out.println(a.getHeight());



    }
//
//    private static String getNewString(final String a){
//        System.out.println("Old String is : " + a);
//        String b = a + "1234";
//        System.out.println("New String is : " + b);
//        return b;
//    }
}
