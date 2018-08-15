### ================= Dockerfile =========
# vert.x docker example using a Java verticle packaged as a fatjar
# To build:
# docker build -t folio-hello-module .
# To run:
# docker run -t -i -p 8080:8080 ebook-module
## #
FROM java:8
ENV VERTICLE_FILE Ebook-fat.jar
# Set the location of the verticles
ENV VERTICLE_HOME /usr/verticles
EXPOSE 8080
# Copy your fat jar to the container
COPY target/ /module.jar
# Launch the verticle
WORKDIR $VERTICLE_HOME
ENTRYPOINT ["java", "-jar", "module.jar"]
