package com.platzi.functional._15_streams_intro;

import com.platzi.functional._06_reference_operator.NombresUtils;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamsPractice {
    public static void main(String[] args) {
        List<String> courseList = NombresUtils.getList(
                "Java",
                "FrontEnd",
                "Backend",
                "FullStrack");

        for (String course : courseList){
            String newCourseName = course.toLowerCase().replace("!","!!");
            System.out.println("Platzi: " + newCourseName);
        }

        Stream<String> coursesStream = Stream.of(
                "Java",
                "FrontEnd",
                "Backend",
                "FullStrack"
        );

//        Stream<Integer> coursesLenghtStream = coursesStream.map(String::length);
//        Optional<Integer> longest = coursesLenghtStream.max((x , y) -> y - x);

        Stream<String> emphasisCourses = coursesStream.map(course -> course + "!");
        Stream<String> justJavaCourses = emphasisCourses.filter(course -> course.contains("Java"));
        justJavaCourses.forEach(System.out::println);


        Stream<String> coursesStream2 = courseList.stream();

        coursesStream2.map(course -> course + "!!")
                .filter(course -> course.contains("Java"))
                .forEach(System.out::println);

    }
}
