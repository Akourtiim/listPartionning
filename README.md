# list Partitioning allows the partitioning of list of integers based on a partition size
This project can be used a third library in other projects 
once this project jar was add into your project 
you can call the static method inside PartitionManager :

PartitionManager(listOfints,size of partition);

you can also run this jar using java CLI 
after building the project with tests runing using : mvn clean install 
inside the target folder : java -jar partition-jar-with-dependencies.jar list size
List must be a list of integer with a comma as a separator .
size must be an int 

Example :
java -jar partition-jar-with-dependencies.jar 1,2,3 2
 
