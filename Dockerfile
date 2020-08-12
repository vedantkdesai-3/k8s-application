FROM maven:latest

RUN useradd -m -u 1000 -s /bin/bash jenkins

RUN yum –y install openssh-clients