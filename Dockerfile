FROM adoptopenjdk:11-jre-hotspot
EXPOSE 8080
ADD target/github-action.jar github-action.jar
ENTRYPOINT ["java","-jav","/github-action.jar"]