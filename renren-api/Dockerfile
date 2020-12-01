FROM harbor.jd.com/jpipe/centos7.5-java:1.8-maven3.5.4
EXPOSE 8081

VOLUME /tmp
ADD renren-api.jar /app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-jar","/app.jar"]
