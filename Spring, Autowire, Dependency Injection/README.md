# This is for spring Spring, Autowire, Dependency Injection. 

Inside the JVM, we have a **Spring Container** so every object created by Spring goes there. 
Those object are called Beans. When we create a spring bean there is 2 diffirent scope :

- Singleton scope : gives you **one** instance of the class no matter how many times the class is called. 
- Prototype scope : gives you the number of instances of the class based on how many the class is called.
                    If the class is no called, there is no beans. 

There are other scopes for web applications, such as sessions. Spring container is created the moment is the 
**run method** is called but let's say we have 15 classes and we only want to create 7 objects, others we don't 
need them so the to do that is to use the **@Component** in front a class we want an object of. 

## Autowire

**@Autowired** allows us to connect two beans that are inside the spring container. For example we want to 
a student to his/her school name without having to creat an object of the class School. By default names on the 
beans inside the spring container are class's name with lowercase. So for a School class, it's bean's name 
is **_school_**. 

If we want to search beans by name we have to use **@Qualifier("school")**, if we want to change the bean's 
name we can use **@Component("sch1")** in the School class. 

**@Autowired** searchs by **_type_** and **@Qualifier("school")** searches by **_name_**




 