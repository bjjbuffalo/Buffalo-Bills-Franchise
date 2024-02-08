# Buffalo Bills Franchise Tracker
This project is being created in order to track the statistics of every Bills player over the entire francise!  The user will choose a position and then enter the year.
Quarterbacks can also be compared to one another to see how they stack up with eachother.
Multiple  statistics will then be generated for the user to view base on their input!

# How It's Made:
Tech used: Java, Maven, Spring, Hibernate, MySQL

1. Gather all statistics from multiple positions on https://www.pro-football-reference.com/
2. Save each position as a json file and upload the statistics in a table format to MySQL Workbench.
3. Start a SpringBoot Project and make sure all necessary dependencies are in the Maven POM file.  (Springboot, MySQL, web development, etc.)
4. Utilize Hibernate ORM to establish a connection from my spring project to the MySQL database.  (Updated in Application.properties)
5. Create a Data Access layer which is designed for mapping data to and from a relational database for the Buffalo Bills Franchise application.
6. Add Repositories for each position so custom query methods can be defined in the interface.  These will retrieve a list of players based on the year attribute.
7. Finally, a service layer is implemented in order to handle the logistics of fetching information based on the users input.

# Current Project Limitations:
Currently all tables are stored in MySQL, limiting its execution to a local machine. However, schema statements will be updated soon to enable public use.

 # To Do:
 1. To improve user interaction, utilize Thymeleaf for creating a dynamic web interface, and implement a Controller class with REST APIs to handle data requests in the Buffalo Bills application.
 2. Continue adding positions.
 3. Class to handle simple CRUD requests.


# Examples
<img width="1354" alt="Screenshot 2024-02-07 at 9 22 58 PM" src="https://github.com/bjjbuffalo/Buffalo-Bills-Franchise/assets/156975855/edf2cd70-8ffc-46c9-80c8-e2793b647e10">
<img width="1301" alt="Screenshot 2024-02-07 at 9 20 56 PM" src="https://github.com/bjjbuffalo/Buffalo-Bills-Franchise/assets/156975855/532fb26b-0ecf-48d4-866d-aba9d4d15310">


