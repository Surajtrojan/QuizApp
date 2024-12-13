# QuizApp
 Quiz SpringBoot Application

Step by Step-by-step guide to use the application.

1. Clone it in your system.
2. Create a DB in postgres PgAdmin with the name quizDb.
3. Run the SpringBoot application from main method which will create the tables in quizDb.
4. Manually enter the list of questions using the below SQL Insert command. (Initial set of questions):
5. Create a quiz using below endpoint which takes number of question for the quiz and title of the quiz:
http://localhost:8080/quiz/create?numOfQuestions=5&title=JavaQuiz
6. Quiz can be seen using the get request by passing the id of the quiz:
http://localhost:8080/quiz/get/1
7. Now to calculate the score submit/{id} endpoint needs to be hit, which will check how many questions were answered correctly and will show the scoreof number of correct questions. It a s post request so wee need to send the response user's answers. provided below.
http://localhost:8080/quiz/submit/1
[
    {
        "id" : 15,
        "response":"To make a variable thread-safe"
    },
    {
        "id" : 7,
        "response":"interface"
    },
    {
        "id" : 11,
        "response":"ArrayList is faster for random access, LinkedList is faster for insertion and deletion"
    },
    {
        "id" : 3,
        "response":"== compares references, equals() compares contents"
    },
    {
        "id" : 6,
        "response":"Both A and B"
    }
]







-------------------- Insert statement to populate the question table -------------------------------------------------------------
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
		
