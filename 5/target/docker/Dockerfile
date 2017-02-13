FROM dockerfile/java:oracle-java8

VOLUME /tmp
ADD 5.jar /opt/5/
EXPOSE 8080
WORKDIR /opt/5/
CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-Xms512m", "-Xmx1g", "-jar", "5.jar"]
