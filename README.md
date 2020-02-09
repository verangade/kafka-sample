# kafka-sample

Kafka comprehensive Guide
https://www.youtube.com/watch?v=JalUUBKdcA0


install kafaka

https://kafka.apache.org/downloads.html

Extarxt it to folder


sudo nano .bashrc 

add kafka path there

export PATH=/home/programs/kafka_2.11-2.3.0/bin:$PATH 

now can access kafka from anywhere in terminal

kafka-topics.sh


Need to create directories to hold kafka data.
-------------------------------------------------

Inside kafka directory

/kafka_2.11-2.3.0

mkdir data

mkdir data/zookeeper


Set zookeeper directory in config

nano config/zookeeper.properties

dataDir=/home/xxxx/kafka/data/zookeeper

First Need to run zookeeper server
------------------------------------

zookeeper-server-start.sh config/zookeeper.properties


Need create directory to hold kafka data
-----------------------------------------
mkdir data/kafka

nano config/server.properties 

log.dirs=/home/xxxxxx/kafka_2.11-2.3.0/data/kafka

Start Kafka
-------------

kafka-server-start.sh config/server.properties


To Create Topic
--------------------------

kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic test

To Consume a topic
--------------------------

kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic test --from-beginning




