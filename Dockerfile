FROM adoptopenjdk/maven-openjdk8-openj9:latest

RUN mkdir -p /apps/mplay/ubs_common

COPY . /apps/mplay/ubs_common

WORKDIR /apps/mplay/ebet/ubs_common

RUN mvn clean install

#ENTRYPOINT ["mvn","clean","install"]