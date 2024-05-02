package com.in28minutes.learnspringbootframework;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class HelloWorldConfiguration {

    record Person(String name, int age, Address address) {
    }
    ;

    record Address(String firstLine, String city) {
    }

    ;

    @Bean
    public String name() {
        return "ranga";

    }

    public int age() {
        return 53;

    }

    @Bean

    public Person person() {

//        var person = new Person("Ravi",20);
//        return person   ;
        return new Person("Ravi", 20, new Address("Harihar nagar ", "Lucknow "));
    }
    @Bean
    public Person person5qualifier(String name , int age, @Qualifier("address3qualifier") Address address){
        return new Person(name(),age() ,address);


    }


    @Bean(name = "address2")
    @Primary
    public Address address() {
        return new Address("Harihar nagar", "Lucknow");
    }

//    @Bean
//    public Person person3Parameters(String name, int age, Address address2){
//        return new Person(name,age,address2);
//    }
@Bean
public Person person3Parameters(){
    String name = "YourName"; // Or any desired name
    int age = 30; // Or any desired age
    Address address2 = address(); // Assuming you have defined the address bean

    return new Person(name, age, address2);
}



    @Bean
        public Person person2MethodCall(){
            return new Person(name(), age(), address());
        }


        @Bean(name = "address3")
    @Qualifier("address3qualifier")
    public Address address3(){
        return new Address("Indira Nagar", "Lucknow");
    }

}
