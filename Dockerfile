FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
COPY prueba-0.0.1-snapshot.jar app.jar
RUN sh -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","-Xdebug","-Xrunjdwp:server=y,transport=dt_socket,suspend=n","/app.jar"]