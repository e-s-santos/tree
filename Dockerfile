from openjdk:21-ea-17-jdk
RUN mkdir /apps/code 
WORKDIR /apps/code 
#COPY /tmp/tree-0.0.1-SNAPSHOT.jar .  
entrypoint while [ : ];do  echo "teste" ; done 