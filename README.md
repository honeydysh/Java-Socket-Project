▎Socket Connection in Java (Client/Server)

Welcome to the Socket Connection in Java project! This project demonstrates how to establish a simple client-server communication using Java's socket programming. It provides a basic framework that you can expand upon for more complex applications.

▎Table of Contents

• Features

• Technologies Used

• Getting Started

  • Prerequisites

  • Installation

• Usage

  • Running the Server

  • Running the Client

• Code Structure

• Examples

• Contributing

• License

▎Features

• Simple client-server architecture

• Real-time communication

• Easy to understand and extend

• Basic error handling

▎Technologies Used

• Java SE

• Sockets (java.net package)

▎Getting Started

▎Prerequisites

Make sure you have the following installed:

• Java Development Kit (JDK) 8 or later

• An IDE (like IntelliJ IDEA, Eclipse, or NetBeans) or a text editor

• Basic understanding of Java programming

▎Installation

1. Clone the repository:
      git clone https://github.com/honeydysh/socket-connection-java.git
   

2. Navigate to the project directory:
      cd socket-connection-java
   

▎Usage

▎Running the Server

1. Open the Server.java file.

2. Compile the server code:
      javac Server.java
   

3. Run the server:
      java Server
   

4. The server will start and listen for incoming connections on port 12345.

▎Running the Client

1. Open the Client.java file.

2. Compile the client code:
      javac Client.java
   

3. Run the client:
      java Client
   

4. The client will connect to the server and you can start sending messages.

▎Code Structure

socket-connection-java/
├── Server.java       // Server-side implementation
├── Client.java       // Client-side implementation
└── README.md         // Project documentation


▎Examples

Server Output:
Server started. Waiting for clients...
Client connected: /127.0.0.1
Received: Hello from client!


Client Output:
Connected to the server.
Enter message: Hello from client!



