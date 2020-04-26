# JspCourse



JSP course for practice and improve java programming skills

With this aplication you can register, delete, and modify user's personal informations.

Application developed with JSP, Servlets and java 8


#1° Step Create the schema on Mysql
Create the schema cursojsp

#2º Step create the table user 

create table usuario( 
	id INT NOT NULL AUTO_INCREMENT, 
	login VARCHAR(255), 
	senha VARCHAR(255),
	nome VARCHAR(255),
	UNIQUE KEY unique_id (id) 
 );
 
 #3° Step insert an initial user into the bank that allows u to login
 
  insert into usuario values (1,'admin','admin','admin');
  
#4º Step after login enjoy it :)
 

