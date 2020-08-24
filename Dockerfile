FROM maven:3.6.3-jdk-8
COPY ./ ./
RUN mvn clean package
CMD ["java" , "-jar" , "-Dspring.profiles.default=sit" , "target/queue-admin-0.1.20.80-SNAPSHOT.jar"]