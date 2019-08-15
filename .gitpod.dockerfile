FROM gitpod/workspace-full:latest

### Java & Maven ###
USER root
RUN apt-get update && apt-get install -y \
        openjdk-11-jdk \
    && apt-get clean && rm -rf /var/lib/apt/lists/* /tmp/*

ARG MAVEN_VERSION=3.5.4
ENV MAVEN_HOME=/usr/share/maven
ENV PATH=$MAVEN_HOME/bin:$PATH
RUN mkdir -p $MAVEN_HOME \
    && curl -fsSL https://apache.osuosl.org/maven/maven-3/$MAVEN_VERSION/binaries/apache-maven-$MAVEN_VERSION-bin.tar.gz \
        | tar -xzvC $MAVEN_HOME --strip-components=1