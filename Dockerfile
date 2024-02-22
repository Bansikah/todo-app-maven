FROM openjdk:17

LABEL maintainer="tandapnoelbansikah@gmail.com"
LABEL application="todo-app"

WORKDIR /app

COPY target/todo-app-1.0-SNAPSHOT.jar .
COPY ./run.sh  .
RUN chmod +u run.sh

CMD [ "sh","run.sh" ]