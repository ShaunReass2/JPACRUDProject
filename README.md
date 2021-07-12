# JPA C.R.U.D. Project
## _____________________
## Shaun Reass

## Overview

This full-stack project incorporates both front and back end development technologies, enabling a user create, read, update, and delete motorcycle information stored in a database by using an intuitive web interface, Mkdir Moto.  

## Technologies Used

* Java
* Conditionals
* Iteration
* Object-Oriented Design
* Try-Catch Statements
* Exceptions
* SQL
* Spring
* MVC
* JPA
* Gradle
* MySQL Workbench

## How to Run

Upon landing on the Mkdir Moto webpage, the user will see a banner welcoming them to the website, with the Mkdir slogan below it.  The splash page lists four centered links: 1) list all motorcycles in the garage, 2) update motorcycle specs, 3) add motorcycles to the garage, and 4) delete motorcycles from the garage.  By clicking the first, second, and fourth links, the user is directed to a page listing all motorcycles in the inventory.  Each motorcycle on the page is identified by a hyperlinked name, which will redirect to a page where information specific to the bike is listed. The user can review the information presented, and either choose to update or to simply return to the splash page -- both via buttons located at the bottom left of the page and labeled accordingly. When the user chooses to update details of a motorcycle, the information is stored in the motorcycle database. While on the motorcycle list page, the user can also choose to delete a bike from the database entirely, simply by clicking the "delete" link below each motorcycle name.  The deletion is permanent.  From the splash page, if a user chooses the third link -- to add motorcycles to the garage -- they are directed to a page with empty fields where they can create a motorcycle to their specifications and add it to the database by choosing the "save" button at the bottom left of the page.  

## Lessons Learned

While this was a fun and exciting project, it presented several challenges to bring to fruition.  There were the usual suspects, such as syntax and overall organizational planning.  During the course of the project, I decided to implement the CRUD Repository and thought it might provide a good framework with which to complete the MotorcycleDAOImpl class.  Initially, it seemed like a good option, as I assumed the implementation would be rather seamless.  It soon after proved more challenging than originally anticipated.  While eventually I was able to make it work, it expended a lot time and was much more than required for this project.  However, I will keep it in mind for more detailed projects in the future.  RequestMapping was a very handy tool I will certainly use in future projects.  

While I initially planned to implement more front-end design, I simply used too much time on the back end to have more than a spartan client-side.  Given another day, this project's front-end would have had much better aesthetic appeal.  All in all, this was a challenging project, providing much growth.  
