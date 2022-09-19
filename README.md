`mvn clean install` from the root of the project.


---
## Fixed
Per [spring-graphql/issues/489](https://github.com/spring-projects/spring-graphql/issues/489#issuecomment-1249089331) changing `spring.graphql.schema.locations` to `classpath*:graphql/**/` caused schema files in animals module to be picked up.

---
## Original Issue

Only works when you move the `schema.graphqls` from the `animal` module to the `app` module.
![](img/Screenshot from 2022-09-15 16-46-39_2.png)

Working:

![](img/Screenshot from 2022-09-15 17-14-23.png)

![](img/Screenshot from 2022-09-15 17-14-10.png)
