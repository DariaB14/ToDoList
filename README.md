## ToDo List 

Веб-приложение для управления задачами с реализацией CRUD операций и поддержкой пагинации. Приложение построено на Spring Framework с использованием Hibernate ORM и MySQL.

## Технологический стек: 
* Backend: Spring MVC, Spring ORM, Spring Transaction Management
* DB: MySQL, Hibernate ORM, HikariCP 
* Frontend: Thymeleaf, Bootstrap 5
* Сборка: Maven
* Логирование: Log4j, SLF4J
* Прочее: Lombok,Apache Tomcat 9

## Архитектурные особенности
* MVC: Четкое разделение Model, View, Controller
* Многоуровневая архитектура: Controller → Service → DAO → DB
* Внедрение зависимостей: Spring IoC
* Транзакционность: @EnableTransactionManagement
* ORM: Hibernate для маппинга сущностей

## Настройки БД: 
1. Запустите MySQL Server
2. Создайте БД:  
   CREATE DATABASE todo;
3. Измените параметры подключения к БД в src/main/resources/application.properties. 

## Запуск:
1. Импортируйте как Maven-проект в IntelliJ IDEA, Eclipse и др.
2. Добавьте локальный сервер Tomcat 9, настройте артефакт для деплоя. 
3. Запустите приложение.
4. Перейдите по адресу: http://localhost:8080/tasks 

