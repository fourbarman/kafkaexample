# Kafka example

This project is based on [JDK 17](https://www.oracle.com/java/technologies/javase-downloads.html#JDK17) and uses
[maven](https://maven.apache.org/).
Also, to run this app You need Kafka [Kafka 2.13-3.7.0](https://www.oracle.com/java/technologies/javase-downloads.html#JDK17)

### articles
Application generates 100 messages and sends it to Kafka. Consumer catches it and prints to console.

### build and run
 1. Run Zabbix  
   `bin/zookeeper-server-start.sh config/zookeeper.properties`
 2. Run Kafka service  
   `bin/kafka-server-start.sh config/server.properties`
 3. Run application
   
#### Contacts
Feel free for contacting me:
- Telegram: @fourbarman.