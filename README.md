# commandPattern

**A simple java program that demonstrates the concept of Design Patterns for a Central Hub that controls multiple devices** <br>

*Note*: This project is a seatwork for my SoftEng subject. I was instructed to make a program for a Central Hub. See instructions at the bottom.


---

<br>

## This Contains
📁 commandPattern <br>
- `ViewerApp.java` : Contains the main method of the project. Instantiates an example of an `CentralHub` object.
- `CentralHub.java` : Has one constructor to start user selection of devices / add devices
- `Device.java` : An abstract class that is implemeneted by `Tv`,`Light`, and `Thermostat`.
- `DeviceDA.java` : Data Accessor for `Device.java`; see `Device.csv`
- `Command.java` : An interface for execute, on and off commands
- `Tv`,`Light`, `Thermostat`. : extends `Device`, implements `Commands`

<br>

## Screenshots

#### 💾 Sample <br>
: `class.java`, details. <br><br>
![main](img)
<br>

## UML

![main](img)


## SW Instructions

>Smart Home Automation
>
>Imagine you're building a smart home automation system where various devices (lights, thermostat, music player, etc.) can be controlled remotely using a central hub or app. Each device has different functionalities, but you want to create a unified and flexible control mechanism.
>
>Design a system that allows you to control multiple smart home devices with ease. Your goal is to create a solution where:
>
>You can control a variety of devices from a central hub or app, sending commands like "Turn On," "Turn Off," "Increase Temperature," "Decrease Volume," etc.
>Each device has unique actions associated with these commands. For example, turning on the lights might involve changing their brightness level, while turning on the music player may involve playing a specific playlist.
>New devices can be seamlessly integrated into the system without modifying existing code. You want to ensure that adding a new device doesn't require changes to the central control logic.
>Devices can be controlled without the central hub or app needing to understand the internal workings of each device. It should send high-level commands without needing low-level details.
>Your challenge is to apply a design pattern that provides a flexible and scalable way to control a variety of smart home devices, ensuring that new devices can be added without disrupting the existing system's functionality.
>
>In your solution you must provide the following in your Github link account:
>
>  Problem statement (description of the problem. Just copy what is stated here.)
>  UML Class Diagram
>  Uploaded java codes for the solution.







