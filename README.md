# RestFullAPI_Java
this code is creating a Restfull API
# RestFullAPIJava
This code is about create restfull api using Java programming language 

First I created an entity of Employee this entity has many attributes and there is a relation between this entity and Department entity ( One to many ) using h2 database.

The restfull API was using service interface that has the declartion of all requiered methods and the implemnation in serviceImpl class.

serviceIimpl class has Autowire from EmployeeRepositry interface that extends JpaRepositry.

The employeeController has Autowire the service interface and and has @RestController.
