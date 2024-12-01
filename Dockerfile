FROM eclipse-temurin:21
RUN mkdir /opt/app
COPY build/libs/DisplayResolution-0.0.1-SNAPSHOT.jar /opt/app
CMD ["java", "-jar", "/opt/app/DisplayResolution-0.0.1-SNAPSHOT.jar"]
