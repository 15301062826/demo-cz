FROM 114.67.237.112/jpipe/centos7.5-java:1.8-maven3.5.4
EXPOSE 8080

VOLUME /tmp
ADD renren-admin.jar /app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-jar","/app.jar","--spring.profiles.active=test"]