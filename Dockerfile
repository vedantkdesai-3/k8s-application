FROM maven:latest

RUN useradd -m -u 1000 -s /bin/bash jenkins

RUN mkdir -p /tmp/maven


RUN yum install openssh-clients -y
