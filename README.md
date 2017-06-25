# StudentManagementSystem Update on 2017.6.24
## Simple introduction
#### Login
![login](https://github.com/hizhuzhan/StudentManagementSystem/raw/master/img/login.png)
#### Login_failure
![Login_failure](https://github.com/hizhuzhan/StudentManagementSystem/raw/master/img/Login_failure.png)
#### Login_success
![Login_success](https://github.com/hizhuzhan/StudentManagementSystem/raw/master/img/Login_success.png)
#### Students
![Students](https://github.com/hizhuzhan/StudentManagementSystem/raw/master/img/Students.png)
#### Students_add
![Students_add](https://github.com/hizhuzhan/StudentManagementSystem/raw/master/img/Students_add.png)
#### Students_add_success
![Students_add_success](https://github.com/hizhuzhan/StudentManagementSystem/raw/master/img/Students_add_success.png)
#### students_queryBySid
![students_queryBySid](https://github.com/hizhuzhan/StudentManagementSystem/raw/master/img/students_queryBySid.png)
#### Students_queryBySid_failure
![Students_queryBySid_failure](https://github.com/hizhuzhan/StudentManagementSystem/raw/master/img/Students_queryBySid_failure.png)
#### Students_queryBySid_success
![Students_queryBySid_success](https://github.com/hizhuzhan/StudentManagementSystem/raw/master/img/Students_queryBySid_success.png)
## StudentManagementSystem in
   * Java version "1.7" <br>
   * Tomcat version "7.0" <br>
   * Mysql version "5.6.36" <br><br>
   * JUnit version "4.0" <br>
   * Struts version "2.3.4" <br>
   * Hibernate version "4.3.11.Final" <br>
   * Mysql-JDBC version "5.1.42" <br>
## StudentManagementSystem attention
#### 1. 修改Mysql用户名与密码
The path: StudentManagementSystem/src/hibernate.xml <br>
change: 
```
<property name="connection.username"> (Your Mysql Connection Username)</property>
<property name="connection.password"> (Your Mysql Connection Password) </property>
<property name="connection.url">jdbc:mysql://localhost:3306/ (Your DateBase name) </property>
```
#### 2. 创建表
The path： StudentManagementSystem/test/entity/TestStudents.java <br>
运行方法testSchemaExport(): Run As JUnit Test <br>
###### 注：如果遇到错误请仔检查自己的数``据库账号密码以及数据库名称``，方法执行成功之后会在数据库中生成两个表，分别为：``students(表1)``、``users(表2)``，顾名思义，students表中存放学生数据，users中存放登陆信息，此系统暂时不支持创建用户，请自行在user表中输入自己定义的用户名以及密码。


#### 3. 添加测试数据
The path： StudentManagementSystem/test/entity/TestStudents.java <br>
运行方法testSaveStudents(): Run As JUnit Test <br>
###### 注：此方法会在student中创建``3条学生信息``


      
