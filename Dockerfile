FROM java:8
VOLUME /tmp
ADD target/ITERATIONS*.jar ITERATIONS.jar
RUN sh -c 'touch /ITERATIONS..jar'
ENV JAVA_OPTS="-Xmx256m -Xms128m"
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /ITERATIONS.jar"]
