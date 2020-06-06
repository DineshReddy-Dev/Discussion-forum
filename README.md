//abd
# spring-boot-forum 

### Backend 
- Spring Boot 1.5.5
- Spring Security 4
- Mybatis(mybatis-spring-boot-starter 1.3.1)

### Frontend 
- Thymeleaf
- Bootstrap
- jQuery
- Chart.js
- bootstrap-select
- daterangepicker

### Build Tool 
- Maven 3.3.9

### Features
- Content: post, comment, category, pagination, comment count badge, views, form valdiation
- User:roles, profile, avatar, email confirmation
- Admin: dashboard, charts, post/category management

# How It Works 

### Database Setup
Before deployment, please make sure MySQL database is up and running:

- Default schema name is `db_springboot_forum`
- Default username is `root` 
- Default password is `root`

You can also edit database configuration in `src/main/resources/application.properties` on your own.

### STMP Email Service
STMP Email service configuration is in `src/main/resources/application.properties`. You are encouraged to use your own STMP service, but you are also welcome to use mine for testing purpose.

### Run with Maven:
```
git clone https://github.com/qingwenwei/spring-boot-forum.git
cd spring-boot-forum
mvn spring-boot:run
```
Server can be accessed on http://localhost:8080.

# Screenshots 
### Homepage 
![](screenshots/homepage.png)

### Post Management 
![](screenshots/posts-manage.png)

### User Profile 
![](screenshots/profile-edit.png)

### Charts 
![](screenshots/stats.png)

### Special Thanks 
