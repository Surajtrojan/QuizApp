package com.trojan.QuizApp;

import com.trojan.QuizApp.model.Question;
import com.trojan.QuizApp.repository.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class QuizAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizAppApplication.class, args);


		/*
  INSERT INTO question (id, title, option1, option2, option3, option4, correctanswer) VALUES
  (1, 'What is the default value of a boolean variable?', 'true', 'false', 'null', '0', 'false'),
  (2, 'Which keyword is used to declare a constant?', 'const', 'final', 'static', 'immutable', 'final'),
  (3, 'What is the difference between == and equals()?', '== compares references, equals() compares contents', '== compares contents, equals() compares references', 'Both compare references', 'Both compare contents', '== compares references, equals() compares contents'),
  (4, 'What is the purpose of the finally block in a try-catch block?', 'To execute code regardless of exceptions', 'To handle specific exceptions', 'To handle all exceptions', 'To terminate the program', 'To execute code regardless of exceptions'),
  (5, 'Which keyword is used to inherit a class in Java?', 'extends', 'implements', 'inherits', 'derives', 'extends'),
  (6, 'What is the purpose of the static keyword in Java?', 'To declare a class variable', 'To declare a class method', 'Both A and B', 'None of the above', 'Both A and B'),
  (7, 'What is the keyword used to define an interface in Java?', 'interface', 'abstract', 'implements', 'extends', 'interface'),
  (8, 'What is the default access modifier for a class in Java?', 'public', 'private', 'protected', 'default', 'default'),
  (9, 'What is the difference between an abstract class and an interface?', 'Abstract class can have both abstract and concrete methods, interface can only have abstract methods', 'Abstract class can have constructors, interface cannot', 'Abstract class can extend multiple classes, interface can extend multiple interfaces', 'All of the above', 'All of the above'),
  (10, 'What is the purpose of the throws keyword in Java?', 'To declare an exception', 'To throw an exception', 'To handle an exception', 'To ignore an exception', 'To declare an exception'),
  (11, 'What is the difference between an ArrayList and a LinkedList?', 'ArrayList is faster for random access, LinkedList is faster for insertion and deletion', 'ArrayList is faster for insertion and deletion, LinkedList is faster for random access', 'Both have the same performance characteristics', 'None of the above', 'ArrayList is faster for random access, LinkedList is faster for insertion and deletion'),
  (12, 'What is the purpose of the hashCode() method in Java?', 'To generate a unique identifier for an object', 'To compare two objects for equality', 'To convert an object to a string representation', 'To determine the memory usage of an object', 'To generate a unique identifier for an object'),
  (13, 'What is the difference between a checked exception and an unchecked exception?', 'Checked exceptions must be declared or caught, unchecked exceptions do not need to be', 'Checked exceptions are runtime exceptions, unchecked exceptions are compile-time exceptions', 'Checked exceptions are always thrown by the JVM, unchecked exceptions are always thrown by user code', 'None of the above', 'Checked exceptions must be declared or caught, unchecked exceptions do not need to be'),
  (14, 'What is the purpose of the transient keyword in Java?', 'To make a variable persistent across object serialization', 'To make a variable non-serializable', 'To make a variable thread-safe', 'To make a variable immutable', 'To make a variable non-serializable'),
  (15, 'What is the purpose of the volatile keyword in Java?', 'To make a variable thread-safe', 'To make a variable immutable', 'To make a variable final', 'To make a variable static', 'To make a variable thread-safe');
		 */


	}

}
